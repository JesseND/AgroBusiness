package com.company.agrobusiness.dto;

import com.company.agrobusiness.document.Item;
import lombok.Data;

import java.util.List;

@Data
public class SuggestionItems {

   private Item viewedItem;
   private List<Item> itemSuggestionList;
}
