package com.gw.hrconnect.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the candidate_master database table.
 * 
 */
@Entity
@Table(name="candidate_master")
@NamedQuery(name="CandidateMaster.findAll", query="SELECT c FROM CandidateMaster c")
public class CandidateMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="candidate_id", unique=true, nullable=false)
	private int candidateId;

	@Temporal(TemporalType.DATE)
	@Column(name="Candidate_applied_date")
	private Date candidate_applied_date;

	@Temporal(TemporalType.DATE)
	@Column(name="candidate_dob", nullable=false)
	private Date candidateDob;

	@Column(name="candidate_email", nullable=false, length=150)
	private String candidateEmail;

	@Column(name="candidate_experience", length=45)
	private String candidateExperience;

	@Column(name="candidate_mobile_no1", nullable=false, length=10)
	private String candidateMobileNo1;

	@Column(name="candidate_mobile_no2", length=10)
	private String candidateMobileNo2;

	@Column(name="candidate_name", nullable=false, length=150)
	private String candidateName;

	@Column(name="candidate_profile_cv_link", length=1000)
	private String candidateProfileCvLink;

	@Column(name="candidate_zenon_is_onboard", nullable=false)
	private byte candidateZenonIsOnboard;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="is_active", nullable=false)
	private byte isActive;

	@Column(name="jd_id")
	private int jdId;

	@Temporal(TemporalType.DATE)
	@Column(name="last_updated_date")
	private Date lastUpdatedDate;

	@Column(name="source_id")
	private int sourceId;

	//bi-directional many-to-one association to SkillGroupMaster
	@ManyToOne
	@JoinColumn(name="skill_group_id")
	private SkillGroupMaster skillGroupMaster;

	//bi-directional many-to-one association to UserMaster
	@ManyToOne
	@JoinColumn(name="update_by_user_id", nullable=false)
	private UserMaster userMaster;

	//bi-directional many-to-one association to CandidateProcessDetail
	@OneToMany(mappedBy="candidateMaster")
	private List<CandidateProcessDetail> candidateProcessDetails;

	public CandidateMaster() {
	}

	public int getCandidateId() {
		return this.candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public Date getCandidate_applied_date() {
		return this.candidate_applied_date;
	}

	public void setCandidate_applied_date(Date candidate_applied_date) {
		this.candidate_applied_date = candidate_applied_date;
	}

	public Date getCandidateDob() {
		return this.candidateDob;
	}

	public void setCandidateDob(Date candidateDob) {
		this.candidateDob = candidateDob;
	}

	public String getCandidateEmail() {
		return this.candidateEmail;
	}

	public void setCandidateEmail(String candidateEmail) {
		this.candidateEmail = candidateEmail;
	}

	public String getCandidateExperience() {
		return this.candidateExperience;
	}

	public void setCandidateExperience(String candidateExperience) {
		this.candidateExperience = candidateExperience;
	}

	public String getCandidateMobileNo1() {
		return this.candidateMobileNo1;
	}

	public void setCandidateMobileNo1(String candidateMobileNo1) {
		this.candidateMobileNo1 = candidateMobileNo1;
	}

	public String getCandidateMobileNo2() {
		return this.candidateMobileNo2;
	}

	public void setCandidateMobileNo2(String candidateMobileNo2) {
		this.candidateMobileNo2 = candidateMobileNo2;
	}

	public String getCandidateName() {
		return this.candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getCandidateProfileCvLink() {
		return this.candidateProfileCvLink;
	}

	public void setCandidateProfileCvLink(String candidateProfileCvLink) {
		this.candidateProfileCvLink = candidateProfileCvLink;
	}

	public byte getCandidateZenonIsOnboard() {
		return this.candidateZenonIsOnboard;
	}

	public void setCandidateZenonIsOnboard(byte candidateZenonIsOnboard) {
		this.candidateZenonIsOnboard = candidateZenonIsOnboard;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public int getJdId() {
		return this.jdId;
	}

	public void setJdId(int jdId) {
		this.jdId = jdId;
	}

	public Date getLastUpdatedDate() {
		return this.lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public int getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	public SkillGroupMaster getSkillGroupMaster() {
		return this.skillGroupMaster;
	}

	public void setSkillGroupMaster(SkillGroupMaster skillGroupMaster) {
		this.skillGroupMaster = skillGroupMaster;
	}

	public UserMaster getUserMaster() {
		return this.userMaster;
	}

	public void setUserMaster(UserMaster userMaster) {
		this.userMaster = userMaster;
	}

	public List<CandidateProcessDetail> getCandidateProcessDetails() {
		return this.candidateProcessDetails;
	}

	public void setCandidateProcessDetails(List<CandidateProcessDetail> candidateProcessDetails) {
		this.candidateProcessDetails = candidateProcessDetails;
	}

	public CandidateProcessDetail addCandidateProcessDetail(CandidateProcessDetail candidateProcessDetail) {
		getCandidateProcessDetails().add(candidateProcessDetail);
		candidateProcessDetail.setCandidateMaster(this);

		return candidateProcessDetail;
	}

	public CandidateProcessDetail removeCandidateProcessDetail(CandidateProcessDetail candidateProcessDetail) {
		getCandidateProcessDetails().remove(candidateProcessDetail);
		candidateProcessDetail.setCandidateMaster(null);

		return candidateProcessDetail;
	}

}