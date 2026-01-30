package com.webtrak.user.repository;

import com.webtrak.user.entity.Role;
import com.webtrak.user.enums.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByRoleName(RoleType roleName);
}
