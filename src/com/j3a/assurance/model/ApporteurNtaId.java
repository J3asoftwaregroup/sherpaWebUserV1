package com.j3a.assurance.model;

// Generated 5 mai 2015 11:21:10 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ApporteurNtaId generated by hbm2java
 */
@Embeddable
public class ApporteurNtaId implements java.io.Serializable {

	private String codeApporteur;
	private String codeRisquenta;

	public ApporteurNtaId() {
	}

	public ApporteurNtaId(String codeApporteur, String codeRisquenta) {
		this.codeApporteur = codeApporteur;
		this.codeRisquenta = codeRisquenta;
	}

	@Column(name = "CODE_APPORTEUR", nullable = false, length = 10)
	public String getCodeApporteur() {
		return this.codeApporteur;
	}

	public void setCodeApporteur(String codeApporteur) {
		this.codeApporteur = codeApporteur;
	}

	@Column(name = "CODE_RISQUENTA", nullable = false, length = 30)
	public String getCodeRisquenta() {
		return this.codeRisquenta;
	}

	public void setCodeRisquenta(String codeRisquenta) {
		this.codeRisquenta = codeRisquenta;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ApporteurNtaId))
			return false;
		ApporteurNtaId castOther = (ApporteurNtaId) other;

		return ((this.getCodeApporteur() == castOther.getCodeApporteur()) || (this
				.getCodeApporteur() != null
				&& castOther.getCodeApporteur() != null && this
				.getCodeApporteur().equals(castOther.getCodeApporteur())))
				&& ((this.getCodeRisquenta() == castOther.getCodeRisquenta()) || (this
						.getCodeRisquenta() != null
						&& castOther.getCodeRisquenta() != null && this
						.getCodeRisquenta()
						.equals(castOther.getCodeRisquenta())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCodeApporteur() == null ? 0 : this.getCodeApporteur()
						.hashCode());
		result = 37
				* result
				+ (getCodeRisquenta() == null ? 0 : this.getCodeRisquenta()
						.hashCode());
		return result;
	}

}