import java.util.List;

public class PrototypePatternTest {
    
    public static void main(String[] args) throws CloneNotSupportedException {

        PrototypePattern prototypePatternObject = new PrototypePattern();
        prototypePatternObject.addData();

        PrototypePattern prototypePattern1 = (PrototypePattern) prototypePatternObject.clone();
        PrototypePattern prototypePattern2 = (PrototypePattern) prototypePatternObject.clone();

        List<String> clonedList1 = prototypePattern1.getEmployeList();
        clonedList1.add("Tiwari");
        List<String> clonedList2 = prototypePattern2.getEmployeList();
        clonedList2.remove("Manish");

        System.out.println("The Original List is: " + prototypePatternObject.getEmployeList());
        System.out.println("The First List of Employee is: " + clonedList1);
        System.out.println("The Second List is: " + clonedList2);
    }
}
