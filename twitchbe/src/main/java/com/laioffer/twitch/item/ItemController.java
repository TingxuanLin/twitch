package com.laioffer.twitch.item;

import com.laioffer.twitch.model.TypeGroupedItemList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lintingxuan
 * @create 2024-11-24 3:49 PM
 */
@RestController
public class ItemController {


    private final ItemService itemService;


    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }


    @GetMapping("/search")
    public TypeGroupedItemList search(@RequestParam("game_id") String gameId) {
        return itemService.getItems(gameId);
    }
}

