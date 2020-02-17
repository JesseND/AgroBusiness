
package com.company.agrobusiness.service;

import com.company.agrobusiness.adaptor.IItemAdaptor;
import com.company.agrobusiness.document.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ItemService implements IItemService {

    private  IItemAdaptor itemAdaptor;

    @Autowired
    public ItemService(IItemAdaptor itemAdaptor) {
        this.itemAdaptor = itemAdaptor;
    }

    @Override
    public Mono<Item> addItem(Item itemDto) {
        System.out.println("Service\n"+ itemDto);
        return itemAdaptor.saveItem(itemDto);
    }
}
