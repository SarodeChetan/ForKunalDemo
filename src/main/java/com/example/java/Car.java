package com.example.java;

public class Car {
	
	int noOfwheel ;
	String colour ;
	int noOFairBag ;
	int engineCapacity ; 
	
	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.creatCar(4, "red", 6, 800);
	
		System.out.println("noOfwheel "+c.noOfwheel);
		System.out.println("colour "+c.colour);
		System.out.println("noOFairBag "+c.noOFairBag);
		System.out.println("engineCapacity "+c.engineCapacity);
		
		Car d = new Car();
		
		System.out.println("from d refer" +d.noOfwheel);

	}
	public void creatCar(int wheel , String clr, int airbag, int engcap) {
		 noOfwheel=wheel;
		 
		 colour=clr;
		 noOFairBag  =airbag;
		 engineCapacity = engcap;
		 
	  
	}
		 
	
	
	

}
