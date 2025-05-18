package com.AhJin.restaurant.infrastructure.config;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class MongoBean {

  private final MongoTemplate mongoTemplate;

  public MongoBean(MongoTemplate mongoTemplate) {
    this.mongoTemplate = mongoTemplate;
  }
}
