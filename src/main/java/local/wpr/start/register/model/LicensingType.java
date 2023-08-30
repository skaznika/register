package local.wpr.start.register.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tab_licensing_type")
public class LicensingType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int licensing_type_id;
    private String licensing_type_name;

}
