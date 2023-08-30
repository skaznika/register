package local.wpr.start.register.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//stanowisko
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tab_position")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int positionId;
    private String positionName;
    private boolean positionActive = true;
}
