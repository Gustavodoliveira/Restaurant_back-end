package com.AhJin.restaurant.domain.customer;

import com.AhJin.restaurant.adapter.outbound.entities.MongoCustomerEntity;

public record CustomerResponseDto(MongoCustomerEntity customerEntity, String resp) {

}
