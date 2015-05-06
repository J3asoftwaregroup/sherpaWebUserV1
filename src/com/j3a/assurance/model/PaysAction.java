package com.j3a.assurance.model;

// Generated 5 mai 2015 11:21:10 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PaysAction generated by hbm2java
 */
@Entity
@Table(name = "pays_action", catalog = "zeusbd")
public class PaysAction implements java.io.Serializable {

	private String codePa;
	private String paysPa;
	private String branchePa;
	private Date anneeDebutExploitPa;
	private String referenceAgremementPa;
	private Set<EtatCima> etatCimas = new HashSet<EtatCima>(0);

	public PaysAction() {
	}

	public PaysAction(String codePa) {
		this.codePa = codePa;
	}

	public PaysAction(String codePa, String paysPa, String branchePa,
			Date anneeDebutExploitPa, String referenceAgremementPa,
			Set<EtatCima> etatCimas) {
		this.codePa = codePa;
		this.paysPa = paysPa;
		this.branchePa = branchePa;
		this.anneeDebutExploitPa = anneeDebutExploitPa;
		this.referenceAgremementPa = referenceAgremementPa;
		this.etatCimas = etatCimas;
	}

	@Id
	@Column(name = "CODE_PA", unique = true, nullable = false, length = 20)
	public String getCodePa() {
		return this.codePa;
	}

	public void setCodePa(String codePa) {
		this.codePa = codePa;
	}

	@Column(name = "PAYS_PA", length = 20)
	public String getPaysPa() {
		return this.paysPa;
	}

	public void setPaysPa(String paysPa) {
		this.paysPa = paysPa;
	}

	@Column(name = "BRANCHE_PA", length = 20)
	public String getBranchePa() {
		return this.branchePa;
	}

	public void setBranchePa(String branchePa) {
		this.branchePa = branchePa;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ANNEE_DEBUT_EXPLOIT_PA", length = 10)
	public Date getAnneeDebutExploitPa() {
		return this.anneeDebutExploitPa;
	}

	public void setAnneeDebutExploitPa(Date anneeDebutExploitPa) {
		this.anneeDebutExploitPa = anneeDebutExploitPa;
	}

	@Column(name = "REFERENCE_AGREMEMENT_PA", length = 30)
	public String getReferenceAgremementPa() {
		return this.referenceAgremementPa;
	}

	public void setReferenceAgremementPa(String referenceAgremementPa) {
		this.referenceAgremementPa = referenceAgremementPa;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "paysActions")
	public Set<EtatCima> getEtatCimas() {
		return this.etatCimas;
	}

	public void setEtatCimas(Set<EtatCima> etatCimas) {
		this.etatCimas = etatCimas;
	}

}