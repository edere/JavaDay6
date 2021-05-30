package kodlamaio.HRMS.entities.Concrete;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@Table(name = "jobseekers_activations")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class JobSeekerActivation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "jobseeker_id")
    private int jobseekerId;

    @Column(name = "is_email_confirmed")
    private boolean isEmail = false;

    @Column(name = "is_mernis_valid")
    private boolean isMernis = false;
}