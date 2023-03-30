package com.gw.hrconnect.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the jd_details database table.
 * 
 */
@Entity
@Table(name="jd_details")
@NamedQuery(name="JdDetail.findAll", query="SELECT j FROM JdDetail j")
public class JdDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="jd_id", unique=true, nullable=false)
	private int jdId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="ctc_id", nullable=false)
	private int ctcId;

	@Column(name="department_id", nullable=false)
	private int departmentId;

	@Column(name="final_level_approval_id", length=100)
	private String finalLevelApprovalId;

	@Column(name="first_level_approval_id", length=100)
	private String firstLevelApprovalId;

	@Column(name="is_active", nullable=false)
	private byte isActive;

	@Column(name="jd_description", nullable=false, length=2000)
	private String jdDescription;

	@Column(name="jd_role_id", nullable=false)
	private int jdRoleId;

	@Column(name="job_id", nullable=false)
	private int jobId;

	@Temporal(TemporalType.DATE)
	@Column(name="last_updated_date")
	private Date lastUpdatedDate;

	@Column(name="max_experience_required", nullable=false, length=100)
	private String maxExperienceRequired;

	@Column(name="min_experience_required", nullable=false, length=100)
	private String minExperienceRequired;

	@Column(name="open_positions", nullable=false)
	private int openPositions;

	@Temporal(TemporalType.DATE)
	@Column(name="publishing_date", nullable=false)
	private Date publishingDate;

	@Column(name="second_level_approval_id", length=100)
	private String secondLevelApprovalId;

	@Column(name="skill_category", nullable=false, length=2000)
	private String skillCategory;

	@Column(name="working_mode_id")
	private int workingModeId;

	//bi-directional many-to-one association to UserMaster
	@ManyToOne
	@JoinColumn(name="update_by_user_id", nullable=false)
	private UserMaster userMaster;

	public JdDetail() {
	}

	public int getJdId() {
		return this.jdId;
	}

	public void setJdId(int jdId) {
		this.jdId = jdId;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public int getCtcId() {
		return this.ctcId;
	}

	public void setCtcId(int ctcId) {
		this.ctcId = ctcId;
	}

	public int getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getFinalLevelApprovalId() {
		return this.finalLevelApprovalId;
	}

	public void setFinalLevelApprovalId(String finalLevelApprovalId) {
		this.finalLevelApprovalId = finalLevelApprovalId;
	}

	public String getFirstLevelApprovalId() {
		return this.firstLevelApprovalId;
	}

	public void setFirstLevelApprovalId(String firstLevelApprovalId) {
		this.firstLevelApprovalId = firstLevelApprovalId;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public String getJdDescription() {
		return this.jdDescription;
	}

	public void setJdDescription(String jdDescription) {
		this.jdDescription = jdDescription;
	}

	public int getJdRoleId() {
		return this.jdRoleId;
	}

	public void setJdRoleId(int jdRoleId) {
		this.jdRoleId = jdRoleId;
	}

	public int getJobId() {
		return this.jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public Date getLastUpdatedDate() {
		return this.lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getMaxExperienceRequired() {
		return this.maxExperienceRequired;
	}

	public void setMaxExperienceRequired(String maxExperienceRequired) {
		this.maxExperienceRequired = maxExperienceRequired;
	}

	public String getMinExperienceRequired() {
		return this.minExperienceRequired;
	}

	public void setMinExperienceRequired(String minExperienceRequired) {
		this.minExperienceRequired = minExperienceRequired;
	}

	public int getOpenPositions() {
		return this.openPositions;
	}

	public void setOpenPositions(int openPositions) {
		this.openPositions = openPositions;
	}

	public Date getPublishingDate() {
		return this.publishingDate;
	}

	public void setPublishingDate(Date publishingDate) {
		this.publishingDate = publishingDate;
	}

	public String getSecondLevelApprovalId() {
		return this.secondLevelApprovalId;
	}

	public void setSecondLevelApprovalId(String secondLevelApprovalId) {
		this.secondLevelApprovalId = secondLevelApprovalId;
	}

	public String getSkillCategory() {
		return this.skillCategory;
	}

	public void setSkillCategory(String skillCategory) {
		this.skillCategory = skillCategory;
	}

	public int getWorkingModeId() {
		return this.workingModeId;
	}

	public void setWorkingModeId(int workingModeId) {
		this.workingModeId = workingModeId;
	}

	public UserMaster getUserMaster() {
		return this.userMaster;
	}

	public void setUserMaster(UserMaster userMaster) {
		this.userMaster = userMaster;
	}

}