package com.j3a.assurance.model;

// Generated 5 mai 2015 11:21:10 by Hibernate Tools 4.3.1

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
 * AvenantRisqueNta generated by hbm2java
 */
@Entity
@Table(name = "avenant_risque_nta", catalog = "zeusbd")
public class AvenantRisqueNta implements java.io.Serializable {

	private AvenantRisqueNtaId id;
	private Avenant avenant;
	private RisqueNta risqueNta;
	private Date dateAvenantRisquenta;

	public AvenantRisqueNta() {
	}

	public AvenantRisqueNta(AvenantRisqueNtaId id, Avenant avenant,
			RisqueNta risqueNta) {
		this.id = id;
		this.avenant = avenant;
		this.risqueNta = risqueNta;
	}

	public AvenantRisqueNta(AvenantRisqueNtaId id, Avenant avenant,
			RisqueNta risqueNta, Date dateAvenantRisquenta) {
		this.id = id;
		this.avenant = avenant;
		this.risqueNta = risqueNta;
		this.dateAvenantRisquenta = dateAvenantRisquenta;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "numAvenant", column = @Column(name = "NUM_AVENANT", nullable = false, length = 25)),
			@AttributeOverride(name = "codeRisquenta", column = @Column(name = "CODE_RISQUENTA", nullable = false, length = 30)) })
	public AvenantRisqueNtaId getId() {
		return this.id;
	}

	public void setId(AvenantRisqueNtaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NUM_AVENANT", nullable = false, insertable = false, updatable = false)
	public Avenant getAvenant() {
		return this.avenant;
	}

	public void setAvenant(Avenant avenant) {
		this.avenant = avenant;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODE_RISQUENTA", nullable = false, insertable = false, updatable = false)
	public RisqueNta getRisqueNta() {
		return this.risqueNta;
	}

	public void setRisqueNta(RisqueNta risqueNta) {
		this.risqueNta = risqueNta;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_AVENANT_RISQUENTA", length = 10)
	public Date getDateAvenantRisquenta() {
		return this.dateAvenantRisquenta;
	}

	public void setDateAvenantRisquenta(Date dateAvenantRisquenta) {
		this.dateAvenantRisquenta = dateAvenantRisquenta;
	}

}