package com.AhJin.restaurant.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AhJin.restaurant.adapter.outbound.entities.MongoCategoryEntity;
import com.AhJin.restaurant.adapter.outbound.entities.MongoCustomerEntity;
import com.AhJin.restaurant.adapter.outbound.repositories.customer.CustomerRepositoryImpl;
import com.AhJin.restaurant.adapter.outbound.repositories.customer.MongoCustomerRepository;
import com.AhJin.restaurant.domain.customer.Customer;
import com.AhJin.restaurant.domain.customer.DtoCustomerResponse;
import com.AhJin.restaurant.domain.customer.DtoCustomerRegister;

@Service
public class CustomerService {

  @Autowired
  private Jwt jwt;

  @Autowired
  private CustomerRepositoryImpl customerRepositoryImpl;

  public DtoCustomerResponse SaveUser(DtoCustomerRegister data) throws Exception {
    try {
      Customer customer = new Customer(data);
      boolean isPropertyNullOrEmpty = this.hasNullOrEmptyProperty(customer);
      if (isPropertyNullOrEmpty == true)
        throw new Exception("Há algum campo vazio, verique e tente novamente");
      MongoCustomerEntity CustomerEntity = customerRepositoryImpl.save(customer);
      DtoCustomerResponse resp = new DtoCustomerResponse(CustomerEntity, "save user");
      return resp;
    } catch (Exception e) {
      throw new Exception(e.getMessage());
    }
  }

  private boolean hasNullOrEmptyProperty(Customer customer) {
    if (isNullOrEmpty(customer.getName()))
      return true;
    if (isNullOrEmpty(customer.getEmail()))
      return true;
    if (isNullOrEmpty(customer.getPassword()))
      return true;
    return false;

  }

  public static boolean isNullOrEmpty(String s) {
    return s == null || s.trim().isEmpty();
  }
}
