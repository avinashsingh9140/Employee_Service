package Employee.address.Employee_address.repo;

import Employee.address.Employee_address.model.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AddressRepo extends JpaRepository<AddressModel,Long> {

//    void putAddressById(List<AddressModel> id);



//    Object findAllById(List<AddressModel> id);
}
