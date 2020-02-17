
package com.company.agrobusiness.controller;

import com.company.agrobusiness.document.Item;
import com.company.agrobusiness.service.IItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/item")
public class ItemController {

    private IItemService itemService;

    @Autowired
    public ItemController(IItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<String> addItem(@RequestBody Item itemDto){
        System.out.println("+++++++++++++");
        System.out.println("Controller"+ itemDto);
        Mono<Item> response =  itemService.addItem(itemDto);
        System.out.println("Response\n");

        response.subscribe(System.out::println);
        return Mono.just("Done");
    }

}
