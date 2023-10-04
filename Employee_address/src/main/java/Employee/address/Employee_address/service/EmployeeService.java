package Employee.address.Employee_address.service;

import Employee.address.Employee_address.model.AddressModel;
import Employee.address.Employee_address.model.EmployeeModel;
import Employee.address.Employee_address.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    public String saveAll(List<EmployeeModel> employee) {
        employeeRepo.saveAll(employee);
        return "employee Addedd...!!";
    }


    public List<EmployeeModel> getAllEmployee() {
        return employeeRepo.findAll();
    }

    public Optional<EmployeeModel> getEmployeeById(Long id) {
        return employeeRepo.findById(id);
    }

    public String removeEmployeeById(Long id) {
        employeeRepo.deleteById(id);
        return "employee deleted...!!!";
    }

    public String putEmployeeById(EmployeeModel id) {
        Optional<EmployeeModel> val=employeeRepo.findById(id.getId());
        if(val != null){
            employeeRepo.save(val.get());
            return "Employee updated !";
        }
        return "No Employee found";
    }
}
