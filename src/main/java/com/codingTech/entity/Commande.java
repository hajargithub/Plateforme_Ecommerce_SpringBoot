package com.codingTech.entity;


import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="commande_spring")

public class Commande {
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCommande;
	private Date created_at;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="ligne_commande_spring",
	joinColumns=@JoinColumn(name="id_commande"),
	inverseJoinColumns=@JoinColumn(name="id_produit"))
	private List<Produit> produits;

	public Commande(Date created_at, User user, List<Produit> produits) {
		super();
		this.created_at = created_at;
		this.user = user;
		this.produits = produits;
	}
	
	public Commande(Date created_at, User user) {
		super();
		this.created_at = created_at;
		this.user = user;
	}
	
	
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public long getIdCommande() {
		return idCommande;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}


	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", created_at=" + created_at + ", user=" + user + ", produits="
				+ produits + "]";
	}
	

}
