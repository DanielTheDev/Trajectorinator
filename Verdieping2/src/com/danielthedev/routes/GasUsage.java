package com.danielthedev.routes;

public class GasUsage {

	private final double liters;
	private final int kilometers;
	
	public GasUsage(double liters, int kilometers) {
		this.liters = liters;
		this.kilometers = kilometers;
	}

	public double getLiters() {
		return liters;
	}

	public int getKilometers() {
		return kilometers;
	}

	@Override
	public String toString() {
		return String.format("%.2f L/%d/KM", this.liters, this.kilometers);
	}
}
