package com.company.agrobusiness.repository;

import com.company.agrobusiness.document.Item;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IItemRepository extends ReactiveMongoRepository<Item, Long> {
}
