package com.sprint3.project.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity  
public class Items {
  @Id
	int id;
  public Items() {
	super();
	// TODO Auto-generated constructor stub
}
public Items(int id, String name, String desciption, double price) {
	super();
	this.id = id;
	this.name = name;
	this.desciption = desciption;
	this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesciption() {
	return desciption;
}
public void setDesciption(String desciption) {
	this.desciption = desciption;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
String name;
  String desciption;
  double price;
  
	
}
