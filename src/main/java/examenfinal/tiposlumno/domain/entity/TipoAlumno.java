package examenfinal.tiposlumno.domain.entity;

import java.sql.Date;

public class TipoAlumno {
	private long idp;	
	private String detalle;
	private Boolean islocked;	
	private Integer Monto;
	
	public long getIdp() {
		return idp;
	}
	public void setIdp(long idp) {
		this.idp = idp;
	}
	
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public Boolean getIslocked() {
		return islocked;
	}
	public void setIslocked(Boolean islocked) {
		this.islocked = islocked;
	}
	public Integer getMonto() {
		return Monto;
	}
	public void setMonto(Integer monto) {
		Monto = monto;
	}

}
