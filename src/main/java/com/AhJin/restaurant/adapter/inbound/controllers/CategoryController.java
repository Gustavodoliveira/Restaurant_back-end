package com.AhJin.restaurant.adapter.inbound.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AhJin.restaurant.application.services.CategoryService;
import com.AhJin.restaurant.domain.Category.DtoCategoryRegister;
import com.AhJin.restaurant.domain.Category.DtoResponseCategory;

@RestController
@RequestMapping("/category")
public class CategoryController {

  @Autowired
  CategoryService categoryService;

  @PostMapping("/save")
  public ResponseEntity saveCategory(@RequestBody DtoCategoryRegister data) {

    try {
      DtoResponseCategory resp = this.categoryService.save(data);
      return ResponseEntity.ok().body(resp);
    } catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }

}