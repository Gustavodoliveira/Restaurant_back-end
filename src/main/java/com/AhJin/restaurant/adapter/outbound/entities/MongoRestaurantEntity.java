package com.AhJin.restaurant.adapter.outbound.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "Restaurant")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MongoRestaurantEntity {
  @Id
  String id;

  String name;

  String cnpj;

  List<MonfoFoodEntity> menu;

  String customer_id;
}
