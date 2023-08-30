package local.wpr.start.register.repository;

import local.wpr.start.register.model.Console;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsoleRepository extends JpaRepository<Console, Long> {

    String zap_console = "select * from tab_console WHERE ost_nr != 'nie dotyczy'";
    @Query(value = zap_console, nativeQuery = true)
    public List<Console> getAllByOstNr();
}
