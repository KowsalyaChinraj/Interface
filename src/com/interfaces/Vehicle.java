package com.interfaces;

public abstract class Vehicle implements Travel{

}
class Car extends Vehicle{

	@Override
	public int getspeed() {
	
		return 0;
	}
}
	class Bus extends Vehicle{

		@Override
		public int getspeed() {
			
			return 0;
		}
	}
		class Cycle extends Vehicle{

			@Override
			public int getspeed() {
				
				return 0;
			}
			
		}
	
