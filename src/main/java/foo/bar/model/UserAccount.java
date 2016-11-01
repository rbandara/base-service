package foo.bar.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="User_Account")
public class UserAccount {

    @Id
    @Column(name = "Account_Id")
    private int userAccId;

    @Column(name = "Client_Id")
    private Long clientId;

    @Column(name = "Customer_Type")
    private String custType;

    @Column(name = "Customer_Name")
    private String custName;

    @OneToMany(mappedBy = "userAccId", fetch = FetchType.EAGER)
    private List<UserData> userDataList;
}
