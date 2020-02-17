
package com.company.agrobusiness.adaptor;

import com.company.agrobusiness.document.Item;
import reactor.core.publisher.Mono;

public interface IItemAdaptor {
     Mono<Item> saveItem(com.company.agrobusiness.document.Item itemDto);
}
