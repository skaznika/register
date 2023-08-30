package local.wpr.start.register.repository;

import local.wpr.start.register.model.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
    Role findById(int roleId);

    String zap_role="SELECT a.*, b.*, c.* FROM tab_authorize a left join tab_role b on (a.role_id = b.role_id) left join tab_users c on(a.user_id = c.user_id) where c.user_name = ?1";
    @Query(value = zap_role, nativeQuery = true)
    Role findByUsername(String username);
}
