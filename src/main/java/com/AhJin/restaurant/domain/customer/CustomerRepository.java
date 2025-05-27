package com.AhJin.restaurant.domain.customer;

import java.util.List;
import java.util.UUID;

import com.AhJin.restaurant.adapter.outbound.entities.MongoCustomerEntity;

public interface CustomerRepository {

  MongoCustomerEntity save(Customer customer);

  Customer findById(UUID id);

  List<Customer> findAll();

  Void deleteById(UUID id);

}
