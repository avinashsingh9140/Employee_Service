package Employee.address.Employee_address.repo;

import Employee.address.Employee_address.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeModel,Long> {
//    void deleteById(List<EmployeeModel> id);

//    void deleteById(Long id);
//
//    void deleteById(List<EmployeeModel> id);


}
