public class TerVsNonTerEmployee {

    private int id;
    private String name;
    public TerVsNonTerEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "TerVsNonTerEmployee [id=" + id + ", name=" + name + "]";
    }
    public void printName() {
        System.out.println("The name of the employee is: " + name);
    }
}
