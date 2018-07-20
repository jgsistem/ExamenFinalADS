package examenfinal.student.application;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import examenfinal.common.application.Notification;
import examenfinal.common.application.enumeration.RequestBodyType;
import examenfinal.student.application.dao.StudentDAO;
import examenfinal.student.application.dto.StudentDto;
import examenfinal.student.domain.entity.Student;
import examenfinal.student.domain.repository.StudentRepository;

@Service()
public class StudentApplicationService {

	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	StudentDAO studentDAO;
	
	@Transactional
	public ResponseEntity<Object> getidmaestrias(int tipoStudent) throws Exception {
		StudentDto studentDto = new StudentDto();
		studentDto.setId(tipoStudent);		
		Notification notification = this.validation(studentDto);
        if (notification.hasErrors()) {
            throw new IllegalArgumentException(notification.errorMessage());
        }		
        Student student=this.findOne(Long.valueOf(tipoStudent));		
		if(student==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(student);
	}
	
	@Transactional
	public Student findOne(Long empid) {
		return studentRepository.findOne(empid);
	}
	
	@Transactional
	public List<Student> getidmaestria(Long customerid) {
		return studentDAO.getStudentIdtipo(customerid);		
	}
	
	@Transactional
	public List<Student> getallMaestria() {
		return studentDAO.getallMaestria();		
	}
	
	private Notification validation(StudentDto studentDto) {
		Notification notification = new Notification();
		if (studentDto == null || studentDto.getRequestBodyType() == RequestBodyType.INVALID) {
			notification.addError("Invalid JSON data in request body.");
		}
		return notification;
	}
}
