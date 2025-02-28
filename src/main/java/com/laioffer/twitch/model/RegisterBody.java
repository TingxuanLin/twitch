package com.laioffer.twitch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author lintingxuan
 * @create 2024-12-01 3:21 PM
 */
public record RegisterBody(
        String username,
        String password,
        @JsonProperty("first_name") String firstName,
        @JsonProperty("last_name") String lastName
) {
}

