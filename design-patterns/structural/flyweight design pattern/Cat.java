public class Cat implements Animal {
    private string name = null;
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override 
    public void setAttributes() {
        System.out.println("Name of animal is: " + this.name);
        System.out.println("Number of eye of animal is: " + CommonSharableClass.eye);
        System.out.println("Number of nose of animal is " + CommonSharableClass.nose);
        System.out.println("Number of leg of animal is " + CommonSharableClass.leg);
        System.out.println("Number of tail of animal is: " + CommonSharableClass.tail);
    }
}
