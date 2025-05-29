package com.AhJin.restaurant.adapter.outbound.repositories.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.AhJin.restaurant.adapter.outbound.entities.MongoCategoryEntity;
import com.AhJin.restaurant.domain.Category.Category;
import com.AhJin.restaurant.domain.Category.categoryRepository;

@Repository
public class CategoryRepositoryImpl implements categoryRepository {

  @Autowired
  private final MongoCategoryRepository mongoCategoryRepository;

  public CategoryRepositoryImpl(MongoCategoryRepository mongoCategoryRepository) {
    this.mongoCategoryRepository = mongoCategoryRepository;
  }

  @Override
  public MongoCategoryEntity saveCategory(Category category) throws Exception {
    try {
      MongoCategoryEntity categoryEntity = new MongoCategoryEntity(category);
      this.mongoCategoryRepository.save(categoryEntity);
      return categoryEntity;
    } catch (Exception e) {
      throw new Exception(e.getMessage());
    }
  }

  @Override
  public Category findByName(String name) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findByName'");
  }

  @Override
  public Category findById(String id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findById'");
  }

  @Override
  public String deleteByID(String id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteByID'");
  }

}
