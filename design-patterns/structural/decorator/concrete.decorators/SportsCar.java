/* Concrete Decorators - Extending the base decorator functionality and modifying the component behavior accordingly.
 We can have concrete decorator classes as LuxuryCar and SportsCar. */

import decorator.concrete.decorators.SportsCar;

public class SportsCar extends DecoratorClass {

    public SportsCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding sports car features: ");

    }
}
