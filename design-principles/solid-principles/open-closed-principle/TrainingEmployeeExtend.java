/* This class is OPEN FOR EXTENSION as we are extending this class TrainingEmployeeExtend from TrainingEmployee and adding new constructor
 * with additional parameter trainingLocation to implement new functionality(By adding new parameter).   
*/
public class TrainingEmployeeExtend extends TrainingEmployee {
    @SuppressWarnings("all")
    private String trainingLocation;

    public TrainingEmployeeExtend(int id, String name, String trainingLocation) {
        super(id, name);
        this.trainingLocation = trainingLocation;
    }
}
