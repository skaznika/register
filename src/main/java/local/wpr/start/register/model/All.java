package local.wpr.start.register.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Klasa odpowiedzialna za wszystkie rekordy
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tab_all")
public class All {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lp;
    private String aNazwisko;
    private String aImie;
    private String aStatusKonta;
    private String aNrGrupy;
    private String aNrOna;
    private String aArchiwalnyNrOna;
    private String aJezyk;
    private String aWydzial;
    private String aStanowisko;
    private String aWnioskujacyNadanie;
    private String aWnioskujacyOdebranie;
    private String bDataNadaniaUpowaznienia;
    private String bNrUpowaznienia;
    private String bDataWaznosciUpowaznienia;
    private String bUprawnienia;
    private String bDataWycofaniaUpowaznienia;
    private String bPowodWycofaniaUpowaznienia;
    private String cDataWydaniaZobowiazania;
    private String cNrZobowiazania;
    private String dDataNadaniaUpowaznienia;
    private String dNrUpowaznienia;
    private String dDataWaznosciUpowaznienia;
    private String dDataWycofaniaUpowaznienia;
    private String dPowodWycofaniaUpowaznienia;
    private String eDataPodpisaniaUpowaznienia;
    private String fDataPodpisaniaZobowiazania;
    private String fNrUpowaznienia;
    private String fDataWaznosciUpowaznienia;
    private String gDataZapoznaniaPolityka;
    private String hSzkolenieLabi;
    private String iDataZapoznaniaPolityka;
    private String loginSTCPR;
    
}
