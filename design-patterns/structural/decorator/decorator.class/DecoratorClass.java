/* Decorator - Decorator class implements the component interface and it has a HAS-A relationship with the component 
interface. The component variable should be accessible to the child decorator classes, so we will make this variable 
protected.*/

import decorator.DecoratorClass.DecoratorClass;

public class DecoratorClass implements Car {

    protected Car car;

    public DecoratorClass(Car c) {
        this.car = c;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
