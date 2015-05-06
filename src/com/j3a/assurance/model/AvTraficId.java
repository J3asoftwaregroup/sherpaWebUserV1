package com.j3a.assurance.model;

// Generated 5 mai 2015 11:21:10 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AvTraficId generated by hbm2java
 */
@Embeddable
public class AvTraficId implements java.io.Serializable {

	private String numAvenant;
	private String codeListeTrafic;

	public AvTraficId() {
	}

	public AvTraficId(String numAvenant, String codeListeTrafic) {
		this.numAvenant = numAvenant;
		this.codeListeTrafic = codeListeTrafic;
	}

	@Column(name = "NUM_AVENANT", nullable = false, length = 25)
	public String getNumAvenant() {
		return this.numAvenant;
	}

	public void setNumAvenant(String numAvenant) {
		this.numAvenant = numAvenant;
	}

	@Column(name = "CODE_LISTE_TRAFIC", nullable = false, length = 27)
	public String getCodeListeTrafic() {
		return this.codeListeTrafic;
	}

	public void setCodeListeTrafic(String codeListeTrafic) {
		this.codeListeTrafic = codeListeTrafic;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AvTraficId))
			return false;
		AvTraficId castOther = (AvTraficId) other;

		return ((this.getNumAvenant() == castOther.getNumAvenant()) || (this
				.getNumAvenant() != null && castOther.getNumAvenant() != null && this
				.getNumAvenant().equals(castOther.getNumAvenant())))
				&& ((this.getCodeListeTrafic() == castOther
						.getCodeListeTrafic()) || (this.getCodeListeTrafic() != null
						&& castOther.getCodeListeTrafic() != null && this
						.getCodeListeTrafic().equals(
								castOther.getCodeListeTrafic())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getNumAvenant() == null ? 0 : this.getNumAvenant()
						.hashCode());
		result = 37
				* result
				+ (getCodeListeTrafic() == null ? 0 : this.getCodeListeTrafic()
						.hashCode());
		return result;
	}

}