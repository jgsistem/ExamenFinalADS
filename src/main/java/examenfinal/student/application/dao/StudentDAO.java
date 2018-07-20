package examenfinal.student.application.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import examenfinal.student.domain.entity.Student;

@Service
public class StudentDAO implements IStudentDAO {
	
JdbcTemplate template;  
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		template = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Student> getStudentIdtipo(Long id_tipomaestria) {
		String sql="SELECT 	a.alumno_id, a.first_name,a.last_name, a.regis_date,a.document_number, a.isactive, a.cellphone,a.email,ta.detalle,ta.Monto FROM alumnos a INNER JOIN tipoAlumno ta ON a.id_tipo = ta.id_tipo WHERE ta.id_tipo ='"+id_tipomaestria+"'"  ;
		System.out.println(sql);
 	 return template.query(sql,new ResultSetExtractor<List<Student>>(){  
		    
		     public List<Student> extractData(ResultSet rs) throws SQLException,  
		            DataAccessException {  
		      
		        List<Student> list=new ArrayList<Student>();  
		        
		        while(rs.next()){  
		        	Student student=new Student(); 
		        	
		        	student.setId(rs.getInt(1));
		        	student.setFirstName(rs.getString(2));
		        	student.setLastName(rs.getString(3));
		        	student.setBirthDate(rs.getDate(4));
		        	student.setDocumentNumber(rs.getString(5));
		        	student.setIsactive(rs.getBoolean(6));
		        	student.setCellphone(rs.getString(7));
		        	student.setEmail(rs.getString(8));
		        	student.setId_tipo(rs.getString(9));
		        	student.setMonto(rs.getInt(10));
		        list.add(student);  
		        }  
		        return list;  
		        }  
		    });  
		  }

	@Override
	public List<Student> getallMaestria() {
		String sql="SELECT 	a.alumno_id, a.first_name,a.last_name, a.regis_date,a.document_number, a.isactive, a.cellphone,a.email,ta.detalle,ta.Monto FROM alumnos a INNER JOIN tipoAlumno ta ON a.id_tipo = ta.id_tipo"  ;
		System.out.println(sql);
 	 return template.query(sql,new ResultSetExtractor<List<Student>>(){  
		    
		     public List<Student> extractData(ResultSet rs) throws SQLException,  
		            DataAccessException {  		      
		        List<Student> list=new ArrayList<Student>();  		        
		        while(rs.next()){  
		        	Student student=new Student();		        	
		        	student.setId(rs.getInt(1));
		        	student.setFirstName(rs.getString(2));
		        	student.setLastName(rs.getString(3));
		        	student.setBirthDate(rs.getDate(4));
		        	student.setDocumentNumber(rs.getString(5));
		        	student.setIsactive(rs.getBoolean(6));
		        	student.setCellphone(rs.getString(7));
		        	student.setEmail(rs.getString(8));
		        	student.setId_tipo(rs.getString(9));
		        	student.setMonto(rs.getInt(10));
		        list.add(student);  
		        }  
		        return list;  
		        }  
		    });  
		  }

}
