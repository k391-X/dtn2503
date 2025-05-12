package QLDV;

import java.util.List;
import java.util.ArrayList;

public class Zoo {
	private List<Animal> animalList = new ArrayList<>();

	public void addAnimal(Animal animal) {
		animalList.add(animal);
	}

	public void showAnimals() {
		for (Animal a : animalList) {
			a.makeSound();
			a.move();
			System.out.println("---");
		}
	}

	public void countAnimalsByType() {
		int dogs = 0, cats = 0, birds = 0;
		for (Animal a : animalList) {
			switch (a.getType()) {
			case "Dog" -> dogs++;
			case "Cat" -> cats++;
			case "Bird" -> birds++;
			}
		}

		System.out.println("Số chó: " + dogs);
		System.out.println("Số mèo: " + cats);
		System.out.println("Số chim: " + birds);
	}
}
