package local.wpr.start.register.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//jezyk pracownika
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tab_language")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int languageId;
    private String languageName;
    private String languageDegree;
    private boolean languageActive = true;
}
