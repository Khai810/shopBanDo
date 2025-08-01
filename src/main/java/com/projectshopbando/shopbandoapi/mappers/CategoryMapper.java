package com.projectshopbando.shopbandoapi.mappers;

import com.projectshopbando.shopbandoapi.dtos.request.CategoryCreateReq;
import com.projectshopbando.shopbandoapi.dtos.response.CategoryRes;
import com.projectshopbando.shopbandoapi.entities.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    Category toCategory(CategoryCreateReq request);


    CategoryRes toCategoryRes(Category category);
}
