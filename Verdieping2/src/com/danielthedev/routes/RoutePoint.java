package com.danielthedev.routes;

public class RoutePoint {

	private final String name;

	public RoutePoint(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "RoutePoint [name=" + name + "]";
	}
}
