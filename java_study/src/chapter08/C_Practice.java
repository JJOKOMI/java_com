package chapter08;

class Animal {
	void sound() {
		System.out.println("The animal makes a sound");
	}
}

class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("meow");
	}
}

class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("bark");
	}
}

class AnimalChecker {
	void checkAnimalType(Animal animal) {
		if(animal instanceof Cat) {
			System.out.println("cat");
		} else if (animal instanceof Dog) {
			System.out.println("dog");
		} else {
			System.out.println("Unknown animal type");
		}
	}
}

public class C_Practice {
	public static void main(String[] args) {
		AnimalChecker animalChecker = new AnimalChecker();
		
		Animal myPet1 = new Animal();
		animalChecker.checkAnimalType(myPet1);
		
		Dog mypetDog = (Dog)myPet1;
		
		Animal myPet2 = new Cat();
		animalChecker.checkAnimalType(myPet2);
		
		Animal myPet3 = new Dog();
		animalChecker.checkAnimalType(myPet3);
	}

}
