/* Concrete class for adding new features as per car type which is it's implementation and keep there existing changes.  */

import decorator.concrete.decorator.LuxuryCar;

public class LuxuryCar extends DecoratorClass {

    public LuxuryCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding luxury car features: ");
    }

}
