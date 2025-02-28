package com.laioffer.twitch.db;

import com.laioffer.twitch.db.entity.UserEntity;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

/**
 * @author lintingxuan
 * @create 2024-11-30 2:20 PM
 */
public interface UserRepository extends ListCrudRepository<UserEntity, Long> {

    List<UserEntity> findByLastName(String lastName);

    List<UserEntity> findByFirstName(String firstName);

    UserEntity findByUsername(String username);

    @Modifying
    @Query("UPDATE users SET first_name = :firstName, last_name = :lastName WHERE username = :username")
    void updateNameByUsername(String username, String firstName, String lastName);
}

