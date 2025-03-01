package com.laioffer.twitch.hello;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author lintingxuan
 * @create 2024-11-21 8:32 PM
 */
public record Person(
        String name,
        String company,
        @JsonProperty("home_address") Address homeAddress,
        Book favoriteBook
) {
}

