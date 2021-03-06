package kodlamaio.HRMS.entities.Concrete;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "jobseekers", uniqueConstraints = { @UniqueConstraint(columnNames = { "identity_number" }) })

public class JobSeeker extends User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "jobseeker_id")
	@NotNull
	private int id;

	@Column(name = "first_name")
	@NotNull
	private String firstName;

	@Column(name = "last_name")
	@NotNull
	private String lastName;

	@Column(name = "identity_number")
	@NotNull
	private String identityNumber;

	@Column(name = "birth_date")
	@NotNull
	private LocalDate birthDate;

}
