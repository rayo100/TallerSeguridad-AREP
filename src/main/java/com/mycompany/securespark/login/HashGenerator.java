/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.securespark.login;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author cv100
 */
public class HashGenerator {
    public static String generator(String input) {
        byte[] encodedHash = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            encodedHash = messageDigest.digest(input.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        StringBuilder hexStr = new StringBuilder();
        for (byte b: encodedHash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexStr.append('0');
            hexStr.append(hex);
        }

        return hexStr.toString();
    }
}
