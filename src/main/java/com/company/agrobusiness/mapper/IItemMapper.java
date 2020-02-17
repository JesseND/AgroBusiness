package com.company.agrobusiness.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface IItemMapper {

    com.company.agrobusiness.document.Item toEntity(Item itemDto);
    Item toDomain (com.company.agrobusiness.document.Item item);
}
