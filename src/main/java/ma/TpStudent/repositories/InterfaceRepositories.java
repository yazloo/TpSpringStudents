package ma.TpStudent.repositories;

import ma.TpStudent.entities.StudentEntitie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfaceRepositories extends JpaRepository<StudentEntitie,Long> {

}
