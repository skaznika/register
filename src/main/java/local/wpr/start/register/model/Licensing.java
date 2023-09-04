package local.wpr.start.register.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

// upoważnienia do przetwarzania danych w ST CPR
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tab_licensing")
public class Licensing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long licensingId;
    private String licensingNr;
    private boolean active;
    //data nadania upoważnienia
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String licensingSendingDate;
    //data ważności upoważnienia
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String licensingValidityDate;
    //data odebrania uprawnień
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String licensingRecallDate;
    // powód wycofania
    private String licensingReasonDesc;
    //data wydania zobowiązania
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String commitmentDate;
    //nr zobowiązania
    private String commitmentNr;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String statementDate;
    @OneToOne
    @JoinColumn(name = "licensing_type_licensing_type_id")
    private LicensingType licensingType;
    private String login_stcpr;
    @ManyToOne()
    @JoinColumn(name = "permissionsId", referencedColumnName = "permissionsId", insertable = false, updatable = false)
    private Permissions permissions;
}
