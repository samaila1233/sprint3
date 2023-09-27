package com.sprint3.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprint3.project.entities.Items;

public interface ItemsRepo extends JpaRepository<Items,Integer>{
   
}
