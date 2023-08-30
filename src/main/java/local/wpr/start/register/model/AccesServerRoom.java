package local.wpr.start.register.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

//dostęp do serwerowni
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tab_server_access")
public class AccesServerRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String serverAccessNr;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String releaseDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String returnDate;
    private String serverAccessDesc;
    private String login;

}
