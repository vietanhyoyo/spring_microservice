package com.identity.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.identity.dto.request.RoleRequest;
import com.identity.dto.response.RoleResponse;
import com.identity.entity.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest role);

    RoleResponse toRoleResponse(Role role);
}
