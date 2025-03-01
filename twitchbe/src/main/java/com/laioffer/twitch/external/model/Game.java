package com.laioffer.twitch.external.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author lintingxuan
 * @create 2024-11-23 10:55 AM
 */
public record Game(
        String id,
        String name,
        @JsonProperty("box_art_url") String boxArtUrl
) {
}

