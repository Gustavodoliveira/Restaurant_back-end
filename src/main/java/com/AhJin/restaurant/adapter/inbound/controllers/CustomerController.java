package com.AhJin.restaurant.adapter.inbound.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AhJin.restaurant.adapter.outbound.repositories.customer.CustomerRepositoryImpl;
import com.AhJin.restaurant.application.services.CustomerService;
import com.AhJin.restaurant.domain.customer.Customer;
import com.AhJin.restaurant.domain.customer.CustomerRepository;
import com.AhJin.restaurant.domain.customer.DtoCustomerResponse;
import com.AhJin.restaurant.domain.customer.DtoCustomerRegister;

@RestController
@RequestMapping("/customer")
public class CustomerController {

  @Autowired
  CustomerRepositoryImpl customerRepositoryImpl;

  @Autowired
  CustomerService customerService;

  @PostMapping("/save")
  public ResponseEntity saveEntity(@RequestBody DtoCustomerRegister data) throws Exception {
    try {
      DtoCustomerResponse resp = customerService.SaveUser(data);
      return ResponseEntity.ok().body(resp);
    } catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }

  }
}
