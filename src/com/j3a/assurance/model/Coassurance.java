package com.j3a.assurance.model;

// Generated 5 mai 2015 11:21:10 by Hibernate Tools 4.3.1

import java.math.BigDecimal;
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
 * Coassurance generated by hbm2java
 */
@Entity
@Table(name = "coassurance", catalog = "zeusbd")
public class Coassurance implements java.io.Serializable {

	private String codeCoassurance;
	private Contrat contrat;
	private BigDecimal montantCoassurance;
	private String typeCoassurance;
	private Set<CoassuranceCompagnie> coassuranceCompagnies = new HashSet<CoassuranceCompagnie>(
			0);

	public Coassurance() {
	}

	public Coassurance(String codeCoassurance, Contrat contrat) {
		this.codeCoassurance = codeCoassurance;
		this.contrat = contrat;
	}

	public Coassurance(String codeCoassurance, Contrat contrat,
			BigDecimal montantCoassurance, String typeCoassurance,
			Set<CoassuranceCompagnie> coassuranceCompagnies) {
		this.codeCoassurance = codeCoassurance;
		this.contrat = contrat;
		this.montantCoassurance = montantCoassurance;
		this.typeCoassurance = typeCoassurance;
		this.coassuranceCompagnies = coassuranceCompagnies;
	}

	@Id
	@Column(name = "CODE_COASSURANCE", unique = true, nullable = false, length = 16)
	public String getCodeCoassurance() {
		return this.codeCoassurance;
	}

	public void setCodeCoassurance(String codeCoassurance) {
		this.codeCoassurance = codeCoassurance;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NUM_POLICE", nullable = false)
	public Contrat getContrat() {
		return this.contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	@Column(name = "MONTANT_COASSURANCE", precision = 15, scale = 3)
	public BigDecimal getMontantCoassurance() {
		return this.montantCoassurance;
	}

	public void setMontantCoassurance(BigDecimal montantCoassurance) {
		this.montantCoassurance = montantCoassurance;
	}

	@Column(name = "TYPE_COASSURANCE", length = 50)
	public String getTypeCoassurance() {
		return this.typeCoassurance;
	}

	public void setTypeCoassurance(String typeCoassurance) {
		this.typeCoassurance = typeCoassurance;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "coassurance")
	public Set<CoassuranceCompagnie> getCoassuranceCompagnies() {
		return this.coassuranceCompagnies;
	}

	public void setCoassuranceCompagnies(
			Set<CoassuranceCompagnie> coassuranceCompagnies) {
		this.coassuranceCompagnies = coassuranceCompagnies;
	}

}
