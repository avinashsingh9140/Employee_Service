package Employee.address.Employee_address.controller;

import Employee.address.Employee_address.model.AddressModel;
import Employee.address.Employee_address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    //post Api
    @PostMapping("/addAddress")
    public String addAddress(@RequestBody List<AddressModel> address){
        return addressService.addAddress(address);
    }

    //getAddress All
    @GetMapping("/getAllAddress")
    public List<AddressModel> getAllAddress(){
        return addressService.getAll();
    }

    //getById
    @GetMapping("getAllAddress/{id}")
    public Optional<AddressModel> getAddressById(@RequestParam Long id){
    return addressService.getAddressById( id);
    }
  //delete by address
    @DeleteMapping("delete/{id}")
    public String removeAddress(@PathVariable Long id){
        return  addressService.removeAddress(id);
    }
  //put Address By ID


    @PutMapping("/putAddressById/{id}")
    public String putAddressById(@RequestBody AddressModel id){
        return addressService.putAddressById(id);
    }

}
