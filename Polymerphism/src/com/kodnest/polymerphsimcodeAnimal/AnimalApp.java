package com.kodnest.polymerphsimcodeAnimal;

public class AnimalApp {
	public static void main(String[] args) {
		AnimalHabits h=new AnimalHabits();
		h.acceptAnimal(new Deer());
		h.acceptAnimal(new Monkey());
		h.acceptAnimal(new Tiger());
	}

}
