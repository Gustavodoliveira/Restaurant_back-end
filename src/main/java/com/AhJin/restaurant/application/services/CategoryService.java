package com.AhJin.restaurant.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AhJin.restaurant.adapter.outbound.entities.MongoCategoryEntity;
import com.AhJin.restaurant.adapter.outbound.repositories.category.CategoryRepositoryImpl;
import com.AhJin.restaurant.domain.Category.Category;
import com.AhJin.restaurant.domain.Category.DtoCategoryRegister;
import com.AhJin.restaurant.domain.Category.DtoResponseCategory;

@Service
public class CategoryService {

  @Autowired
  CategoryRepositoryImpl categoryRepositoryImpl;

  public DtoResponseCategory save(DtoCategoryRegister data) throws Exception {
    try {
      Category category = new Category(data);
      MongoCategoryEntity entity = this.categoryRepositoryImpl.saveCategory(category);
      DtoResponseCategory resp = new DtoResponseCategory(entity, "Category create Success");
      return resp;
    } catch (Exception e) {
      throw new Exception(e.getMessage());
    }
  }

}
