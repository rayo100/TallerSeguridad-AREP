/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.securespark;

import static spark.Spark.*;
/**
 *
 * @author cesar.vasquez-m
 */
public class SecureSpark {

    public static void main(String[] args) {
        port(getPort());
        //API: secure(keystoreFilePath, keystorePassword, truststoreFilePath, truststorePassword); 
        secure("keystores/ecikeystore.p12", "1tapama6", null, null);
        get("hello", (req,res) -> "Hello!");
    }
    
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000;
    }
}
