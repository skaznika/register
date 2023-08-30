package local.wpr.start.register.repository;

import local.wpr.start.register.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
    String zap = "SELECT a.*, b.* FROM tab_card a LEFT JOIN tab_employee b on(a.login_stcpr = b.login_stcpr)";
    @Query(value = zap, nativeQuery = true)
    public List<Card> findAllCards();
}
