package com.j3a.assurance.model;

// Generated 5 mai 2015 11:21:10 by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Recours generated by hbm2java
 */
@Entity
@Table(name = "recours", catalog = "zeusbd")
public class Recours implements java.io.Serializable {

	private String referenceTiers;
	private String raisonSocial;
	private BigDecimal montant;
	private String etat;
	private Set<Victime> victimes = new HashSet<Victime>(0);

	public Recours() {
	}

	public Recours(String referenceTiers) {
		this.referenceTiers = referenceTiers;
	}

	public Recours(String referenceTiers, String raisonSocial,
			BigDecimal montant, String etat, Set<Victime> victimes) {
		this.referenceTiers = referenceTiers;
		this.raisonSocial = raisonSocial;
		this.montant = montant;
		this.etat = etat;
		this.victimes = victimes;
	}

	@Id
	@Column(name = "REFERENCE_TIERS", unique = true, nullable = false, length = 10)
	public String getReferenceTiers() {
		return this.referenceTiers;
	}

	public void setReferenceTiers(String referenceTiers) {
		this.referenceTiers = referenceTiers;
	}

	@Column(name = "RAISON_SOCIAL", length = 50)
	public String getRaisonSocial() {
		return this.raisonSocial;
	}

	public void setRaisonSocial(String raisonSocial) {
		this.raisonSocial = raisonSocial;
	}

	@Column(name = "MONTANT", precision = 15, scale = 3)
	public BigDecimal getMontant() {
		return this.montant;
	}

	public void setMontant(BigDecimal montant) {
		this.montant = montant;
	}

	@Column(name = "ETAT", length = 50)
	public String getEtat() {
		return this.etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "recours")
	public Set<Victime> getVictimes() {
		return this.victimes;
	}

	public void setVictimes(Set<Victime> victimes) {
		this.victimes = victimes;
	}

}