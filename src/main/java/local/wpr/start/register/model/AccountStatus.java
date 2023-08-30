package local.wpr.start.register.model;

import lombok.*;

import javax.persistence.*;

//status konta
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tab_account_status")
public class AccountStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountStatusId;
    private String accountStatusName;
}
