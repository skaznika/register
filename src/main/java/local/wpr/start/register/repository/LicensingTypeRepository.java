package local.wpr.start.register.repository;

import local.wpr.start.register.model.LicensingType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicensingTypeRepository extends JpaRepository<LicensingType, Long> {
}
