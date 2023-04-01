public class TrainingEmployeeTest {

    public static void main(String[] args) {
        TrainingEmployee trainingEmployee = new TrainingEmployee(1, "Pradeep");
        trainingEmployee.printMe(); // This would make sure that existing one is not breaking.

        TrainingEmployeeExtend trainingEmployeeExtend = new TrainingEmployeeExtend(1, "Tiwari", "Mumbai");
        trainingEmployeeExtend.printMe(); // This would also make sure that new code is also working fine by not breaking existing functionality.
    }

}
