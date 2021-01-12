package com.danielthedev.routes;

public class TimeValue {

	private final double value;
	private final TimeUnit unit;
	
	public TimeValue(double value, TimeUnit unit) {
		this.value = value;
		this.unit = unit;
	}
	
	public double getValue() {
		return value;
	}

	public TimeUnit getUnit() {
		return unit;
	}
	
	@Override
	public String toString() {
		return String.format("%.2f %s", this.value, this.unit.getName());
	}

	static enum TimeUnit {
		
		SECONDS("seconds(s)", (double)1/3600),
		MINUTES("minute(s)", (double)1/60), 
		HOURS("hour(s)", (double)1);
		 
		private final String name;
		private final double factor;

		private TimeUnit(String name, double factor) {
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
