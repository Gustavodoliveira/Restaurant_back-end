package com.AhJin.restaurant.domain.customer;

import java.util.List;
import java.util.UUID;

public interface CustomerRepository {

  Customer save(Customer customer);

  Customer findById(UUID id);

  List<Customer> findAll();

  Void deleteById(UUID id);

}
