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
 * ListeAdherentSante generated by hbm2java
 */
@Entity
@Table(name = "liste_adherent_sante", catalog = "zeusbd")
public class ListeAdherentSante implements java.io.Serializable {

	private ListeAdherentSanteId id;
	private AdherentsSante adherentsSante;
	private ListeAdherent listeAdherent;
	private Date dateLas;

	public ListeAdherentSante() {
	}

	public ListeAdherentSante(ListeAdherentSanteId id,
			AdherentsSante adherentsSante, ListeAdherent listeAdherent) {
		this.id = id;
		this.adherentsSante = adherentsSante;
		this.listeAdherent = listeAdherent;
	}

	public ListeAdherentSante(ListeAdherentSanteId id,
			AdherentsSante adherentsSante, ListeAdherent listeAdherent,
			Date dateLas) {
		this.id = id;
		this.adherentsSante = adherentsSante;
		this.listeAdherent = listeAdherent;
		this.dateLas = dateLas;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codeListeAdherent", column = @Column(name = "CODE_LISTE_ADHERENT", nullable = false, length = 60)),
			@AttributeOverride(name = "codeAdherent", column = @Column(name = "CODE_ADHERENT", nullable = false, length = 60)) })
	public ListeAdherentSanteId getId() {
		return this.id;
	}

	public void setId(ListeAdherentSanteId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODE_ADHERENT", nullable = false, insertable = false, updatable = false)
	public AdherentsSante getAdherentsSante() {
		return this.adherentsSante;
	}

	public void setAdherentsSante(AdherentsSante adherentsSante) {
		this.adherentsSante = adherentsSante;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODE_LISTE_ADHERENT", nullable = false, insertable = false, updatable = false)
	public ListeAdherent getListeAdherent() {
		return this.listeAdherent;
	}

	public void setListeAdherent(ListeAdherent listeAdherent) {
		this.listeAdherent = listeAdherent;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_LAS", length = 19)
	public Date getDateLas() {
		return this.dateLas;
	}

	public void setDateLas(Date dateLas) {
		this.dateLas = dateLas;
	}

}
