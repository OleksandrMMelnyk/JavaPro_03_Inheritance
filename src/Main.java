public class Main {

    public static void main(String[] args) {

        Cat catTomas = new Cat();
        catTomas.animalDistRun(150);
        catTomas.animalDistSwim(25);

        Dog dogBobik = new Dog();
        dogBobik.animalDistRun(350);
        dogBobik.animalDistSwim(5);

        System.out.println("Total cats: " + Cat.getCatCount());
        System.out.println("Total dogs: " + Dog.getDogCount());
    }

}