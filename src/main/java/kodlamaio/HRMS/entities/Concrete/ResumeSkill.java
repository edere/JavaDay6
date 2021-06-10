package kodlamaio.HRMS.entities.Concrete;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "resume_skill")
@EqualsAndHashCode(callSuper = false) 
public class ResumeSkill   {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private int id;
	
	@Column(name = "skills_name")
	private String skillsName;
	
	@ManyToOne
	@JoinColumn(name = "jobseeker_id")
	private JobSeeker candidate;

}