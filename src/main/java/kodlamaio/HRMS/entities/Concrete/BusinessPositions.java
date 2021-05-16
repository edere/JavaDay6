package kodlamaio.HRMS.entities.Concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_positions")
public class BusinessPositions {
		@Id
		@GeneratedValue
		@Column(name="id")
		private int id;
		
		@Column(name="name")
		private String name;
		
		
		public BusinessPositions() {}
		
		public BusinessPositions(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}
		
		
}
