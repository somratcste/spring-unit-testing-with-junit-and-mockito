package info.somrat.controller;

import info.somrat.service.ItemService;
import info.somrat.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/dummy-item")
    public Item dummyItem() {
        return new Item(1, "Ball", 10, 100);
    }

    @GetMapping("/item-from-business-service")
    public Item itemFromBusinessService() {
        Item item = itemService.retreiveHardcodedItem();
        return item;
    }

    @GetMapping("/all-items-from-database")
    public List<Item> retrieveAllItems() {
        return itemService.retrieveAllItems();
    }
}
