public class SingletonClassTest {

    public static void main(String[] args) {

        SingletonClass singletonClassObj1 = SingletonClass.getInstance();
        SingletonClass singletonClassObj2 = SingletonClass.getInstance();
        System.out.println(
                "\n Since we created two different object of same singleton class lets check whether their hascode is same or not ");
        System.out.println("\n The hashCode of singletonClassObj1 is: " + singletonClassObj1.hashCode());
        System.out.println("\n The hashCode of singletonClassObj2 is: " + singletonClassObj2.hashCode());
        System.out.println("\n Singleton Working!!! ");
        System.out.println("Hence it's proved that both singleton object have same hashcode ");
    }

}
