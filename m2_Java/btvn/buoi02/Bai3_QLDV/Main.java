package QLDV;

public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		
		zoo.addAnimal(new Dog("Ki"));
		zoo.addAnimal(new Dog("Bin"));
        zoo.addAnimal(new Cat("Mimi"));
        zoo.addAnimal(new Bird("Chipi"));
        zoo.addAnimal(new Dog("Pluto"));
        zoo.addAnimal(new Bird("Chim sâu"));

        System.out.println("Danh sách tiếng kêu và di chuyển:");
        zoo.showAnimals();
        
        System.out.println("Thống kê");
        zoo.countAnimalsByType();
	}

}
