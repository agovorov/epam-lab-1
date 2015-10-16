/**
 * Taks number 9 - Planes
 * @author Andrey Govorov
 * @date 09.10.2015
 * @version 1
 
 	9.	Авиакомпания. Определить иерархию самолетов. Создать авиакомпанию. 
 	Посчитать общую вместимость и грузоподъемность. 
 	Провести сортировку самолетов компании по дальности полета. 
 	Найти самолет в компании, соответствующий заданному диапазону параметров потребления горючего.
 */

package com.epam.lab1;

import java.util.ArrayList;

import com.epam.lab1.entity.Aircraft;
import com.epam.lab1.tools.AirCompany;

public class Main {	
	public static void main(String[] args) {
		AirCompany aircompany = new AirCompany();

		System.out.println("Create planes:");

		// Creating new planes
		aircompany.createPlanes(5);
		
		// Display all planes
		aircompany.displayPlanes();
		System.out.println("Planes count: " + aircompany.getPlanesCount());
		
		// Display total info
		System.out.println("\nTotal passenger: " + aircompany.getTotalPassengers() + " persons.");
		System.out.println("Total baggage: " + aircompany.getTotalBaggage() + " kg\n");

		// Sort by distance
		System.out.println("Distance sort: ");
		aircompany.sort();
		aircompany.displayPlanes();

		// Fuel consumption filter
		int min = 50;
		int max = 90;
		System.out.println("\nFiltered list (Fuel consumption: "+min+"-"+max+"): ");
		ArrayList<Aircraft> filtered_planes = aircompany.filter(min, max);
		aircompany.displayPlanes(filtered_planes);
	}
}
