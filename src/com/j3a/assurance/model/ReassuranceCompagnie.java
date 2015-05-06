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
 * ReassuranceCompagnie generated by hbm2java
 */
@Entity
@Table(name = "reassurance_compagnie", catalog = "zeusbd")
public class ReassuranceCompagnie implements java.io.Serializable {

	private ReassuranceCompagnieId id;
	private Compagnie compagnie;
	private Reassurance reassurance;
	private Date dateReassuranceCompagnie;

	public ReassuranceCompagnie() {
	}

	public ReassuranceCompagnie(ReassuranceCompagnieId id, Compagnie compagnie,
			Reassurance reassurance) {
		this.id = id;
		this.compagnie = compagnie;
		this.reassurance = reassurance;
	}

	public ReassuranceCompagnie(ReassuranceCompagnieId id, Compagnie compagnie,
			Reassurance reassurance, Date dateReassuranceCompagnie) {
		this.id = id;
		this.compagnie = compagnie;
		this.reassurance = reassurance;
		this.dateReassuranceCompagnie = dateReassuranceCompagnie;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codeReassurance", column = @Column(name = "CODE_REASSURANCE", nullable = false, length = 16)),
			@AttributeOverride(name = "codeCompagnie", column = @Column(name = "CODE_COMPAGNIE", nullable = false, length = 10)) })
	public ReassuranceCompagnieId getId() {
		return this.id;
	}

	public void setId(ReassuranceCompagnieId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODE_COMPAGNIE", nullable = false, insertable = false, updatable = false)
	public Compagnie getCompagnie() {
		return this.compagnie;
	}

	public void setCompagnie(Compagnie compagnie) {
		this.compagnie = compagnie;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODE_REASSURANCE", nullable = false, insertable = false, updatable = false)
	public Reassurance getReassurance() {
		return this.reassurance;
	}

	public void setReassurance(Reassurance reassurance) {
		this.reassurance = reassurance;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_REASSURANCE_COMPAGNIE", length = 10)
	public Date getDateReassuranceCompagnie() {
		return this.dateReassuranceCompagnie;
	}

	public void setDateReassuranceCompagnie(Date dateReassuranceCompagnie) {
		this.dateReassuranceCompagnie = dateReassuranceCompagnie;
	}

}
