package com.AhJin.restaurant.adapter.outbound.repositories.category;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.AhJin.restaurant.adapter.outbound.entities.MongoCategoryEntity;

@Repository
public interface MongoCategoryRepository extends MongoRepository<MongoCategoryEntity, String> {

}
