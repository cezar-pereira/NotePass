package app.model.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity	
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String password;
	private String wordKey;

	@OneToMany (fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	@JoinColumn(name="USER_ID")
	private List<Service> services = new ArrayList<Service>();
	

	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}
	public User() {
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getWordKey() {
		return wordKey;
	}
	
	public void setWordKey(String wordKey) {
		this.wordKey = wordKey;
	}
	
	public List<Service> getServices() {
		return services;
	}

	public void setService (Service service) {
		services.add(service);
	}
	
		
}
