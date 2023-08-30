package local.wpr.start.register.repository;

import local.wpr.start.register.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    String getLastId = "select * from tab_employee order by employee_id desc limit 1";
    @Query(value = getLastId, nativeQuery = true)
    Employee getLastId();
}
