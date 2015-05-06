package com.j3a.assurance.model;

// Generated 5 mai 2015 11:21:10 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Permis generated by hbm2java
 */
@Entity
@Table(name = "permis", catalog = "zeusbd")
public class Permis implements java.io.Serializable {

	private String idPermis;
	private Physique physique;
	private String numeroPermis;
	private Date datePermis;
	private Short dureePermis;
	private String typePermis;

	public Permis() {
	}

	public Permis(String idPermis, Physique physique) {
		this.idPermis = idPermis;
		this.physique = physique;
	}

	public Permis(String idPermis, Physique physique, String numeroPermis,
			Date datePermis, Short dureePermis, String typePermis) {
		this.idPermis = idPermis;
		this.physique = physique;
		this.numeroPermis = numeroPermis;
		this.datePermis = datePermis;
		this.dureePermis = dureePermis;
		this.typePermis = typePermis;
	}

	@Id
	@Column(name = "ID_PERMIS", unique = true, nullable = false, length = 20)
	public String getIdPermis() {
		return this.idPermis;
	}

	public void setIdPermis(String idPermis) {
		this.idPermis = idPermis;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NUM_SOUSCRIPTEUR", nullable = false)
	public Physique getPhysique() {
		return this.physique;
	}

	public void setPhysique(Physique physique) {
		this.physique = physique;
	}

	@Column(name = "NUMERO_PERMIS", length = 30)
	public String getNumeroPermis() {
		return this.numeroPermis;
	}

	public void setNumeroPermis(String numeroPermis) {
		this.numeroPermis = numeroPermis;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_PERMIS", length = 10)
	public Date getDatePermis() {
		return this.datePermis;
	}

	public void setDatePermis(Date datePermis) {
		this.datePermis = datePermis;
	}

	@Column(name = "DUREE_PERMIS")
	public Short getDureePermis() {
		return this.dureePermis;
	}

	public void setDureePermis(Short dureePermis) {
		this.dureePermis = dureePermis;
	}

	@Column(name = "TYPE_PERMIS", length = 10)
	public String getTypePermis() {
		return this.typePermis;
	}

	public void setTypePermis(String typePermis) {
		this.typePermis = typePermis;
	}

}
