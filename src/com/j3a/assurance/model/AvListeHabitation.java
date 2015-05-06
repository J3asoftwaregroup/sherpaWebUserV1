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
 * AvListeHabitation generated by hbm2java
 */
@Entity
@Table(name = "av_liste_habitation", catalog = "zeusbd")
public class AvListeHabitation implements java.io.Serializable {

	private AvListeHabitationId id;
	private Avenant avenant;
	private ListeHabitation listeHabitation;
	private Date dateAvListeHabitation;

	public AvListeHabitation() {
	}

	public AvListeHabitation(AvListeHabitationId id, Avenant avenant,
			ListeHabitation listeHabitation) {
		this.id = id;
		this.avenant = avenant;
		this.listeHabitation = listeHabitation;
	}

	public AvListeHabitation(AvListeHabitationId id, Avenant avenant,
			ListeHabitation listeHabitation, Date dateAvListeHabitation) {
		this.id = id;
		this.avenant = avenant;
		this.listeHabitation = listeHabitation;
		this.dateAvListeHabitation = dateAvListeHabitation;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codeListeHabitation", column = @Column(name = "CODE_LISTE_HABITATION", nullable = false, length = 27)),
			@AttributeOverride(name = "numAvenant", column = @Column(name = "NUM_AVENANT", nullable = false, length = 25)) })
	public AvListeHabitationId getId() {
		return this.id;
	}

	public void setId(AvListeHabitationId id) {
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
	@JoinColumn(name = "CODE_LISTE_HABITATION", nullable = false, insertable = false, updatable = false)
	public ListeHabitation getListeHabitation() {
		return this.listeHabitation;
	}

	public void setListeHabitation(ListeHabitation listeHabitation) {
		this.listeHabitation = listeHabitation;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_AV_LISTE_HABITATION", length = 10)
	public Date getDateAvListeHabitation() {
		return this.dateAvListeHabitation;
	}

	public void setDateAvListeHabitation(Date dateAvListeHabitation) {
		this.dateAvListeHabitation = dateAvListeHabitation;
	}

}