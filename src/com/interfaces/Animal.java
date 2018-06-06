package com.interfaces;

public abstract class Animal implements Travel{

}
class Dog extends Animal{

	@Override
	public int getspeed() {
	return 0;	
	}
	
}
	class Cat extends Animal{

		@Override
		public int getspeed() {
		
			return 0;
		}
	}
	class Rabbit extends Animal{

		@Override
		public int getspeed() {
			
			return 0;
		}
		
	}
	
	
	

