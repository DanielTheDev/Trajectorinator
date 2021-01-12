package com.danielthedev.routes;

public class SpeedValue {

	private final double value;
	private final SpeedUnit unit;
	
	public SpeedValue(double value, SpeedUnit unit) {
		this.value = value;
		this.unit = unit;
	}
	
	public double getValue() {
		return value;
	}

	public SpeedUnit getUnit() {
		return unit;
	}
	
	@Override
	public String toString() {
		return String.format("%.2f %s", this.value, this.unit.getName());
	}

	static enum SpeedUnit {
		
		KM_PER_HOUR("km/h", 1), 
		M_PER_SECOND("m/s", 1/3.6);
		 
		private final String name;
		private final double factor;

		private SpeedUnit(String name, double factor) {
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
