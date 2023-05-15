package com.defaultandstatic;

public class Car implements Vehicle {

    private String brand;
    
    
    
    @Override
    public String getBrand() {
        return brand;
    }
    
    @Override
    public String speedUp() {
        return "The car is speeding up.";
    }

	@Override
	public String slowDown() {
	
		return null;
	}
    
 
   
}
