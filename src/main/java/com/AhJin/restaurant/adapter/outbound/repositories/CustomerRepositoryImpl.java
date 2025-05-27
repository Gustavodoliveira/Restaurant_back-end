package com.AhJin.restaurant.adapter.outbound.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.AhJin.restaurant.adapter.outbound.entities.MongoCustomerEntity;
import com.AhJin.restaurant.domain.customer.Customer;
import com.AhJin.restaurant.domain.customer.CustomerRepository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

  @Autowired
  private final MongoCustomerRepository mongoCustomerRepository;

  public CustomerRepositoryImpl(MongoCustomerRepository mongoCustomerRepository) {
    this.mongoCustomerRepository = mongoCustomerRepository;
  }

  @Override
  public MongoCustomerEntity save(Customer customer) {
    MongoCustomerEntity customerEntity = new MongoCustomerEntity(customer);
    this.mongoCustomerRepository.save(customerEntity);
    return customerEntity;
  }

  @Override
  public Customer findById(UUID id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findById'");
  }

  @Override
  public List<Customer> findAll() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findAll'");
  }

  @Override
  public Void deleteById(UUID id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
  }

}
