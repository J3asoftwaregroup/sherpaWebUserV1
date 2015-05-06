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
 * GarantieChoisieMrh generated by hbm2java
 */
@Entity
@Table(name = "garantie_choisie_mrh", catalog = "zeusbd")
public class GarantieChoisieMrh implements java.io.Serializable {

	private String codeGarantieChoisiemrh;
	private Habitation habitation;
	private String libelleGarantieChoisiemrh;
	private Date dateGarantieChoisiemrh;
	private BigDecimal primeNettemrh;
	private BigDecimal comgesmrh;
	private BigDecimal comintermrh;
	private BigDecimal comconsmrh;
	private BigDecimal taxemrh;
	private BigDecimal reductionmrh;
	private BigDecimal comaperMrh;
	private BigDecimal comcoassmrh;
	private BigDecimal accessoiremrh;
	private String codeAvenantMrh;
	private Set<GarantieGarantieChoisieMrh> garantieGarantieChoisieMrhs = new HashSet<GarantieGarantieChoisieMrh>(
			0);

	public GarantieChoisieMrh() {
	}

	public GarantieChoisieMrh(String codeGarantieChoisiemrh) {
		this.codeGarantieChoisiemrh = codeGarantieChoisiemrh;
	}

	public GarantieChoisieMrh(String codeGarantieChoisiemrh,
			Habitation habitation, String libelleGarantieChoisiemrh,
			Date dateGarantieChoisiemrh, BigDecimal primeNettemrh,
			BigDecimal comgesmrh, BigDecimal comintermrh,
			BigDecimal comconsmrh, BigDecimal taxemrh, BigDecimal reductionmrh,
			BigDecimal comaperMrh, BigDecimal comcoassmrh,
			BigDecimal accessoiremrh, String codeAvenantMrh,
			Set<GarantieGarantieChoisieMrh> garantieGarantieChoisieMrhs) {
		this.codeGarantieChoisiemrh = codeGarantieChoisiemrh;
		this.habitation = habitation;
		this.libelleGarantieChoisiemrh = libelleGarantieChoisiemrh;
		this.dateGarantieChoisiemrh = dateGarantieChoisiemrh;
		this.primeNettemrh = primeNettemrh;
		this.comgesmrh = comgesmrh;
		this.comintermrh = comintermrh;
		this.comconsmrh = comconsmrh;
		this.taxemrh = taxemrh;
		this.reductionmrh = reductionmrh;
		this.comaperMrh = comaperMrh;
		this.comcoassmrh = comcoassmrh;
		this.accessoiremrh = accessoiremrh;
		this.codeAvenantMrh = codeAvenantMrh;
		this.garantieGarantieChoisieMrhs = garantieGarantieChoisieMrhs;
	}

	@Id
	@Column(name = "CODE_GARANTIE_CHOISIEMRH", unique = true, nullable = false, length = 35)
	public String getCodeGarantieChoisiemrh() {
		return this.codeGarantieChoisiemrh;
	}

	public void setCodeGarantieChoisiemrh(String codeGarantieChoisiemrh) {
		this.codeGarantieChoisiemrh = codeGarantieChoisiemrh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODE_HABITATION")
	public Habitation getHabitation() {
		return this.habitation;
	}

	public void setHabitation(Habitation habitation) {
		this.habitation = habitation;
	}

	@Column(name = "LIBELLE_GARANTIE_CHOISIEMRH", length = 50)
	public String getLibelleGarantieChoisiemrh() {
		return this.libelleGarantieChoisiemrh;
	}

	public void setLibelleGarantieChoisiemrh(String libelleGarantieChoisiemrh) {
		this.libelleGarantieChoisiemrh = libelleGarantieChoisiemrh;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_GARANTIE_CHOISIEMRH", length = 10)
	public Date getDateGarantieChoisiemrh() {
		return this.dateGarantieChoisiemrh;
	}

	public void setDateGarantieChoisiemrh(Date dateGarantieChoisiemrh) {
		this.dateGarantieChoisiemrh = dateGarantieChoisiemrh;
	}

	@Column(name = "PRIME_NETTEMRH", precision = 15, scale = 3)
	public BigDecimal getPrimeNettemrh() {
		return this.primeNettemrh;
	}

	public void setPrimeNettemrh(BigDecimal primeNettemrh) {
		this.primeNettemrh = primeNettemrh;
	}

	@Column(name = "COMGESMRH", precision = 15, scale = 3)
	public BigDecimal getComgesmrh() {
		return this.comgesmrh;
	}

	public void setComgesmrh(BigDecimal comgesmrh) {
		this.comgesmrh = comgesmrh;
	}

	@Column(name = "COMINTERMRH", precision = 15, scale = 3)
	public BigDecimal getComintermrh() {
		return this.comintermrh;
	}

	public void setComintermrh(BigDecimal comintermrh) {
		this.comintermrh = comintermrh;
	}

	@Column(name = "COMCONSMRH", precision = 15, scale = 3)
	public BigDecimal getComconsmrh() {
		return this.comconsmrh;
	}

	public void setComconsmrh(BigDecimal comconsmrh) {
		this.comconsmrh = comconsmrh;
	}

	@Column(name = "TAXEMRH", precision = 15, scale = 3)
	public BigDecimal getTaxemrh() {
		return this.taxemrh;
	}

	public void setTaxemrh(BigDecimal taxemrh) {
		this.taxemrh = taxemrh;
	}

	@Column(name = "REDUCTIONMRH", precision = 15, scale = 3)
	public BigDecimal getReductionmrh() {
		return this.reductionmrh;
	}

	public void setReductionmrh(BigDecimal reductionmrh) {
		this.reductionmrh = reductionmrh;
	}

	@Column(name = "COMAPER_MRH", precision = 15, scale = 3)
	public BigDecimal getComaperMrh() {
		return this.comaperMrh;
	}

	public void setComaperMrh(BigDecimal comaperMrh) {
		this.comaperMrh = comaperMrh;
	}

	@Column(name = "COMCOASSMRH", precision = 15, scale = 3)
	public BigDecimal getComcoassmrh() {
		return this.comcoassmrh;
	}

	public void setComcoassmrh(BigDecimal comcoassmrh) {
		this.comcoassmrh = comcoassmrh;
	}

	@Column(name = "ACCESSOIREMRH", precision = 15, scale = 3)
	public BigDecimal getAccessoiremrh() {
		return this.accessoiremrh;
	}

	public void setAccessoiremrh(BigDecimal accessoiremrh) {
		this.accessoiremrh = accessoiremrh;
	}

	@Column(name = "CODE_AVENANT_MRH", length = 28)
	public String getCodeAvenantMrh() {
		return this.codeAvenantMrh;
	}

	public void setCodeAvenantMrh(String codeAvenantMrh) {
		this.codeAvenantMrh = codeAvenantMrh;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "garantieChoisieMrh")
	public Set<GarantieGarantieChoisieMrh> getGarantieGarantieChoisieMrhs() {
		return this.garantieGarantieChoisieMrhs;
	}

	public void setGarantieGarantieChoisieMrhs(
			Set<GarantieGarantieChoisieMrh> garantieGarantieChoisieMrhs) {
		this.garantieGarantieChoisieMrhs = garantieGarantieChoisieMrhs;
	}

}