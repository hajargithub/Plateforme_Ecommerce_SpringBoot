package com.codingTech.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="produit_spring")

public class Produit {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProduit; 
	private String nom;
	private double prix;
	private int quantite_dispo;
	private String urlPhoto ;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_categorie")
	private Categorie categorie;
	@ManyToMany(mappedBy = "produits", cascade = CascadeType.ALL)
	private List<Commande> commandes;
	
	
	public Produit(String nom, double prix, int quantite_dispo, String urlPhoto, Categorie categorie,
			List<Commande> commandes) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.quantite_dispo = quantite_dispo;
		this.urlPhoto = urlPhoto;
		this.categorie = categorie;
		this.commandes = commandes;
	}
	public Produit(String nom, double prix, int quantite_dispo, String urlPhoto, Categorie categorie) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.quantite_dispo = quantite_dispo;
		this.urlPhoto = urlPhoto;
		this.categorie = categorie;
	}
	


	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Produit(long idProduit, String nom, double prix, int quantite_dispo, String urlPhoto, Categorie categorie) {
		super();
		this.idProduit = idProduit;
		this.nom = nom;
		this.prix = prix;
		this.quantite_dispo = quantite_dispo;
		this.urlPhoto = urlPhoto;
		this.categorie = categorie;
	}


	
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nom=" + nom + ", prix=" + prix + ", quantite_dispo="
				+ quantite_dispo + ", urlPhoto=" + urlPhoto + ", categorie=" + categorie + ", commandes=" + commandes
				+ "]";
	}



	public long getIdProduit() {
		return idProduit;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getUrlPhoto() {
		return urlPhoto;
	}

	public void setUrlPhoto(String urlPhoto) {
		this.urlPhoto = urlPhoto;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQuantite_dispo() {
		return quantite_dispo;
	}

	public void setQuantite_dispo(int quantite_dispo) {
		this.quantite_dispo = quantite_dispo;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}



	public List<Commande> getCommandes() {
		return commandes;
	}



	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}
	
	


}
