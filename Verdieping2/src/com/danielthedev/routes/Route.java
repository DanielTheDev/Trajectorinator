package com.danielthedev.routes;

import static com.danielthedev.routes.Distance.*;

public class Route {

	private final RoutePoint startPoint;
	private final RoutePoint endPoint;
	private final SpeedValue speed;
	private final TimeValue time;
	private final GasUsage gas;
	
	public Route(RoutePoint startPoint, RoutePoint endPoint, SpeedValue speed, TimeValue time, GasUsage gas) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.speed = speed;
		this.time = time;
		this.gas = gas;
	}
	
	public double getLiterGasUsed() {
		return (this.getRouteDistance().getValue()/this.gas.getKilometers()) * this.gas.getLiters();
	}

	public Distance getRouteDistance() {
		double hours = this.time.getValue() * this.time.getUnit().getFactor();
		double km_per_hour = this.speed.getValue() * this.speed.getUnit().getFactor();
		return new Distance(hours*km_per_hour, DistanceUnit.KILOMETER);
	}
	
	public RoutePoint getStartPoint() {
		return startPoint;
	}

	public RoutePoint getEndPoint() {
		return endPoint;
	}
	
	public SpeedValue getSpeed() {
		return speed;
	}

	public TimeValue getTime() {
		return time;
	}

	public GasUsage getGas() {
		return gas;
	}

	@Override
	public String toString() {
		return String.format("Route [%s to %s, %s at %s with %s gas usage]", startPoint.getName(), endPoint.getName(), time.toString(), speed.toString(), gas.toString());
	}

	
}
