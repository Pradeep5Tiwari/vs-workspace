public class SingletonClassTest {

    public static void main(String[] args) {

        Singleton singletonObj1 = Singleton.getInstance();
        Singleton singletonObj2 = Singleton.getInstance();
        System.out.println(
                "\n Since we created two different object of same singleton class lets check whether their hascode is same or not ");
        System.out.println("\n The hashCode of singletonClassObj1 is: " + singletonObj1.hashCode());
        System.out.println("\n The hashCode of singletonClassObj2 is: " + singletonObj2.hashCode());
        System.out.println("\n Singleton is Working!!! \n");
        System.out.println("Hence it's proved that both singleton object have same hashcode ");

        Teacher teacher = new Teacher();
        Teacher teacher2 = new Teacher();
        System.out.println("But when creating two object of normal class then two object hashcode would be different as given below");
        System.out.println("The hascode of teacher: " + teacher.hashCode() + "\n" + "The hashcode of teacher2 is: " + teacher2.hashCode());
    }

}
