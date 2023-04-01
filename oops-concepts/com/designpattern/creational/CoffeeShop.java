package com.designpattern.creational;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {

	String shopName;
	List<Coffee> coffeeTypes = new ArrayList<>();
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Coffee> getCoffeeTypes() {
		return coffeeTypes;
	}
	public void setCoffeeTypes(List<Coffee> coffeeTypes) {
		this.coffeeTypes = coffeeTypes;
	}
	@Override
	public String toString() {
		return "CoffeeShop [shopName=" + shopName + ", coffeeTypes=" + coffeeTypes + "]";
	}
	
}
