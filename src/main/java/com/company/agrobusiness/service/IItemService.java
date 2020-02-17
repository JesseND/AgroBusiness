
package com.company.agrobusiness.service;

import com.company.agrobusiness.document.Item;
import reactor.core.publisher.Mono;

public interface IItemService {
    Mono<Item> addItem(Item itemDto);
}
