package com.laioffer.twitch.db.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 * @author lintingxuan
 * @create 2024-11-30 10:48 AM
 */
@Table("users")
public record UserEntity(
        @Id Long id,
        String username,
        String firstName,
        String lastName,
        String password
) {
}
