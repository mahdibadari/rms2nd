package learning.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import learning.bootcamp.model.Unit;

@Repository("unitRepository")
public interface UnitRepository extends JpaRepository<Unit, Long> {
    Unit findbyUnitId(int unitId);
}