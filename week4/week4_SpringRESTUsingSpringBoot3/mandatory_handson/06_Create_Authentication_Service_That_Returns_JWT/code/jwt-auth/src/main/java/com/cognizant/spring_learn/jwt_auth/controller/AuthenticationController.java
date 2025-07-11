package com.cognizant.spring_learn.jwt_auth.controller;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        LOGGER.info("START - /authenticate");
        LOGGER.debug("Authorization Header: {}", authHeader);

        String username = getUser(authHeader);
        LOGGER.debug("Extracted Username: {}", username);

        String token = generateJwt(username);
        LOGGER.debug("Generated JWT Token: {}", token);

        Map<String, String> map = new HashMap<>();
        map.put("token", token);

        LOGGER.info("END - /authenticate");
        return map;
    }

    private String getUser(String authHeader) {
        LOGGER.debug("Decoding Authorization header to get user");

        try {
            String encodedCredentials = authHeader.substring("Basic ".length());
            byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials);
            String credentials = new String(decodedBytes);
            LOGGER.debug("Decoded credentials: {}", credentials);

            String[] values = credentials.split(":", 2);
            if (values.length == 2) {
                return values[0];
            } else {
                LOGGER.warn("Invalid credentials format, unable to extract username.");
                return null;
            }

        } catch (IllegalArgumentException e) {
            LOGGER.error("Failed to decode Authorization header", e);
            return null;
        }
    }

    private String generateJwt(String user) {
        LOGGER.debug("Generating JWT for user: {}", user);

        JwtBuilder builder = Jwts.builder();
        builder.setSubject(user);
        builder.setIssuedAt(new Date());
        builder.setExpiration(new Date(System.currentTimeMillis() + 1200000));
        builder.signWith(SignatureAlgorithm.HS256, "00112233445566778899aabbccddeeff00112233445566778899aabbccddeeff");

        String token = builder.compact();
        LOGGER.debug("JWT Token created successfully");
        return token;
    }
}
