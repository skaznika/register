package local.wpr.start.register.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "v_employee")
public class EmployeeView {
    @Id
    private Long employeeId;
    private String fName;
    private String lName;
    private int accountStatusId;
    private String accountStatusName;
    private Integer departmentId;
    private String departmentShortName;
    private Integer groupId;
    private String groupName;
    private int languageId;
    private String languageName;
    private String loginStcpr;
}
