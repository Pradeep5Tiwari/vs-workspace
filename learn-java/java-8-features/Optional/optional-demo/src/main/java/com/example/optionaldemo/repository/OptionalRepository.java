@repository
public interface OptionalRepository {
    
    public List<Employee> findById(Integer id);
    public List<Employee> findByEmployeeId(Integer id);
}
