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
 * GarantieChoisieIa generated by hbm2java
 */
@Entity
@Table(name = "garantie_choisie_ia", catalog = "zeusbd")
public class GarantieChoisieIa implements java.io.Serializable {

	private String codeGrtieChoisieIa;
	private AssureIa assureIa;
	private String libelleGarantieChoisieIa;
	private Date dateGarantieChoisieIa;
	private BigDecimal primeNetteIa;
	private BigDecimal comgesIa;
	private BigDecimal cominterIa;
	private BigDecimal comconsIa;
	private BigDecimal taxeIa;
	private BigDecimal reductionIa;
	private BigDecimal comaperIa;
	private BigDecimal comcoassIa;
	private BigDecimal accessoireIa;
	private String codeAvenantIa;
	private Set<GarantieGarantieChoisieIa> garantieGarantieChoisieIas = new HashSet<GarantieGarantieChoisieIa>(
			0);

	public GarantieChoisieIa() {
	}

	public GarantieChoisieIa(String codeGrtieChoisieIa) {
		this.codeGrtieChoisieIa = codeGrtieChoisieIa;
	}

	public GarantieChoisieIa(String codeGrtieChoisieIa, AssureIa assureIa,
			String libelleGarantieChoisieIa, Date dateGarantieChoisieIa,
			BigDecimal primeNetteIa, BigDecimal comgesIa,
			BigDecimal cominterIa, BigDecimal comconsIa, BigDecimal taxeIa,
			BigDecimal reductionIa, BigDecimal comaperIa,
			BigDecimal comcoassIa, BigDecimal accessoireIa,
			String codeAvenantIa,
			Set<GarantieGarantieChoisieIa> garantieGarantieChoisieIas) {
		this.codeGrtieChoisieIa = codeGrtieChoisieIa;
		this.assureIa = assureIa;
		this.libelleGarantieChoisieIa = libelleGarantieChoisieIa;
		this.dateGarantieChoisieIa = dateGarantieChoisieIa;
		this.primeNetteIa = primeNetteIa;
		this.comgesIa = comgesIa;
		this.cominterIa = cominterIa;
		this.comconsIa = comconsIa;
		this.taxeIa = taxeIa;
		this.reductionIa = reductionIa;
		this.comaperIa = comaperIa;
		this.comcoassIa = comcoassIa;
		this.accessoireIa = accessoireIa;
		this.codeAvenantIa = codeAvenantIa;
		this.garantieGarantieChoisieIas = garantieGarantieChoisieIas;
	}

	@Id
	@Column(name = "CODE_GRTIE_CHOISIE_IA", unique = true, nullable = false, length = 50)
	public String getCodeGrtieChoisieIa() {
		return this.codeGrtieChoisieIa;
	}

	public void setCodeGrtieChoisieIa(String codeGrtieChoisieIa) {
		this.codeGrtieChoisieIa = codeGrtieChoisieIa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NUM_IDENTIFICATION")
	public AssureIa getAssureIa() {
		return this.assureIa;
	}

	public void setAssureIa(AssureIa assureIa) {
		this.assureIa = assureIa;
	}

	@Column(name = "LIBELLE_GARANTIE_CHOISIE_IA", length = 50)
	public String getLibelleGarantieChoisieIa() {
		return this.libelleGarantieChoisieIa;
	}

	public void setLibelleGarantieChoisieIa(String libelleGarantieChoisieIa) {
		this.libelleGarantieChoisieIa = libelleGarantieChoisieIa;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_GARANTIE_CHOISIE_IA", length = 10)
	public Date getDateGarantieChoisieIa() {
		return this.dateGarantieChoisieIa;
	}

	public void setDateGarantieChoisieIa(Date dateGarantieChoisieIa) {
		this.dateGarantieChoisieIa = dateGarantieChoisieIa;
	}

	@Column(name = "PRIME_NETTE_IA", precision = 15, scale = 3)
	public BigDecimal getPrimeNetteIa() {
		return this.primeNetteIa;
	}

	public void setPrimeNetteIa(BigDecimal primeNetteIa) {
		this.primeNetteIa = primeNetteIa;
	}

	@Column(name = "COMGES_IA", precision = 15, scale = 3)
	public BigDecimal getComgesIa() {
		return this.comgesIa;
	}

	public void setComgesIa(BigDecimal comgesIa) {
		this.comgesIa = comgesIa;
	}

	@Column(name = "COMINTER_IA", precision = 15, scale = 3)
	public BigDecimal getCominterIa() {
		return this.cominterIa;
	}

	public void setCominterIa(BigDecimal cominterIa) {
		this.cominterIa = cominterIa;
	}

	@Column(name = "COMCONS_IA", precision = 15, scale = 3)
	public BigDecimal getComconsIa() {
		return this.comconsIa;
	}

	public void setComconsIa(BigDecimal comconsIa) {
		this.comconsIa = comconsIa;
	}

	@Column(name = "TAXE_IA", precision = 15, scale = 3)
	public BigDecimal getTaxeIa() {
		return this.taxeIa;
	}

	public void setTaxeIa(BigDecimal taxeIa) {
		this.taxeIa = taxeIa;
	}

	@Column(name = "REDUCTION_IA", precision = 15, scale = 3)
	public BigDecimal getReductionIa() {
		return this.reductionIa;
	}

	public void setReductionIa(BigDecimal reductionIa) {
		this.reductionIa = reductionIa;
	}

	@Column(name = "COMAPER_IA", precision = 15, scale = 3)
	public BigDecimal getComaperIa() {
		return this.comaperIa;
	}

	public void setComaperIa(BigDecimal comaperIa) {
		this.comaperIa = comaperIa;
	}

	@Column(name = "COMCOASS_IA", precision = 15, scale = 3)
	public BigDecimal getComcoassIa() {
		return this.comcoassIa;
	}

	public void setComcoassIa(BigDecimal comcoassIa) {
		this.comcoassIa = comcoassIa;
	}

	@Column(name = "ACCESSOIRE_IA", precision = 15, scale = 3)
	public BigDecimal getAccessoireIa() {
		return this.accessoireIa;
	}

	public void setAccessoireIa(BigDecimal accessoireIa) {
		this.accessoireIa = accessoireIa;
	}

	@Column(name = "CODE_AVENANT_IA", length = 28)
	public String getCodeAvenantIa() {
		return this.codeAvenantIa;
	}

	public void setCodeAvenantIa(String codeAvenantIa) {
		this.codeAvenantIa = codeAvenantIa;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "garantieChoisieIa")
	public Set<GarantieGarantieChoisieIa> getGarantieGarantieChoisieIas() {
		return this.garantieGarantieChoisieIas;
	}

	public void setGarantieGarantieChoisieIas(
			Set<GarantieGarantieChoisieIa> garantieGarantieChoisieIas) {
		this.garantieGarantieChoisieIas = garantieGarantieChoisieIas;
	}

}
