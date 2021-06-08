package kodlamaio.HRMS.entities.Concrete;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "jobs")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","job_advertisements"})
public class Job{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "position")
	private String position;
	
	@Column(name = "description")
	private String description;
	
	@JsonIgnore
	@OneToMany(mappedBy = "job")
	private List<JobAdvertisement> jobAdvertisements;
	
	
}


