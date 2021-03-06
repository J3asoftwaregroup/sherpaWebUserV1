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
 * CorpsSinistre generated by hbm2java
 */
@Entity
@Table(name = "corps_sinistre", catalog = "zeusbd")
public class CorpsSinistre implements java.io.Serializable {

	private CorpsSinistreId id;
	private CorpsEngin corpsEngin;
	private Sinistre sinistre;
	private String circonstancesSinistreCorps;
	private String dommagesSinistreCorps;
	private String refAssureCorps;
	private String numPvSinistreCorps;
	private Date dateSinistreCorps;

	public CorpsSinistre() {
	}

	public CorpsSinistre(CorpsSinistreId id, CorpsEngin corpsEngin,
			Sinistre sinistre) {
		this.id = id;
		this.corpsEngin = corpsEngin;
		this.sinistre = sinistre;
	}

	public CorpsSinistre(CorpsSinistreId id, CorpsEngin corpsEngin,
			Sinistre sinistre, String circonstancesSinistreCorps,
			String dommagesSinistreCorps, String refAssureCorps,
			String numPvSinistreCorps, Date dateSinistreCorps) {
		this.id = id;
		this.corpsEngin = corpsEngin;
		this.sinistre = sinistre;
		this.circonstancesSinistreCorps = circonstancesSinistreCorps;
		this.dommagesSinistreCorps = dommagesSinistreCorps;
		this.refAssureCorps = refAssureCorps;
		this.numPvSinistreCorps = numPvSinistreCorps;
		this.dateSinistreCorps = dateSinistreCorps;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codeSinistre", column = @Column(name = "CODE_SINISTRE", nullable = false, length = 40)),
			@AttributeOverride(name = "codeEngin", column = @Column(name = "CODE_ENGIN", nullable = false, length = 30)) })
	public CorpsSinistreId getId() {
		return this.id;
	}

	public void setId(CorpsSinistreId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODE_ENGIN", nullable = false, insertable = false, updatable = false)
	public CorpsEngin getCorpsEngin() {
		return this.corpsEngin;
	}

	public void setCorpsEngin(CorpsEngin corpsEngin) {
		this.corpsEngin = corpsEngin;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODE_SINISTRE", nullable = false, insertable = false, updatable = false)
	public Sinistre getSinistre() {
		return this.sinistre;
	}

	public void setSinistre(Sinistre sinistre) {
		this.sinistre = sinistre;
	}

	@Column(name = "CIRCONSTANCES_SINISTRE_CORPS", length = 65535)
	public String getCirconstancesSinistreCorps() {
		return this.circonstancesSinistreCorps;
	}

	public void setCirconstancesSinistreCorps(String circonstancesSinistreCorps) {
		this.circonstancesSinistreCorps = circonstancesSinistreCorps;
	}

	@Column(name = "DOMMAGES_SINISTRE_CORPS", length = 65535)
	public String getDommagesSinistreCorps() {
		return this.dommagesSinistreCorps;
	}

	public void setDommagesSinistreCorps(String dommagesSinistreCorps) {
		this.dommagesSinistreCorps = dommagesSinistreCorps;
	}

	@Column(name = "REF_ASSURE_CORPS", length = 20)
	public String getRefAssureCorps() {
		return this.refAssureCorps;
	}

	public void setRefAssureCorps(String refAssureCorps) {
		this.refAssureCorps = refAssureCorps;
	}

	@Column(name = "NUM_PV_SINISTRE_CORPS", length = 20)
	public String getNumPvSinistreCorps() {
		return this.numPvSinistreCorps;
	}

	public void setNumPvSinistreCorps(String numPvSinistreCorps) {
		this.numPvSinistreCorps = numPvSinistreCorps;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_SINISTRE_CORPS", length = 19)
	public Date getDateSinistreCorps() {
		return this.dateSinistreCorps;
	}

	public void setDateSinistreCorps(Date dateSinistreCorps) {
		this.dateSinistreCorps = dateSinistreCorps;
	}

}
