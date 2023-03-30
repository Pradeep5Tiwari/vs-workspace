public class AnimalClient {
    
    public static void main(String[] args) {
        Animal cat = AnimalFactory.getCat("CAT");
        cat.printAnimalAttributes();

        Animal dog = AnimalFactory.getDog("DOG");
        dog.printAnimalAttributes();

        Animal cow = AnimalFactory.getCow("COW");
        cow.printAnimalAttributes();

        System.out.println("Cat: " + cat.hashCode());
        System.out.println("Dog: " + dog.hashCode());
        System.out.println("Cow: " + cow.hashCode());
    }
}
