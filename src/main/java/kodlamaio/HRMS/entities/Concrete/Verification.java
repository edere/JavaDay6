package kodlamaio.HRMS.entities.Concrete;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "verification")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Verification {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "user_id")
	private int userId;

	@Column(name = "code")
	private String code;

	@Column(name = "is_verified")
	private boolean isVerified;

	
	public Verification(int userId, String code, boolean isVerified) {
		super();
		this.userId = userId;
		this.code = code;
		this.isVerified = isVerified;
	}
}
