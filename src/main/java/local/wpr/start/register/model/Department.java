package local.wpr.start.register.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//Wydziały
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tab_department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentId;
    private String departmentName;
    private String departmentShortName;
    private boolean departmentActive;
}
