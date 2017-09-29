package com.avalia.learning.java.casting;

public class Main {

	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle bike = new Bike();
		car.drive();
		bike.drive();
//		((Car) car).opendoor();  this csting will allow to call child class method
//		((Car) bike).opendoor(); this will throw classcast exception as we cannot cast sibbiling
		
		processVehicle(car);
		processVehicle(bike);
	}
	
	public static void processVehicle(Vehicle v) {
		if(v instanceof Car){
			((Car) v).opendoor();
		}
		if(v instanceof Bike){
			((Bike) v).sidestand();
		}
	}
}
