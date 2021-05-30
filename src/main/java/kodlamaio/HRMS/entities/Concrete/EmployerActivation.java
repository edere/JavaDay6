package kodlamaio.HRMS.entities.Concrete;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employers_activations")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployerActivation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "employer_id")
    private int employerId;

    @Column(name = "is_email_confirmed")
    private boolean isEmail = false;

    @Column(name = "is_employer_activated")
    private boolean isActive = false;
}
