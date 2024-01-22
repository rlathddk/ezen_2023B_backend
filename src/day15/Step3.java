package day15;

public class Step3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        Animal dog1 = new Dog();

        animalSoung(dog1);
        animalSoung(new Cat());
    }
    // 매개변수 다형성
    public static void animalSoung(Animal animal){
        animal.sound();
    }
}
