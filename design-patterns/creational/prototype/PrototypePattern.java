import java.util.ArrayList;
import java.util.List;
public class PrototypePattern implements Cloneable {

    private List<String> employeList;

    public PrototypePattern() {
        employeList = new ArrayList<String>();
    }
    public PrototypePattern(List<String> list) {
        this.employeList = list;
    }

    public void addData() {
        employeList.add("Pradeep");
        employeList.add("Alok");
        employeList.add("Amit");
        employeList.add("Deepak");
        employeList.add("Manish");
    }

    public List<String> getEmployeList() {
        return employeList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for(String s:this.getEmployeList()) {
            temp.add(s);
        }
        return new PrototypePattern(temp);
    }
}
