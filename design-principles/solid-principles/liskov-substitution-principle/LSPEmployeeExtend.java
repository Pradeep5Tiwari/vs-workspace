//package solid-principles.liskov-substitution-principle;

public class LSPEmployeeExtend extends LSPEmployee  {
    @SuppressWarnings("all")
    private String lspEmpDepartment;
    public LSPEmployeeExtend(int lspId, String lspName, double lspSalary, String lspEmpDepartment) {
        super(lspId,lspName,lspSalary);
        this.lspEmpDepartment = lspEmpDepartment;
    }    
}
