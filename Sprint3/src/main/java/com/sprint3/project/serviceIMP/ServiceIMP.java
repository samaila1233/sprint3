package com.sprint3.project.serviceIMP;

import com.sprint3.project.services.ItemServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint3.project.entities.Items;
import com.sprint3.project.repository.ItemsRepo;

@Service
public class ServiceIMP implements ItemServices {
 
@Autowired
	
private ItemsRepo itemrepo;

public  	Items createItems(Items items) {
 itemrepo.save(items)	;
 
	
	return items;
}

@Override
public Items updateitems(int id, Items item) {
// TODO Auto-generated method stub
Items i = itemrepo.findById(id).get();
i.setName(item.getName());
i.setDesciption(item.getDesciption());
i.setPrice(item.getPrice());
Items i1 = itemrepo.save(i);
return i1;
}

@Override
public String deleteItems(int id) {
	// TODO Auto-generated method stub
	itemrepo.deleteById(id );
	return "Items Deleted successfully";
}

@Override
public List<Items> getAllItems() {
	// TODO Auto-generated method stub
	return itemrepo.findAll();
}



}
