package com.j3a.assurance.model;

// Generated 5 mai 2015 11:21:10 by Hibernate Tools 4.3.1

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

/**
 * RisqueNta generated by hbm2java
 */
@Entity
@Table(name = "risque_nta", catalog = "zeusbd")
public class RisqueNta implements java.io.Serializable {

	private String codeRisquenta;
	private Categorie categorie;
	private String libelleRisquenta;
	private Set<ApporteurNta> apporteurNtas = new HashSet<ApporteurNta>(0);
	private Set<AvenantRisqueNta> avenantRisqueNtas = new HashSet<AvenantRisqueNta>(
			0);
	private Set<RisqueNtaSinistre> risqueNtaSinistres = new HashSet<RisqueNtaSinistre>(
			0);
	private Set<GarantieChoisieNta> garantieChoisieNtas = new HashSet<GarantieChoisieNta>(
			0);

	public RisqueNta() {
	}

	public RisqueNta(String codeRisquenta) {
		this.codeRisquenta = codeRisquenta;
	}

	public RisqueNta(String codeRisquenta, Categorie categorie,
			String libelleRisquenta, Set<ApporteurNta> apporteurNtas,
			Set<AvenantRisqueNta> avenantRisqueNtas,
			Set<RisqueNtaSinistre> risqueNtaSinistres,
			Set<GarantieChoisieNta> garantieChoisieNtas) {
		this.codeRisquenta = codeRisquenta;
		this.categorie = categorie;
		this.libelleRisquenta = libelleRisquenta;
		this.apporteurNtas = apporteurNtas;
		this.avenantRisqueNtas = avenantRisqueNtas;
		this.risqueNtaSinistres = risqueNtaSinistres;
		this.garantieChoisieNtas = garantieChoisieNtas;
	}

	@Id
	@Column(name = "CODE_RISQUENTA", unique = true, nullable = false, length = 30)
	public String getCodeRisquenta() {
		return this.codeRisquenta;
	}

	public void setCodeRisquenta(String codeRisquenta) {
		this.codeRisquenta = codeRisquenta;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODE_CATEGORIE")
	public Categorie getCategorie() {
		return this.categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Column(name = "LIBELLE_RISQUENTA", length = 30)
	public String getLibelleRisquenta() {
		return this.libelleRisquenta;
	}

	public void setLibelleRisquenta(String libelleRisquenta) {
		this.libelleRisquenta = libelleRisquenta;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "risqueNta")
	public Set<ApporteurNta> getApporteurNtas() {
		return this.apporteurNtas;
	}

	public void setApporteurNtas(Set<ApporteurNta> apporteurNtas) {
		this.apporteurNtas = apporteurNtas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "risqueNta")
	public Set<AvenantRisqueNta> getAvenantRisqueNtas() {
		return this.avenantRisqueNtas;
	}

	public void setAvenantRisqueNtas(Set<AvenantRisqueNta> avenantRisqueNtas) {
		this.avenantRisqueNtas = avenantRisqueNtas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "risqueNta")
	public Set<RisqueNtaSinistre> getRisqueNtaSinistres() {
		return this.risqueNtaSinistres;
	}

	public void setRisqueNtaSinistres(Set<RisqueNtaSinistre> risqueNtaSinistres) {
		this.risqueNtaSinistres = risqueNtaSinistres;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "risqueNta")
	public Set<GarantieChoisieNta> getGarantieChoisieNtas() {
		return this.garantieChoisieNtas;
	}

	public void setGarantieChoisieNtas(
			Set<GarantieChoisieNta> garantieChoisieNtas) {
		this.garantieChoisieNtas = garantieChoisieNtas;
	}

}