package com.AhJin.restaurant.domain.restaurant;

import java.util.List;

import com.AhJin.restaurant.domain.food.Food;

public class Restaurant {
  String id;

  String name;

  String cnpj;

  String customer_ID;

  List<Food> menu;

  public String getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String getCnpj() {
    return this.cnpj;
  }

  public String getCustomerId() {
    return this.customer_ID;
  }

  public void setName(String name) {
    this.name = name;
  }
}
