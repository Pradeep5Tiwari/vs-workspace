import java.util.*;

public class CopyStringList {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("pradeep");
        strList.add("Mohan");
        strList.add("Alok");
        strList.add("Shyam");
        strList.add("Amit");
        strList.add("Rahul");
        System.out.println("The original string list is: " + strList);
        List<String> strResult = copiedStringMethod(strList);
        System.out.println("The copeied strings from original list are: ");
        for (String s : strResult) {
            System.out.println(s);
        }
    }

    public static List<String> copiedStringMethod(List<String> strList) {
        List<String> strList2 = new ArrayList<String>();
        for (String s : strList) {
            if (s.equals("pradeep") || s.equals("Alok") || s.equals("Amit")) {
                strList2.add(s);
            }
        }

        return strList2;
    }
}
