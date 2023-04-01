//package solid-principles.liskov-substitution-principle;

public class LSPEmployeeTest {

    public static void main(String[] args) {

        LSPEmployee lspEmployee = new LSPEmployee(101, "Pradeep", 10000);
        lspEmployee.lspEmployee();

        LSPEmployeeExtend lSPEmployeeExtend = new LSPEmployeeExtend(102, "Tiwari", 20000, "Ops");
        lSPEmployeeExtend.lspEmployee();

        LSPEmployeeTest lspEmployeeTest = new LSPEmployeeTest();
        lspEmployeeTest.useMeToPrintYourData(lspEmployee);

    }

    // create one more method to check lsp substitution
    void useMeToPrintYourData(LSPEmployee e) {
        e.lspEmployee();
    }
}
