package com.danielthedev.routes;

import java.util.Arrays;

import com.danielthedev.routes.SpeedValue.SpeedUnit;

import static com.danielthedev.routes.TimeValue.*;
import static com.danielthedev.routes.Distance.*;
		
public class Trajectory {

	private final Route[] routes;

	public Trajectory(Route[] routes) {
		this.routes = routes;
	}
	
	public Route[] getRoutes() {
		return routes;
	}

	public SpeedValue getAverageSpeed() {
		return new SpeedValue(this.getTotalDistance().getValue()/this.getDuration().getValue(), SpeedUnit.KM_PER_HOUR);
	}
	
	public double getAverageGasUsagePerKilometer() {
		return 1/(this.getTotalGasUsed()/this.getTotalDistance().getValue());
	}
	
	public double getTotalGasUsed() {
		double gas = 0;
		for(Route route : this.routes) {
			gas+=route.getLiterGasUsed();
		}
		return gas;
	}
	
	public TimeValue getDuration() {
		double time = 0;
		TimeValue value;
		for(Route route : this.routes) {
			value = route.getTime();
			time += value.getValue() * value.getUnit().getFactor();
		}
		return new TimeValue(time, TimeUnit.HOURS);
	}

	public Distance getTotalDistance() {
		double distance = 0;
		Distance bd;
		for(Route route : this.routes) {
			bd = route.getRouteDistance();
			distance+=bd.getValue()*bd.getUnit().getFactor();
		}
		return new Distance(distance, DistanceUnit.KILOMETER);
	}
	
	@Override
	public String toString() {
		return Arrays.toString(routes);
	}
	
}
