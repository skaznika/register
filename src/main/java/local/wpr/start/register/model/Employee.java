package local.wpr.start.register.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

//pracownik
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tab_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String fName;
    private String lName;
    @ManyToOne
    @JoinColumn(name = "account_status_account_status_id")
    private AccountStatus accountStatus;
    @ManyToOne
    @JoinColumn(name = "group_group_id")
    private Group group;
    private String onaNr;
    private String archiveOnaNr;
    @ManyToOne
    @JoinColumn(name = "language_language_id")
    private Language language;
    @ManyToOne
    @JoinColumn(name = "department_department_id")
    private Department department;
    //imię i nazwisko osoby wnioskującej o nadanie uprawnień
    private String fullNameGrantingPermission;
    //imię i nazwisko osoby wnioskującej o odebranie uprawnień
    private String fullNameRevokePermission;
    @ManyToOne
    @JoinColumn(name = "card_id")
    private Card card;
//    @OneToMany
    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "tab_licenses", joinColumns = @JoinColumn(name = "employee_id"), inverseJoinColumns = @JoinColumn(name = "licensing_id"))
    private Set<Licensing> licensing;
    @ManyToOne
    @JoinColumn(name = "acces_server_room_id")
    private AccesServerRoom accesServerRoom;
    private String loginStcpr;
    @ManyToOne
    @JoinColumn(name = "console_console_id")
    private Console console;
}
