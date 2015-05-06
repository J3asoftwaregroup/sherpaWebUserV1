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
 * AlimentSinistre generated by hbm2java
 */
@Entity
@Table(name = "aliment_sinistre", catalog = "zeusbd")
public class AlimentSinistre implements java.io.Serializable {

	private AlimentSinistreId id;
	private Aliment aliment;
	private Sinistre sinistre;
	private String circonstancesSinistreFaculte;
	private String dommagesSinistreFaculte;
	private Date dateArriveeFaculte;
	private String bnlFaculte;
	private String refAssureSinistreFaculte;
	private String lieuConn;
	private Integer qteAssFaculte;
	private Integer qtePerdueFaculte;
	private String ltaFaculte;
	private BigDecimal respTiersFaculte;
	private Date dateLettreVoiture;
	private String lettreVoiture;
	private Date dateSinistreFaculte;
	private Date dateConn;

	public AlimentSinistre() {
	}

	public AlimentSinistre(AlimentSinistreId id, Aliment aliment,
			Sinistre sinistre) {
		this.id = id;
		this.aliment = aliment;
		this.sinistre = sinistre;
	}

	public AlimentSinistre(AlimentSinistreId id, Aliment aliment,
			Sinistre sinistre, String circonstancesSinistreFaculte,
			String dommagesSinistreFaculte, Date dateArriveeFaculte,
			String bnlFaculte, String refAssureSinistreFaculte,
			String lieuConn, Integer qteAssFaculte, Integer qtePerdueFaculte,
			String ltaFaculte, BigDecimal respTiersFaculte,
			Date dateLettreVoiture, String lettreVoiture,
			Date dateSinistreFaculte, Date dateConn) {
		this.id = id;
		this.aliment = aliment;
		this.sinistre = sinistre;
		this.circonstancesSinistreFaculte = circonstancesSinistreFaculte;
		this.dommagesSinistreFaculte = dommagesSinistreFaculte;
		this.dateArriveeFaculte = dateArriveeFaculte;
		this.bnlFaculte = bnlFaculte;
		this.refAssureSinistreFaculte = refAssureSinistreFaculte;
		this.lieuConn = lieuConn;
		this.qteAssFaculte = qteAssFaculte;
		this.qtePerdueFaculte = qtePerdueFaculte;
		this.ltaFaculte = ltaFaculte;
		this.respTiersFaculte = respTiersFaculte;
		this.dateLettreVoiture = dateLettreVoiture;
		this.lettreVoiture = lettreVoiture;
		this.dateSinistreFaculte = dateSinistreFaculte;
		this.dateConn = dateConn;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codeSinistre", column = @Column(name = "CODE_SINISTRE", nullable = false, length = 40)),
			@AttributeOverride(name = "codeAliment", column = @Column(name = "CODE_ALIMENT", nullable = false, length = 35)) })
	public AlimentSinistreId getId() {
		return this.id;
	}

	public void setId(AlimentSinistreId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODE_ALIMENT", nullable = false, insertable = false, updatable = false)
	public Aliment getAliment() {
		return this.aliment;
	}

	public void setAliment(Aliment aliment) {
		this.aliment = aliment;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODE_SINISTRE", nullable = false, insertable = false, updatable = false)
	public Sinistre getSinistre() {
		return this.sinistre;
	}

	public void setSinistre(Sinistre sinistre) {
		this.sinistre = sinistre;
	}

	@Column(name = "CIRCONSTANCES_SINISTRE_FACULTE", length = 65535)
	public String getCirconstancesSinistreFaculte() {
		return this.circonstancesSinistreFaculte;
	}

	public void setCirconstancesSinistreFaculte(
			String circonstancesSinistreFaculte) {
		this.circonstancesSinistreFaculte = circonstancesSinistreFaculte;
	}

	@Column(name = "DOMMAGES_SINISTRE_FACULTE", length = 65535)
	public String getDommagesSinistreFaculte() {
		return this.dommagesSinistreFaculte;
	}

	public void setDommagesSinistreFaculte(String dommagesSinistreFaculte) {
		this.dommagesSinistreFaculte = dommagesSinistreFaculte;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_ARRIVEE_FACULTE", length = 19)
	public Date getDateArriveeFaculte() {
		return this.dateArriveeFaculte;
	}

	public void setDateArriveeFaculte(Date dateArriveeFaculte) {
		this.dateArriveeFaculte = dateArriveeFaculte;
	}

	@Column(name = "BNL_FACULTE", length = 10)
	public String getBnlFaculte() {
		return this.bnlFaculte;
	}

	public void setBnlFaculte(String bnlFaculte) {
		this.bnlFaculte = bnlFaculte;
	}

	@Column(name = "REF_ASSURE_SINISTRE_FACULTE", length = 20)
	public String getRefAssureSinistreFaculte() {
		return this.refAssureSinistreFaculte;
	}

	public void setRefAssureSinistreFaculte(String refAssureSinistreFaculte) {
		this.refAssureSinistreFaculte = refAssureSinistreFaculte;
	}

	@Column(name = "LIEU_CONN", length = 60)
	public String getLieuConn() {
		return this.lieuConn;
	}

	public void setLieuConn(String lieuConn) {
		this.lieuConn = lieuConn;
	}

	@Column(name = "QTE_ASS_FACULTE")
	public Integer getQteAssFaculte() {
		return this.qteAssFaculte;
	}

	public void setQteAssFaculte(Integer qteAssFaculte) {
		this.qteAssFaculte = qteAssFaculte;
	}

	@Column(name = "QTE_PERDUE_FACULTE")
	public Integer getQtePerdueFaculte() {
		return this.qtePerdueFaculte;
	}

	public void setQtePerdueFaculte(Integer qtePerdueFaculte) {
		this.qtePerdueFaculte = qtePerdueFaculte;
	}

	@Column(name = "LTA_FACULTE", length = 60)
	public String getLtaFaculte() {
		return this.ltaFaculte;
	}

	public void setLtaFaculte(String ltaFaculte) {
		this.ltaFaculte = ltaFaculte;
	}

	@Column(name = "RESP_TIERS_FACULTE", precision = 15, scale = 3)
	public BigDecimal getRespTiersFaculte() {
		return this.respTiersFaculte;
	}

	public void setRespTiersFaculte(BigDecimal respTiersFaculte) {
		this.respTiersFaculte = respTiersFaculte;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_LETTRE_VOITURE", length = 19)
	public Date getDateLettreVoiture() {
		return this.dateLettreVoiture;
	}

	public void setDateLettreVoiture(Date dateLettreVoiture) {
		this.dateLettreVoiture = dateLettreVoiture;
	}

	@Column(name = "LETTRE_VOITURE", length = 65535)
	public String getLettreVoiture() {
		return this.lettreVoiture;
	}

	public void setLettreVoiture(String lettreVoiture) {
		this.lettreVoiture = lettreVoiture;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_SINISTRE_FACULTE", length = 19)
	public Date getDateSinistreFaculte() {
		return this.dateSinistreFaculte;
	}

	public void setDateSinistreFaculte(Date dateSinistreFaculte) {
		this.dateSinistreFaculte = dateSinistreFaculte;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_CONN", length = 19)
	public Date getDateConn() {
		return this.dateConn;
	}

	public void setDateConn(Date dateConn) {
		this.dateConn = dateConn;
	}

}