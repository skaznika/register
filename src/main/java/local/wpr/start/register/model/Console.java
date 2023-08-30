package local.wpr.start.register.model;

//konsola DGT

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tab_console")
public class Console {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long consoleId;
    private String profileName;
    private String emergencyUnlockCode;
    private String ostNr;
    private String queueIndex;
    private String login_stcpr;
    private boolean consoleActive = true;
}
