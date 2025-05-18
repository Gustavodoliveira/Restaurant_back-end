package com.AhJin.restaurant.domain.customer;

import java.util.UUID;

import com.AhJin.restaurant.domain.role.Roles;

public class Customer {

  String id;

  String name;

  String email;

  String password;

  Roles role;

  public String getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String getEmail() {
    return this.email;
  }

  public String getPassword() {
    return this.password;
  }

  public Roles getRole() {
    return this.role;
  }

  public Void setName(String name) {
    this.name = name;
    return null;
  }

  public Void setEmail(String email) {
    this.email = email;
    return null;
  }

  public Void setPassword(String password) {
    this.password = password;
    return null;
  }

  public Void setRole(Roles role) {
    this.role = role;
    return null;
  }

  public Customer() {
  }

  public Customer(String name, String email, String password) {
    this.name = name;
    this.email = email;
    this.password = password;
  }

  public Customer(DtoCustomerRegister data) {
    this.name = data.name();
    this.email = data.email();
    this.password = data.password();
    this.role = data.role();
  }

}
