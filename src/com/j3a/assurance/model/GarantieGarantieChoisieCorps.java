package com.j3a.assurance.model;

// Generated 5 mai 2015 11:21:10 by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * GarantieGarantieChoisieCorps generated by hbm2java
 */
@Entity
@Table(name = "garantie_garantie_choisie_corps", catalog = "zeusbd")
public class GarantieGarantieChoisieCorps implements java.io.Serializable {

	private GarantieGarantieChoisieCorpsId id;
	private Garantie garantie;
	private GarantieChoisieTransportCorps garantieChoisieTransportCorps;
	private String natureCorps;
	private BigDecimal tauxCorps;
	private BigDecimal minimumCorps;
	private BigDecimal maximumCrops;
	private Date dateGarantieChoisieCorps;
	private BigDecimal montantGarantieCorps;
	private BigDecimal tauxFranchiseCorps;
	private BigDecimal primeAnnuelleCorps;
	private BigDecimal primeNetteAnnuelleCorps;
	private BigDecimal reductionCorps;
	private String smp;
	private BigDecimal tauxPrime;
	private BigDecimal tauxLci;
	private BigDecimal tauxRedcorps;
	private BigDecimal tauxGescorps;
	private BigDecimal tauxComcoass;
	private BigDecimal tauxinterm;
	private BigDecimal tauxcons;
	private BigDecimal tauxredfranch;
	private BigDecimal tauxcouv;
	private String observation;
	private BigDecimal capitalCorps;

	public GarantieGarantieChoisieCorps() {
	}

	public GarantieGarantieChoisieCorps(GarantieGarantieChoisieCorpsId id,
			Garantie garantie,
			GarantieChoisieTransportCorps garantieChoisieTransportCorps) {
		this.id = id;
		this.garantie = garantie;
		this.garantieChoisieTransportCorps = garantieChoisieTransportCorps;
	}

	public GarantieGarantieChoisieCorps(GarantieGarantieChoisieCorpsId id,
			Garantie garantie,
			GarantieChoisieTransportCorps garantieChoisieTransportCorps,
			String natureCorps, BigDecimal tauxCorps, BigDecimal minimumCorps,
			BigDecimal maximumCrops, Date dateGarantieChoisieCorps,
			BigDecimal montantGarantieCorps, BigDecimal tauxFranchiseCorps,
			BigDecimal primeAnnuelleCorps, BigDecimal primeNetteAnnuelleCorps,
			BigDecimal reductionCorps, String smp, BigDecimal tauxPrime,
			BigDecimal tauxLci, BigDecimal tauxRedcorps,
			BigDecimal tauxGescorps, BigDecimal tauxComcoass,
			BigDecimal tauxinterm, BigDecimal tauxcons,
			BigDecimal tauxredfranch, BigDecimal tauxcouv, String observation,
			BigDecimal capitalCorps) {
		this.id = id;
		this.garantie = garantie;
		this.garantieChoisieTransportCorps = garantieChoisieTransportCorps;
		this.natureCorps = natureCorps;
		this.tauxCorps = tauxCorps;
		this.minimumCorps = minimumCorps;
		this.maximumCrops = maximumCrops;
		this.dateGarantieChoisieCorps = dateGarantieChoisieCorps;
		this.montantGarantieCorps = montantGarantieCorps;
		this.tauxFranchiseCorps = tauxFranchiseCorps;
		this.primeAnnuelleCorps = primeAnnuelleCorps;
		this.primeNetteAnnuelleCorps = primeNetteAnnuelleCorps;
		this.reductionCorps = reductionCorps;
		this.smp = smp;
		this.tauxPrime = tauxPrime;
		this.tauxLci = tauxLci;
		this.tauxRedcorps = tauxRedcorps;
		this.tauxGescorps = tauxGescorps;
		this.tauxComcoass = tauxComcoass;
		this.tauxinterm = tauxinterm;
		this.tauxcons = tauxcons;
		this.tauxredfranch = tauxredfranch;
		this.tauxcouv = tauxcouv;
		this.observation = observation;
		this.capitalCorps = capitalCorps;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codeGrtieChoisieTrspCorps", column = @Column(name = "CODE_GRTIE_CHOISIE_TRSP_CORPS", nullable = false, length = 35)),
			@AttributeOverride(name = "codeGarantie", column = @Column(name = "CODE_GARANTIE", nullable = false, length = 12)) })
	public GarantieGarantieChoisieCorpsId getId() {
		return this.id;
	}

	public void setId(GarantieGarantieChoisieCorpsId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODE_GARANTIE", nullable = false, insertable = false, updatable = false)
	public Garantie getGarantie() {
		return this.garantie;
	}

	public void setGarantie(Garantie garantie) {
		this.garantie = garantie;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODE_GRTIE_CHOISIE_TRSP_CORPS", nullable = false, insertable = false, updatable = false)
	public GarantieChoisieTransportCorps getGarantieChoisieTransportCorps() {
		return this.garantieChoisieTransportCorps;
	}

	public void setGarantieChoisieTransportCorps(
			GarantieChoisieTransportCorps garantieChoisieTransportCorps) {
		this.garantieChoisieTransportCorps = garantieChoisieTransportCorps;
	}

	@Column(name = "NATURE_CORPS", length = 30)
	public String getNatureCorps() {
		return this.natureCorps;
	}

	public void setNatureCorps(String natureCorps) {
		this.natureCorps = natureCorps;
	}

	@Column(name = "TAUX_CORPS", precision = 6, scale = 4)
	public BigDecimal getTauxCorps() {
		return this.tauxCorps;
	}

	public void setTauxCorps(BigDecimal tauxCorps) {
		this.tauxCorps = tauxCorps;
	}

	@Column(name = "MINIMUM_CORPS", precision = 15, scale = 3)
	public BigDecimal getMinimumCorps() {
		return this.minimumCorps;
	}

	public void setMinimumCorps(BigDecimal minimumCorps) {
		this.minimumCorps = minimumCorps;
	}

	@Column(name = "MAXIMUM_CROPS", precision = 15, scale = 3)
	public BigDecimal getMaximumCrops() {
		return this.maximumCrops;
	}

	public void setMaximumCrops(BigDecimal maximumCrops) {
		this.maximumCrops = maximumCrops;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_GARANTIE_CHOISIE_CORPS", length = 10)
	public Date getDateGarantieChoisieCorps() {
		return this.dateGarantieChoisieCorps;
	}

	public void setDateGarantieChoisieCorps(Date dateGarantieChoisieCorps) {
		this.dateGarantieChoisieCorps = dateGarantieChoisieCorps;
	}

	@Column(name = "MONTANT_GARANTIE_CORPS", precision = 15, scale = 3)
	public BigDecimal getMontantGarantieCorps() {
		return this.montantGarantieCorps;
	}

	public void setMontantGarantieCorps(BigDecimal montantGarantieCorps) {
		this.montantGarantieCorps = montantGarantieCorps;
	}

	@Column(name = "TAUX_FRANCHISE_CORPS", precision = 6, scale = 4)
	public BigDecimal getTauxFranchiseCorps() {
		return this.tauxFranchiseCorps;
	}

	public void setTauxFranchiseCorps(BigDecimal tauxFranchiseCorps) {
		this.tauxFranchiseCorps = tauxFranchiseCorps;
	}

	@Column(name = "PRIME_ANNUELLE_CORPS", precision = 15, scale = 3)
	public BigDecimal getPrimeAnnuelleCorps() {
		return this.primeAnnuelleCorps;
	}

	public void setPrimeAnnuelleCorps(BigDecimal primeAnnuelleCorps) {
		this.primeAnnuelleCorps = primeAnnuelleCorps;
	}

	@Column(name = "PRIME_NETTE_ANNUELLE_CORPS", precision = 15, scale = 3)
	public BigDecimal getPrimeNetteAnnuelleCorps() {
		return this.primeNetteAnnuelleCorps;
	}

	public void setPrimeNetteAnnuelleCorps(BigDecimal primeNetteAnnuelleCorps) {
		this.primeNetteAnnuelleCorps = primeNetteAnnuelleCorps;
	}

	@Column(name = "REDUCTION_CORPS", precision = 15, scale = 3)
	public BigDecimal getReductionCorps() {
		return this.reductionCorps;
	}

	public void setReductionCorps(BigDecimal reductionCorps) {
		this.reductionCorps = reductionCorps;
	}

	@Column(name = "SMP", length = 50)
	public String getSmp() {
		return this.smp;
	}

	public void setSmp(String smp) {
		this.smp = smp;
	}

	@Column(name = "TAUX_PRIME", precision = 6, scale = 4)
	public BigDecimal getTauxPrime() {
		return this.tauxPrime;
	}

	public void setTauxPrime(BigDecimal tauxPrime) {
		this.tauxPrime = tauxPrime;
	}

	@Column(name = "TAUX_LCI", precision = 6, scale = 4)
	public BigDecimal getTauxLci() {
		return this.tauxLci;
	}

	public void setTauxLci(BigDecimal tauxLci) {
		this.tauxLci = tauxLci;
	}

	@Column(name = "TAUX_REDCORPS", precision = 6, scale = 4)
	public BigDecimal getTauxRedcorps() {
		return this.tauxRedcorps;
	}

	public void setTauxRedcorps(BigDecimal tauxRedcorps) {
		this.tauxRedcorps = tauxRedcorps;
	}

	@Column(name = "TAUX_GESCORPS", precision = 6, scale = 4)
	public BigDecimal getTauxGescorps() {
		return this.tauxGescorps;
	}

	public void setTauxGescorps(BigDecimal tauxGescorps) {
		this.tauxGescorps = tauxGescorps;
	}

	@Column(name = "TAUX_COMCOASS", precision = 6, scale = 4)
	public BigDecimal getTauxComcoass() {
		return this.tauxComcoass;
	}

	public void setTauxComcoass(BigDecimal tauxComcoass) {
		this.tauxComcoass = tauxComcoass;
	}

	@Column(name = "TAUXINTERM", precision = 6, scale = 4)
	public BigDecimal getTauxinterm() {
		return this.tauxinterm;
	}

	public void setTauxinterm(BigDecimal tauxinterm) {
		this.tauxinterm = tauxinterm;
	}

	@Column(name = "TAUXCONS", precision = 6, scale = 4)
	public BigDecimal getTauxcons() {
		return this.tauxcons;
	}

	public void setTauxcons(BigDecimal tauxcons) {
		this.tauxcons = tauxcons;
	}

	@Column(name = "TAUXREDFRANCH", precision = 6, scale = 4)
	public BigDecimal getTauxredfranch() {
		return this.tauxredfranch;
	}

	public void setTauxredfranch(BigDecimal tauxredfranch) {
		this.tauxredfranch = tauxredfranch;
	}

	@Column(name = "TAUXCOUV", precision = 6, scale = 4)
	public BigDecimal getTauxcouv() {
		return this.tauxcouv;
	}

	public void setTauxcouv(BigDecimal tauxcouv) {
		this.tauxcouv = tauxcouv;
	}

	@Column(name = "OBSERVATION", length = 50)
	public String getObservation() {
		return this.observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	@Column(name = "CAPITAL_CORPS", precision = 15, scale = 3)
	public BigDecimal getCapitalCorps() {
		return this.capitalCorps;
	}

	public void setCapitalCorps(BigDecimal capitalCorps) {
		this.capitalCorps = capitalCorps;
	}

}