package pe.com.proyecto.userservice.app.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="USUARIO")
public class UsuarioJpa {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="USER")
	private String user;
	
	@Column(name="PASSWORD")
	private String password;
	
	
	@OneToOne
	@JoinColumn(name = "ROL_ID")
    private RolJpa rol = null;
	
	@OneToOne
	@JoinColumn(name = "PERSONA_ID")
    private PersonaJpa persona = null;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RolJpa getRol() {
		return rol;
	}

	public void setRol(RolJpa rol) {
		this.rol = rol;
	}

	public PersonaJpa getPersona() {
		return persona;
	}

	public void setPersona(PersonaJpa persona) {
		this.persona = persona;
	}
	
	
	
	
}
