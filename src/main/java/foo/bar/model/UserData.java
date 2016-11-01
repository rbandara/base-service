package foo.bar.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="User_Data")
public class UserData {

    @Id
    @Column(name = "Auth_Id")
    private int authId;

    @Column(name = "Account_Id")
    private int userAccId;

    @Column(name = "Data_Provider_Code")
    private String providerCode;
}
