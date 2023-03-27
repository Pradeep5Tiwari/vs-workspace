public class Dog implements Animal {
    
    private String name = null;

    @Override
    public setName(String name) {
        this.name = name;
    }

    @Override
    public void setAttributes() {
        System.out.println("The name of the animal is: " + this.name);
        System.out.println("The name of the animal is: " + CommonSharableClass.eye);
        System.out.println("The name of the animal is: " + CommonSharableClass.nose);
        System.out.println("The name of the animal is: " + CommonSharableClass.leg);
        System.out.println("The name of the animal is: " + CommonSharableClass.tail);
    }         
}
