package com.codingTech.entity;

import javax.persistence.*;
@Entity
@Table(name="Ligne_Commande_Spring")
public class Ligne_Commande {
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idC;
	private int quantite;
	private double prix_total;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_produit")
	private Produit P;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_commande")
	private Commande C;
	public Ligne_Commande( int quantite, double prix_total, Produit p, Commande c) {
		this.quantite = quantite;
		this.prix_total = prix_total;
		P = p;
		C = c;
	}
	
	public Ligne_Commande() {
		super();
	}

	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public double getPrix_total() {
		return prix_total;
	}
	public void setPrix_total(double prix_total) {
		this.prix_total = prix_total;
	}
	public Produit getP() {
		return P;
	}
	public void setP(Produit p) {
		P = p;
	}
	public Commande getC() {
		return C;
	}
	public void setC(Commande c) {
		C = c;
	}
	public long getIdC() {
		return idC;
	}
	

}
