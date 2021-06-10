package kodlamaio.HRMS.entities.Concrete;


import java.time.LocalDate;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="resume_experiences")
public class ResumeExperience   {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private int id;

	@Column(name = "end_date")
	private LocalDate endedDate;
	
	@Column(name= "start_date")
	private LocalDate startedDate;
	
	@Column(name= "workspace_name")
	private String workspaceName;
	
	
	@Column(name= "position")
	private String position;
	
	@ManyToOne
	@JoinColumn(name = "jobseeker_id")
	private JobSeeker candidate;

	public String getEndDate() {
		if (this.endedDate == null)
			return "Devam ediyor";
		return this.endedDate.toString();
	}
	
}
