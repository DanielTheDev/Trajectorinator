package com.danielthedev.routes;

import static com.danielthedev.routes.SpeedValue.SpeedUnit.*;
import static com.danielthedev.routes.TimeValue.TimeUnit.*;

public class Test {

	public static void main(String[] args) {
		
		RoutePoint A = new RoutePoint("A");
		RoutePoint B = new RoutePoint("B");
		RoutePoint C = new RoutePoint("C");
		RoutePoint D = new RoutePoint("D");
		
		Route AB = new Route(A, B, new SpeedValue(80, KM_PER_HOUR), new TimeValue(30, MINUTES), new GasUsage(5.25, 100));
		Route BC = new Route(B, C, new SpeedValue(90, KM_PER_HOUR), new TimeValue(20, MINUTES), new GasUsage(5, 100));
		Route CD = new Route(C, D, new SpeedValue(120, KM_PER_HOUR), new TimeValue(40, MINUTES), new GasUsage(8, 100));
		
		Trajectory trajectory = new Trajectory(new Route[] {AB, BC, CD});
		
		System.out.println(AB);
		System.out.println(BC);
		System.out.println(CD);
		System.out.println("------------------------------------ track info ------------------------------------");
		System.out.printf("Average gas usage: %.2f km/L \r\n", trajectory.getAverageGasUsagePerKilometer());
		
		System.out.printf("Average Speed: %s\r\n", trajectory.getAverageSpeed());
		System.out.printf("Duration: %s\r\n", trajectory.getDuration());
		System.out.printf("Total Distance: %s\r\n", trajectory.getTotalDistance());
		System.out.printf("Total Gas Usage: %.2f L\r\n", trajectory.getTotalGasUsed());
		
		
		/*
		OUTPUT:
		------------------------------------------------------------------------------------
	 	Route [A to B, 30,00 minute(s) at 80,00 km/h with 5,25 L/100/KM gas usage]
		Route [B to C, 20,00 minute(s) at 90,00 km/h with 5,00 L/100/KM gas usage]
		Route [C to D, 40,00 minute(s) at 120,00 km/h with 8,00 L/100/KM gas usage]
		------------------------------------ track info ------------------------------------
		Average gas usage: 15.00 km/L 
		Average Speed: 100,00 km/h
		Duration: 1,50 hour(s)
		Total Distance: 150,00 km
		Total Gas Usage: 10.00 L
		------------------------------------------------------------------------------------
		 */
	}
	
}
