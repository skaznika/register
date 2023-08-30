package local.wpr.start.register.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// grupa pracownika
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tab_group")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int groupId;
    private String groupName;
}
