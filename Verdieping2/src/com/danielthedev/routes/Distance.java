package com.danielthedev.routes;

public class Distance {

	private double value;
	private DistanceUnit unit;
	
	public Distance(double value, DistanceUnit unit) {
		this.value = value;
		this.unit = unit;
	}

	@Override
	public String toString() {
		return String.format("%.2f %s", this.value, this.unit.getName());
	}
	
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public DistanceUnit getUnit() {
		return unit;
	}

	public void setUnit(DistanceUnit unit) {
		this.unit = unit;
	}

	static enum DistanceUnit {
		
		METER("m", (double)1/1000),
		KILOMETER("km", (double)1);
		 
		private final String name;
		private final double factor;

		private DistanceUnit(String name, double factor) {
			this.factor = factor;
			this.name = name;
		}

		public double getFactor() {
			return factor;
		}

		public String getName() {
			return name;
		}
		
	}
}
