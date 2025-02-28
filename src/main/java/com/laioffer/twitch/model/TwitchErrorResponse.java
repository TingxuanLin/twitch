package com.laioffer.twitch.model;

/**
 * @author lintingxuan
 * @create 2024-12-01 2:20 PM
 */
public record TwitchErrorResponse(
        String message,
        String error,
        String details
) {
}

