package com.AhJin.restaurant.adapter.outbound.repositories.customer;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.AhJin.restaurant.adapter.outbound.entities.MongoCustomerEntity;

@Repository
public interface MongoCustomerRepository extends MongoRepository<MongoCustomerEntity, UUID> {
  public MongoCustomerEntity findByEmail(String email);
}
