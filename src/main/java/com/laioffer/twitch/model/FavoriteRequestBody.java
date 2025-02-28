package com.laioffer.twitch.model;

import com.laioffer.twitch.db.entity.ItemEntity;

/**
 * @author lintingxuan
 * @create 2024-11-30 3:33 PM
 */
public record FavoriteRequestBody(
        ItemEntity favorite
) {}

