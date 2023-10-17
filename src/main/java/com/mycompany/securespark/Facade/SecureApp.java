/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.securespark.Facade;


import static spark.Spark.*;

/**
 *
 * @author cv100
 */
public class SecureApp {
    public static void main(String[] args) {
        port(getPort());
        secure(getKeyPath(), getKeyPassword(), null, null);
        get("/hello", (req, res) -> "Ha iniciado sesión correctamente.");
    }

    public static Integer getPort() {
        return System.getenv("PORT") != null ? Integer.parseInt(System.getenv("PORT")) : 4567;
    }

    public static String getKeyPath() {
        return System.getenv("KEY-PATH") != null ? System.getenv("KEY-PATH") : "keystores/ecikeystore.p12";
    }

    public static String getKeyPassword() {
        return System.getenv("KEY-PWD") != null ? System.getenv("KEY-PWD") : "1tapama6";
    }
}
