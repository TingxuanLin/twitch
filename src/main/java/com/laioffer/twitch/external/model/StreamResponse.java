package com.laioffer.twitch.external.model;

import java.util.List;

/**
 * @author lintingxuan
 * @create 2024-11-23 10:57 AM
 */
public record StreamResponse(
        List<Stream> data
) {
}
