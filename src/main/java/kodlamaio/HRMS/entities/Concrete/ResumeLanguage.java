package kodlamaio.HRMS.entities.Concrete;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
//import javax.validation.constraints.Max;
//import javax.validation.constraints.Min;

@Data
@Entity
@Table(name = "resume_language")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class ResumeLanguage     {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private int id;
	
	//@Min(value = 1 )
	//@Max(value = 5)	
	@Column(name="language_level")
	private int level;
	
	@Column(name="language_name")
	private String languageName;
	
	@ManyToOne
	@JoinColumn(name = "jobseeker_id")
	private JobSeeker candidate;

}
