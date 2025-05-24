package com.AhJin.restaurant.adapter.outbound.entities;

import java.io.File;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "Food")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MonfoFoodEntity {
  @Id
  String id;

  String name;

  String ingredientes;

  String category_id;

  String restaurant_id;

  String image_Name;
}
