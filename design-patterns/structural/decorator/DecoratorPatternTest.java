/* Main class "DecoratorPatternTest" which is basically to add the dynamically functionality/ behaviour to object at runtime. */
public class DecoratorPatternTest {

    public static void main(String[] args) {

        Car mySportsCar = new SportsCar(new BasicCar());
        mySportsCar.assemble();
        System.out.println("\n******************");

        Car mySportsLuxuryCar = new LuxuryCar(new SportsCar(new BasicCar()));
        mySportsLuxuryCar.assemble();
    }
}
