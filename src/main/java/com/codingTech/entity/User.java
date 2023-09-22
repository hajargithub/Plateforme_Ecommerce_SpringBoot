package com.codingTech.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="user_spring")
public class User {
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUser;
	private String nom;
	private String prenom;
	private int age;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date_naissance;
	private String email;
	private String password;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_role")
	private Role role;
	

	public User(String nom, String prenom, int age, Date date_naissance, String email, String password, Role role) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.date_naissance = date_naissance;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public User() {

	}

	public long getIdUser() {
		return idUser;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}


	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User{" +
				"idUser=" + idUser +
				", nom='" + nom + '\'' +
				", prenom='" + prenom + '\'' +
				", age=" + age +
				", date_naissance=" + date_naissance +
				", email='" + email + '\'' +
				", password='" + password + '\'' +
				", role=" + role +
				'}';
	}
}
