package com.AhJin.restaurant.domain.customer;

import com.AhJin.restaurant.adapter.outbound.entities.MongoCustomerEntity;

public record DtoCustomerResponse(MongoCustomerEntity customerEntity, String resp) {

}
