package afnan.afndemo;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="userInfo")
public class UserModel {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long uid;


    @Column(unique =true)
    private String uname;

    
    private int year;
    private Date date;

    // public UserModel(String uname,long uid,Integer year,LocalDate date){
    //     this.uname = uname;
    //     this.uid=uid;
    //     this.year=year;
    //     this.date=date;
    // }
    
}
