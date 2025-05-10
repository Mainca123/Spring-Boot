package com.example.demo.domain.mapper;

import com.example.demo.domain.dto.response.CategoryResponseDTO;
import com.example.demo.domain.entity.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    Category toCategory(CategoryResponseDTO categoryResponseDTO);
    CategoryResponseDTO toCategoryResponse(Category category);
    List<CategoryResponseDTO> toListCategoryResponseDTO(List<Category> categories);
}
