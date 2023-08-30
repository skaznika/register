package local.wpr.start.register.repository;

import local.wpr.start.register.model.EmployeeView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeViewRepository extends JpaRepository<EmployeeView, Long> {
}
