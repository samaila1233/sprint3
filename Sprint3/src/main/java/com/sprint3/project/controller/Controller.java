package com.sprint3.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sprint3.project.entities.Items;
import com.sprint3.project.services.ItemServices;

@RestController
public class Controller {
@Autowired
	ItemServices itemservices;
    @PostMapping("/PostItems")
    public Items createItems(@RequestBody Items items) {
    	return this.itemservices.createItems(items);
    }
    @GetMapping("/getAllItem")
    List<Items>  getAllItem(){
    	return itemservices.getAllItems();
    }
    	@PutMapping("/updateItem/{id}")
    	Items updateItem(@PathVariable int id, @RequestBody Items i) {

    	return itemservices.updateitems(id, i) ;
    	}
    	
    	@DeleteMapping("/deleteItem/{id}")
    	String deleteItem(@PathVariable int id) {
    		return itemservices.deleteItems( id);
    	}
}
