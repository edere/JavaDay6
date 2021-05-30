package kodlamaio.HRMS.entities.Concrete;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "employers", uniqueConstraints = {@UniqueConstraint(columnNames = {"company_name"})})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employer extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NotNull
    private int id;

    @Column(name = "company_name")
    @NotNull
    private String companyName;
    
    @Column(name = "company_email")
    @NotNull
    private String companyEmail;
    
    @Column(name = "website")
    @NotNull
    private String website;

    @Column(name = "phone_number")
    @NotNull
    private String phoneNumber;
}
