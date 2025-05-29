package com.AhJin.restaurant.adapter.outbound.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.AhJin.restaurant.domain.Category.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "Category")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MongoCategoryEntity {

  @Id
  String id;

  String name;

  public MongoCategoryEntity(Category category) {
    this.id = category.getId();
    this.name = category.getName();
  }
}
