//package solid-principles.liskov-substitution-principle;

public class LSPEmployee {

    private int lspId;
    private String lspName;
    private double lspSalary;

    public LSPEmployee(int lspId, String lspName, double lspSalary) {
        this.lspId = lspId;
        this.lspName = lspName;
        this.lspSalary = lspSalary;
    }

    public int getLspId() {
        return lspId;
    }

    public void setLspId(int lspId) {
        this.lspId = lspId;
    }

    public String getLspName() {
        return lspName;
    }

    public void setLspName(String lspName) {
        this.lspName = lspName;
    }

    public double getLspSalary() {
        return lspSalary;
    }

    public void setLspSalary(double lspSalary) {
        this.lspSalary = lspSalary;
    }

    public void lspEmployee() {
        System.out.println("The LSPEmployee id is: " + this.lspId + "The LSPEmployee name is: " + this.lspName
                + "The LSPEmployee salary is: " + this.lspSalary);
    }
}
