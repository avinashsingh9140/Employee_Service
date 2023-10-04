package Employee.address.Employee_address.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EmployeeModel {

    @Id

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    @OneToOne
    @JoinColumn(name = "fk_addressId")
  AddressModel address;
}
