package com.AhJin.restaurant.domain.role;

public enum Roles {
  ADMIN("admin"),

  USER("user");

  private String role;

  Roles(String role) {
    this.role = role;
  }

}
