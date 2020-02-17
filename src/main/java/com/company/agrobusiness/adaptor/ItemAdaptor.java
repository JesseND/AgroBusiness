package com.company.agrobusiness.adaptor;

 import com.company.agrobusiness.document.Item;
import com.company.agrobusiness.mapper.IItemMapper;
import com.company.agrobusiness.repository.IItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ItemAdaptor implements IItemAdaptor {

    private  IItemRepository itemRepository;
    private  IItemMapper itemMapper;
@Autowired
    public ItemAdaptor(IItemRepository itemRepository/*, IItemMapper itemMapper*/) {
        this.itemRepository = itemRepository;
//        this.itemMapper = itemMapper;
    }

    @Override
    public Mono<Item> saveItem(Item itemDto) {
        System.out.println("Adaptor\n"+ itemDto);
        return itemRepository.save(itemDto)
;
}


}
