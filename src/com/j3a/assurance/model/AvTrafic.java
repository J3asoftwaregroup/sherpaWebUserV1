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
 * AvTrafic generated by hbm2java
 */
@Entity
@Table(name = "av_trafic", catalog = "zeusbd")
public class AvTrafic implements java.io.Serializable {

	private AvTraficId id;
	private Avenant avenant;
	private ListeTrafic listeTrafic;
	private Date dateAvTrafic;

	public AvTrafic() {
	}

	public AvTrafic(AvTraficId id, Avenant avenant, ListeTrafic listeTrafic) {
		this.id = id;
		this.avenant = avenant;
		this.listeTrafic = listeTrafic;
	}

	public AvTrafic(AvTraficId id, Avenant avenant, ListeTrafic listeTrafic,
			Date dateAvTrafic) {
		this.id = id;
		this.avenant = avenant;
		this.listeTrafic = listeTrafic;
		this.dateAvTrafic = dateAvTrafic;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "numAvenant", column = @Column(name = "NUM_AVENANT", nullable = false, length = 25)),
			@AttributeOverride(name = "codeListeTrafic", column = @Column(name = "CODE_LISTE_TRAFIC", nullable = false, length = 27)) })
	public AvTraficId getId() {
		return this.id;
	}

	public void setId(AvTraficId id) {
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
	@JoinColumn(name = "CODE_LISTE_TRAFIC", nullable = false, insertable = false, updatable = false)
	public ListeTrafic getListeTrafic() {
		return this.listeTrafic;
	}

	public void setListeTrafic(ListeTrafic listeTrafic) {
		this.listeTrafic = listeTrafic;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_AV_TRAFIC", length = 19)
	public Date getDateAvTrafic() {
		return this.dateAvTrafic;
	}

	public void setDateAvTrafic(Date dateAvTrafic) {
		this.dateAvTrafic = dateAvTrafic;
	}

}
