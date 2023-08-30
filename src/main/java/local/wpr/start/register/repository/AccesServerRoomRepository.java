package local.wpr.start.register.repository;

import local.wpr.start.register.model.AccesServerRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccesServerRoomRepository extends JpaRepository<AccesServerRoom, Long > {
}
