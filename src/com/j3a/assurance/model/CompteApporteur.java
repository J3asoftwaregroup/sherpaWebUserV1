package com.j3a.assurance.model;

// Generated 5 mai 2015 11:21:10 by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CompteApporteur generated by hbm2java
 */
@Entity
@Table(name = "compte_apporteur", catalog = "zeusbd")
public class CompteApporteur implements java.io.Serializable {

	private String codeCompteApp;
	private Apporteur apporteur;
	private Date dateCreationCompte;
	private BigDecimal totalComApp;
	private BigDecimal totalComPaye;
	private BigDecimal resteComPaye;
	private Set<ReglementApporteur> reglementApporteurs = new HashSet<ReglementApporteur>(
			0);
	private Set<Apporteur> apporteurs = new HashSet<Apporteur>(0);

	public CompteApporteur() {
	}

	public CompteApporteur(String codeCompteApp, Apporteur apporteur) {
		this.codeCompteApp = codeCompteApp;
		this.apporteur = apporteur;
	}

	public CompteApporteur(String codeCompteApp, Apporteur apporteur,
			Date dateCreationCompte, BigDecimal totalComApp,
			BigDecimal totalComPaye, BigDecimal resteComPaye,
			Set<ReglementApporteur> reglementApporteurs,
			Set<Apporteur> apporteurs) {
		this.codeCompteApp = codeCompteApp;
		this.apporteur = apporteur;
		this.dateCreationCompte = dateCreationCompte;
		this.totalComApp = totalComApp;
		this.totalComPaye = totalComPaye;
		this.resteComPaye = resteComPaye;
		this.reglementApporteurs = reglementApporteurs;
		this.apporteurs = apporteurs;
	}

	@Id
	@Column(name = "CODE_COMPTE_APP", unique = true, nullable = false)
	public String getCodeCompteApp() {
		return this.codeCompteApp;
	}

	public void setCodeCompteApp(String codeCompteApp) {
		this.codeCompteApp = codeCompteApp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODE_APPORTEUR", nullable = false)
	public Apporteur getApporteur() {
		return this.apporteur;
	}

	public void setApporteur(Apporteur apporteur) {
		this.apporteur = apporteur;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_CREATION_COMPTE", length = 10)
	public Date getDateCreationCompte() {
		return this.dateCreationCompte;
	}

	public void setDateCreationCompte(Date dateCreationCompte) {
		this.dateCreationCompte = dateCreationCompte;
	}

	@Column(name = "TOTAL_COM_APP")
	public BigDecimal getTotalComApp() {
		return this.totalComApp;
	}

	public void setTotalComApp(BigDecimal totalComApp) {
		this.totalComApp = totalComApp;
	}

	@Column(name = "TOTAL_COM_PAYE")
	public BigDecimal getTotalComPaye() {
		return this.totalComPaye;
	}

	public void setTotalComPaye(BigDecimal totalComPaye) {
		this.totalComPaye = totalComPaye;
	}

	@Column(name = "RESTE_COM_PAYE")
	public BigDecimal getResteComPaye() {
		return this.resteComPaye;
	}

	public void setResteComPaye(BigDecimal resteComPaye) {
		this.resteComPaye = resteComPaye;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "compteApporteur")
	public Set<ReglementApporteur> getReglementApporteurs() {
		return this.reglementApporteurs;
	}

	public void setReglementApporteurs(
			Set<ReglementApporteur> reglementApporteurs) {
		this.reglementApporteurs = reglementApporteurs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "compteApporteur")
	public Set<Apporteur> getApporteurs() {
		return this.apporteurs;
	}

	public void setApporteurs(Set<Apporteur> apporteurs) {
		this.apporteurs = apporteurs;
	}

}
