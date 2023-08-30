package local.wpr.start.register.repository;

import local.wpr.start.register.model.All;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllRepository extends JpaRepository<All, Long> {
}
