package com.j3a.assurance.model;

// Generated 5 mai 2015 11:21:10 by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sinistre generated by hbm2java
 */
@Entity
@Table(name = "sinistre", catalog = "zeusbd")
public class Sinistre implements java.io.Serializable {

	private String codeSinistre;
	private Contrat contrat;
	private Date dateSurvenance;
	private String circonstance;
	private Date dateDeclaration;
	private Date dateEvaluation;
	private BigDecimal evaluationBrute;
	private BigDecimal evaluationNette;
	private String positionDossier;
	private String codeAvenantSinistre;
	private Set<GestionConfieeSinistre> gestionConfieeSinistres = new HashSet<GestionConfieeSinistre>(
			0);
	private Set<CorpsSinistre> corpsSinistres = new HashSet<CorpsSinistre>(0);
	private Set<Victime> victimes = new HashSet<Victime>(0);
	private Set<GarantieSinistre> garantieSinistres = new HashSet<GarantieSinistre>(
			0);
	private Set<AlimentSinistre> alimentSinistres = new HashSet<AlimentSinistre>(
			0);
	private Set<HabitationSinistre> habitationSinistres = new HashSet<HabitationSinistre>(
			0);
	private Set<RisqueNtaSinistre> risqueNtaSinistres = new HashSet<RisqueNtaSinistre>(
			0);
	private Set<Expertise> expertises = new HashSet<Expertise>(0);
	private Set<SinistreConducteur> sinistreConducteurs = new HashSet<SinistreConducteur>(
			0);
	private Set<PartieAdverse> partieAdverses = new HashSet<PartieAdverse>(0);
	private Set<Intervention> interventions = new HashSet<Intervention>(0);
	private Set<ReglementSinistreGc> reglementSinistreGcs = new HashSet<ReglementSinistreGc>(
			0);
	private Set<VehiculeSinistre> vehiculeSinistres = new HashSet<VehiculeSinistre>(
			0);
	private Set<AssureIaSinistre> assureIaSinistres = new HashSet<AssureIaSinistre>(
			0);

	public Sinistre() {
	}

	public Sinistre(String codeSinistre, Contrat contrat) {
		this.codeSinistre = codeSinistre;
		this.contrat = contrat;
	}

	public Sinistre(String codeSinistre, Contrat contrat, Date dateSurvenance,
			String circonstance, Date dateDeclaration, Date dateEvaluation,
			BigDecimal evaluationBrute, BigDecimal evaluationNette,
			String positionDossier, String codeAvenantSinistre,
			Set<GestionConfieeSinistre> gestionConfieeSinistres,
			Set<CorpsSinistre> corpsSinistres, Set<Victime> victimes,
			Set<GarantieSinistre> garantieSinistres,
			Set<AlimentSinistre> alimentSinistres,
			Set<HabitationSinistre> habitationSinistres,
			Set<RisqueNtaSinistre> risqueNtaSinistres,
			Set<Expertise> expertises,
			Set<SinistreConducteur> sinistreConducteurs,
			Set<PartieAdverse> partieAdverses, Set<Intervention> interventions,
			Set<ReglementSinistreGc> reglementSinistreGcs,
			Set<VehiculeSinistre> vehiculeSinistres,
			Set<AssureIaSinistre> assureIaSinistres) {
		this.codeSinistre = codeSinistre;
		this.contrat = contrat;
		this.dateSurvenance = dateSurvenance;
		this.circonstance = circonstance;
		this.dateDeclaration = dateDeclaration;
		this.dateEvaluation = dateEvaluation;
		this.evaluationBrute = evaluationBrute;
		this.evaluationNette = evaluationNette;
		this.positionDossier = positionDossier;
		this.codeAvenantSinistre = codeAvenantSinistre;
		this.gestionConfieeSinistres = gestionConfieeSinistres;
		this.corpsSinistres = corpsSinistres;
		this.victimes = victimes;
		this.garantieSinistres = garantieSinistres;
		this.alimentSinistres = alimentSinistres;
		this.habitationSinistres = habitationSinistres;
		this.risqueNtaSinistres = risqueNtaSinistres;
		this.expertises = expertises;
		this.sinistreConducteurs = sinistreConducteurs;
		this.partieAdverses = partieAdverses;
		this.interventions = interventions;
		this.reglementSinistreGcs = reglementSinistreGcs;
		this.vehiculeSinistres = vehiculeSinistres;
		this.assureIaSinistres = assureIaSinistres;
	}

	@Id
	@Column(name = "CODE_SINISTRE", unique = true, nullable = false, length = 40)
	public String getCodeSinistre() {
		return this.codeSinistre;
	}

	public void setCodeSinistre(String codeSinistre) {
		this.codeSinistre = codeSinistre;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NUM_POLICE", nullable = false)
	public Contrat getContrat() {
		return this.contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_SURVENANCE", length = 10)
	public Date getDateSurvenance() {
		return this.dateSurvenance;
	}

	public void setDateSurvenance(Date dateSurvenance) {
		this.dateSurvenance = dateSurvenance;
	}

	@Column(name = "CIRCONSTANCE", length = 60)
	public String getCirconstance() {
		return this.circonstance;
	}

	public void setCirconstance(String circonstance) {
		this.circonstance = circonstance;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_DECLARATION", length = 10)
	public Date getDateDeclaration() {
		return this.dateDeclaration;
	}

	public void setDateDeclaration(Date dateDeclaration) {
		this.dateDeclaration = dateDeclaration;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_EVALUATION", length = 10)
	public Date getDateEvaluation() {
		return this.dateEvaluation;
	}

	public void setDateEvaluation(Date dateEvaluation) {
		this.dateEvaluation = dateEvaluation;
	}

	@Column(name = "EVALUATION_BRUTE", precision = 15, scale = 3)
	public BigDecimal getEvaluationBrute() {
		return this.evaluationBrute;
	}

	public void setEvaluationBrute(BigDecimal evaluationBrute) {
		this.evaluationBrute = evaluationBrute;
	}

	@Column(name = "EVALUATION_NETTE", precision = 15, scale = 3)
	public BigDecimal getEvaluationNette() {
		return this.evaluationNette;
	}

	public void setEvaluationNette(BigDecimal evaluationNette) {
		this.evaluationNette = evaluationNette;
	}

	@Column(name = "POSITION_DOSSIER", length = 60)
	public String getPositionDossier() {
		return this.positionDossier;
	}

	public void setPositionDossier(String positionDossier) {
		this.positionDossier = positionDossier;
	}

	@Column(name = "CODE_AVENANT_SINISTRE", length = 30)
	public String getCodeAvenantSinistre() {
		return this.codeAvenantSinistre;
	}

	public void setCodeAvenantSinistre(String codeAvenantSinistre) {
		this.codeAvenantSinistre = codeAvenantSinistre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sinistre")
	public Set<GestionConfieeSinistre> getGestionConfieeSinistres() {
		return this.gestionConfieeSinistres;
	}

	public void setGestionConfieeSinistres(
			Set<GestionConfieeSinistre> gestionConfieeSinistres) {
		this.gestionConfieeSinistres = gestionConfieeSinistres;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sinistre")
	public Set<CorpsSinistre> getCorpsSinistres() {
		return this.corpsSinistres;
	}

	public void setCorpsSinistres(Set<CorpsSinistre> corpsSinistres) {
		this.corpsSinistres = corpsSinistres;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sinistre")
	public Set<Victime> getVictimes() {
		return this.victimes;
	}

	public void setVictimes(Set<Victime> victimes) {
		this.victimes = victimes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sinistre")
	public Set<GarantieSinistre> getGarantieSinistres() {
		return this.garantieSinistres;
	}

	public void setGarantieSinistres(Set<GarantieSinistre> garantieSinistres) {
		this.garantieSinistres = garantieSinistres;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sinistre")
	public Set<AlimentSinistre> getAlimentSinistres() {
		return this.alimentSinistres;
	}

	public void setAlimentSinistres(Set<AlimentSinistre> alimentSinistres) {
		this.alimentSinistres = alimentSinistres;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sinistre")
	public Set<HabitationSinistre> getHabitationSinistres() {
		return this.habitationSinistres;
	}

	public void setHabitationSinistres(
			Set<HabitationSinistre> habitationSinistres) {
		this.habitationSinistres = habitationSinistres;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sinistre")
	public Set<RisqueNtaSinistre> getRisqueNtaSinistres() {
		return this.risqueNtaSinistres;
	}

	public void setRisqueNtaSinistres(Set<RisqueNtaSinistre> risqueNtaSinistres) {
		this.risqueNtaSinistres = risqueNtaSinistres;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sinistre")
	public Set<Expertise> getExpertises() {
		return this.expertises;
	}

	public void setExpertises(Set<Expertise> expertises) {
		this.expertises = expertises;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sinistre")
	public Set<SinistreConducteur> getSinistreConducteurs() {
		return this.sinistreConducteurs;
	}

	public void setSinistreConducteurs(
			Set<SinistreConducteur> sinistreConducteurs) {
		this.sinistreConducteurs = sinistreConducteurs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sinistre")
	public Set<PartieAdverse> getPartieAdverses() {
		return this.partieAdverses;
	}

	public void setPartieAdverses(Set<PartieAdverse> partieAdverses) {
		this.partieAdverses = partieAdverses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sinistre")
	public Set<Intervention> getInterventions() {
		return this.interventions;
	}

	public void setInterventions(Set<Intervention> interventions) {
		this.interventions = interventions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sinistre")
	public Set<ReglementSinistreGc> getReglementSinistreGcs() {
		return this.reglementSinistreGcs;
	}

	public void setReglementSinistreGcs(
			Set<ReglementSinistreGc> reglementSinistreGcs) {
		this.reglementSinistreGcs = reglementSinistreGcs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sinistre")
	public Set<VehiculeSinistre> getVehiculeSinistres() {
		return this.vehiculeSinistres;
	}

	public void setVehiculeSinistres(Set<VehiculeSinistre> vehiculeSinistres) {
		this.vehiculeSinistres = vehiculeSinistres;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sinistre")
	public Set<AssureIaSinistre> getAssureIaSinistres() {
		return this.assureIaSinistres;
	}

	public void setAssureIaSinistres(Set<AssureIaSinistre> assureIaSinistres) {
		this.assureIaSinistres = assureIaSinistres;
	}

}
