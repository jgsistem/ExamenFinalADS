CREATE TABLE alumnos (
  alumno_id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  regis_date DATE NULL,
  document_number VARCHAR(50) NOT NULL,
  isactive BOOLEAN,
  cellphone VARCHAR(50) NULL,
  email VARCHAR(50) NULL,  
  id_tipo BIGINT UNSIGNED NOT NULL,
  PRIMARY KEY (alumno_id),
  INDEX IX_customer_last_first_name (last_name, first_name),
  FOREIGN KEY (id_tipo) REFERENCES tipoAlumno (id_tipo)
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;