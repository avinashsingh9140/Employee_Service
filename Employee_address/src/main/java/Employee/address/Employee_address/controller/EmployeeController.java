package Employee.address.Employee_address.controller;

import Employee.address.Employee_address.model.AddressModel;
import Employee.address.Employee_address.model.EmployeeModel;
import Employee.address.Employee_address.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    // post
    @PostMapping("/employee")
    public String addEmployee(@RequestBody List<EmployeeModel> employee) {
        employeeService.saveAll(employee);
        return ("Employee added...!!");
    }
  //getAll
    @GetMapping("/getAllEmployee")
    public List<EmployeeModel> getAllEmployee() {
        return employeeService.getAllEmployee();
    }
    // getEmployee by id
    @GetMapping("getEmployee/{id}")
    public Optional<EmployeeModel> getEmployeeById( @PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }
   // delete by Id
    @DeleteMapping("/deleteEmployeeById/{id}")
    public String removeEmployeeById(@PathVariable  Long id) {
       return employeeService.removeEmployeeById(id);
    }

    //put by id

    @PutMapping("/putEmployeeById/{id}")
    public String putEmployeeById(@RequestBody  EmployeeModel id){
        return employeeService.putEmployeeById(id);
    }
}
