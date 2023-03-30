public class Cow implements Animal {
    
    private String name = null;
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void printAnimalAttributes() {
        System.out.println("The name of the animal is: " + this.name);
        System.out.println("The number of eye of animal is: " + CommonSharableClass.eye);
        System.out.println("The number of nose of animal is: " + CommonSharableClass.nose);
        System.out.println("The number of leg of animal is: " + CommonSharableClass.leg);
        System.out.println("The number of tail of animal is: " + CommonSharableClass.tail + "\n");
    }
}
