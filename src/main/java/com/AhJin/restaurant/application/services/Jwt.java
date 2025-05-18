package com.AhJin.restaurant.application.services;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.AhJin.restaurant.domain.customer.Customer;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;

@Service
public class Jwt {
  @Value("${api.secret.security}")
  private String secret;

  public String generateToken(Customer customer) {
    Algorithm algorithm = Algorithm.HMAC256(secret);
    try {
      String token = JWT.create()
          .withIssuer("cadastro")
          .withSubject(customer.getEmail())
          .withExpiresAt(tokenExpirationTime())
          .sign(algorithm);
      return token;
    } catch (JWTCreationException e) {
      throw new RuntimeException(e.getMessage());
    }
  }

  public String validateToken(String token) {
    try {
      Algorithm algorithm = Algorithm.HMAC256(secret);
      return JWT.require(algorithm)
          .withIssuer("cadastro")
          .build()
          .verify(token)
          .getSubject();
    } catch (JWTVerificationException e) {
      throw new RuntimeException(e.getMessage());
    }
  }

  private Instant tokenExpirationTime() {
    return LocalDateTime.now().plusHours(4).toInstant(ZoneOffset.of("-03:00"));
  }
}
