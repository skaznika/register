package local.wpr.start.register.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

//karty SI
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tab_card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cardNr;
    private String cardPin;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String releaseDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String returnDate;
    private String cardDesc;
    private String fName;
    private String lName;
    private String login_stcpr;
    private boolean cardActive = true;


}
