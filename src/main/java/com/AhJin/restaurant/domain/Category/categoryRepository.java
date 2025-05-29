package com.AhJin.restaurant.domain.Category;

import java.util.concurrent.ExecutionException;

import com.AhJin.restaurant.adapter.outbound.entities.MongoCategoryEntity;

public interface categoryRepository {
  MongoCategoryEntity saveCategory(Category category) throws Exception;

  MongoCategoryEntity findByName(String name) throws Exception;

  MongoCategoryEntity findById(String id) throws Exception;

  String deleteByID(String id) throws Exception;

}
