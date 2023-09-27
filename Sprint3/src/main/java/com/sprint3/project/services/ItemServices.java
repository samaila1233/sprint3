package com.sprint3.project.services;

import java.util.List;

import com.sprint3.project.entities.Items;

public interface ItemServices {
Items createItems(Items items);
Items updateitems(int id, Items item);
String deleteItems(int id);
List<Items> getAllItems();
}
