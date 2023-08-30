package local.wpr.start.register.repository;

import local.wpr.start.register.model.Licensing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicensingRepository extends JpaRepository<Licensing, Long> {
}
