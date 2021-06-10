package kodlamaio.HRMS.entities.Concrete;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="resume_education")
@EqualsAndHashCode(callSuper = false) 
public class ResumeEducation   {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private int id;

	@Column(name = "school_name")
	private String schoolName;
	
	@Column(name = "department")
	private String department;
	
	@Column(name = "start_date")
	private LocalDate startedDate;
	
	@Column(name = "end_date")
	private LocalDate endedDate;
	
	@ManyToOne()
	@JoinColumn(name = "jobseeker_id")
	private JobSeeker candidate;
	
	public String getEndDate() {
		if (this.endedDate == null)
			return "Devam ediyor";
		return this.endedDate.toString();
	}
}