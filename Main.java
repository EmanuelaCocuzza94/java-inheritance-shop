package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Smartphone smartphone1 = new Smartphone("Iphone 13 pro","Apple", 1200, 22.5, "250 gb" );
		
		System.out.println(smartphone1.toString());
		
		
		Televisore televisore1 = new Televisore("Samsung Crystal","Samsung", 750, 22.5, 50.5, true );
		
		System.out.println(televisore1.toString());
		
		
		Cuffie cuffieWirless1 = new Cuffie ("AirPods 3", "Apple", 150, 22.5, "bianche", "cablate");
		
		System.out.println(cuffieWirless1.toString());
			
		
	}
	
}
