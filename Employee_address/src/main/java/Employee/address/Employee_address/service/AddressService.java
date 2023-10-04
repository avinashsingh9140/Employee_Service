package Employee.address.Employee_address.service;

import Employee.address.Employee_address.model.AddressModel;
import Employee.address.Employee_address.model.EmployeeModel;
import Employee.address.Employee_address.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepo;

    public String addAddress(List<AddressModel> address) {
        addressRepo.saveAll(address);
        return ("address added");
    }

    public List<AddressModel> getAll() {
        return addressRepo.findAll();
    }

    public Optional<AddressModel> getAddressById(Long id) {
        return addressRepo.findById(id);
    }



    public String removeAddress(Long  id) {
        addressRepo.deleteAllById(Collections.singleton(id));
        return "address deleted...!!!";
    }

    public String  putAddressById( AddressModel id) {
       Optional<AddressModel> val1= addressRepo.findById(id.getId());
        if(val1 != null){
            addressRepo.save(val1.get());

            return "addressed updated !";
        }
        return "No Address found";
    }
}

