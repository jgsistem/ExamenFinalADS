package examenfinal.student.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import examenfinal.student.domain.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

