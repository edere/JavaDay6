package kodlamaio.HRMS.entities.Concrete;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "personels") //uniqueConstraints = {@UniqueConstraint(columnNames = {"username"})}
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Personel extends User{
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;
	
}
