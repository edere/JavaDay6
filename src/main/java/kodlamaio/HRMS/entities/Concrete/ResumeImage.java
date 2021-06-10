package kodlamaio.HRMS.entities.Concrete;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "resume_image")
@NoArgsConstructor
@AllArgsConstructor
public class ResumeImage   {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private int id;
	
	@Column(name = "image_url")
	private String urlAddress;
	
	@OneToOne()
    @JoinColumn(name = "jobseeker_id", referencedColumnName = "user_id")
    private JobSeeker candidate;	

}
