package com.codingTech.entity;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="categorie_spring")
public class Categorie {
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
private long idCategorie;
private String title;
@OneToMany(mappedBy ="categorie", cascade = CascadeType.REMOVE)
private List<Produit> produits;

public Categorie( String title) {
	this.title = title;
}



public Categorie( String title, List<Produit> produits) {
	this.title = title;
	this.produits = produits;
}



public Categorie() {
	super();
}

@Override
public String toString() {
	return "Categorie [idCategorie=" + idCategorie + ", title=" + title + "]";
}

public long getIdCategorie() {
	return idCategorie;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public List<Produit> getProduits() {
	return produits;
}
public void setProduits(List<Produit> produits) {
	this.produits = produits;
}
}
