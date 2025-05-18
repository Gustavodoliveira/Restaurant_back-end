package com.AhJin.restaurant.domain.customer;

import com.AhJin.restaurant.domain.role.Roles;

public record DtoCustomerRegister(String name, String email, String password, Roles role) {

}
