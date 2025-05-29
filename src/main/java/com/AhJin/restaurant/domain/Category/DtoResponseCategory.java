package com.AhJin.restaurant.domain.Category;

import com.AhJin.restaurant.adapter.outbound.entities.MongoCategoryEntity;

public record DtoResponseCategory(MongoCategoryEntity entity, String resp) {

}
