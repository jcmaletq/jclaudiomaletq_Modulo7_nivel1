package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;
	}
	@Override
	public String toString() {
		return "Wheel [brand=" + brand   + ", diameter=" + diameter + "]"+ " \n";
	}	
	public static List<Wheel> pide_datos_rueda (String posi) {
		String brand;
		double diameter;
//		brand=JOptionPane.showInputDialog("introudce la marca de la rueda "+posi);
		brand = "brand";
		diameter=Double.parseDouble(JOptionPane.showInputDialog("introudce el diametro de la rueda "+posi));
		Wheel l_Wheel =new Wheel (brand,diameter);
		Wheel r_Wheel =new Wheel (brand,diameter);
		List<Wheel> lista = new ArrayList<>();
		lista.add(r_Wheel);
		lista.add(l_Wheel);
		return lista; 
	   }	
}
