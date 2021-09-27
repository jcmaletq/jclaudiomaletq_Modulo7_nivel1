package com.vehicles.project;

import java.util.List;
import javax.swing.*;

public class Car extends Vehicle {

	public Car(String plate, String brand, String color) {
		super(plate, brand, color);
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();
		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);
		if (!rightWheel.toString().equals(leftWheel.toString()))
			throw new Exception();
		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}

	@Override
	public String toString() {
		return "Car [plate=" + plate + ", brand=" + brand 
				+ ", color=" + color + " \n"  
				+ ", wheels=" + wheels + "]";
	}
	public static Car pide_datos_coche () {
		String plate,brand,color;
		plate=JOptionPane.showInputDialog("introudce la matricula del coche","plate");
		brand=JOptionPane.showInputDialog("introudce la marca del coche","brand");
		color=JOptionPane.showInputDialog("introudce el color del coche","color");
		
		return new Car(plate,brand,color); 
	}	
}
