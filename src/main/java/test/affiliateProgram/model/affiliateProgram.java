package test.affiliateProgram.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "affiliateProgram")
public class affiliateProgram {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String affiliateName;

    @Column(name = "affiliateEmail")
    private String affiliateEmail;

//    @Column(nullable = false, insertable = true)
//    private String affiliateEmail;

    @Column(name = "affiliateStatus")
    private String affiliateStatus;

}
