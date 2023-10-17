/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.securespark.login;

import static com.mycompany.securespark.Facade.URLReader.trust;
import static com.mycompany.securespark.login.HashGenerator.generator;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import spark.Session;
import static spark.Spark.*;
/**
 *
 * @author cesar.vasquez-m
 */
public class SecureSpark {
    private static final ConcurrentHashMap<String, User> users = new ConcurrentHashMap<>(Map.of(
            "cesar", new User("cesar321", generator("1tapama6")),
           "lupin", new User("lupin123", generator("123456"))
    ));

    public static void main(String[] args) {
        port(getPort());
        //API: secure(keystoreFilePath, keystorePassword, truststoreFilePath, truststorePassword); 
        secure(getKeyPath(), getKeyPassword(), null, null);
        get("/login", ((request, response) -> {
            response.type("text/html");
            return Files.readString(Paths.get("src/main/resources/public/index.html"));
        }));

        post("/login", (request, response) -> {
            String username = request.queryParams("username");
            String password = request.queryParams("password");

            if (users.containsKey(username) && users.get(username).getPassword().equals(generator(password))) {
                Session session = request.session(true);
                session.attribute("username", username);
                trust(getKeyTrustPath(), getKeyPassword());
                response.redirect("https://localhost:4567/hello");
                return null;
            }

            return "Error al ingresar tus credenciales. Verifica por favor!";
        });
    }
    
    
    public static Integer getPort() {
        return System.getenv("PORT") != null ? Integer.parseInt(System.getenv("PORT")) : 5000;
    }
    
    public static String getKeyPath() {
        return System.getenv("KEY-PATH") != null ? System.getenv("KEY-PATH") : "keystores/ecikeystore.p12";
    }

    public static String getKeyTrustPath() {
        return System.getenv("KEY-PATH") != null ? System.getenv("KEY-TRUST-PATH") : "keystores/myTrustStore";
    }

    public static String getKeyPassword() {
        return System.getenv("KEY-PWD") != null ? System.getenv("KEY-PWD") : "1tapama6";
    }
}
