package com.gw.hrconnect.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the skill_group_master database table.
 * 
 */
@Entity
@Table(name="skill_group_master")
@NamedQuery(name="SkillGroupMaster.findAll", query="SELECT s FROM SkillGroupMaster s")
public class SkillGroupMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="group_id", unique=true, nullable=false)
	private int groupId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="group_description", length=2000)
	private String groupDescription;

	@Column(name="group_name", nullable=false, length=200)
	private String groupName;

	@Column(name="is_active", nullable=false)
	private byte isActive;

	@Temporal(TemporalType.DATE)
	@Column(name="last_updated_date")
	private Date lastUpdatedDate;

	//bi-directional many-to-one association to CandidateMaster
	@OneToMany(mappedBy="skillGroupMaster")
	private List<CandidateMaster> candidateMasters;

	//bi-directional many-to-one association to SkillCategory
	@OneToMany(mappedBy="skillGroupMaster")
	private List<SkillCategory> skillCategories;

	//bi-directional many-to-one association to SkillGroupDetail
	@OneToMany(mappedBy="skillGroupMaster")
	private List<SkillGroupDetail> skillGroupDetails;

	//bi-directional many-to-one association to UserMaster
	@ManyToOne
	@JoinColumn(name="update_by_user_id", nullable=false)
	private UserMaster userMaster;

	public SkillGroupMaster() {
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getGroupDescription() {
		return this.groupDescription;
	}

	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public Date getLastUpdatedDate() {
		return this.lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public List<CandidateMaster> getCandidateMasters() {
		return this.candidateMasters;
	}

	public void setCandidateMasters(List<CandidateMaster> candidateMasters) {
		this.candidateMasters = candidateMasters;
	}

	public CandidateMaster addCandidateMaster(CandidateMaster candidateMaster) {
		getCandidateMasters().add(candidateMaster);
		candidateMaster.setSkillGroupMaster(this);

		return candidateMaster;
	}

	public CandidateMaster removeCandidateMaster(CandidateMaster candidateMaster) {
		getCandidateMasters().remove(candidateMaster);
		candidateMaster.setSkillGroupMaster(null);

		return candidateMaster;
	}

	public List<SkillCategory> getSkillCategories() {
		return this.skillCategories;
	}

	public void setSkillCategories(List<SkillCategory> skillCategories) {
		this.skillCategories = skillCategories;
	}

	public SkillCategory addSkillCategory(SkillCategory skillCategory) {
		getSkillCategories().add(skillCategory);
		skillCategory.setSkillGroupMaster(this);

		return skillCategory;
	}

	public SkillCategory removeSkillCategory(SkillCategory skillCategory) {
		getSkillCategories().remove(skillCategory);
		skillCategory.setSkillGroupMaster(null);

		return skillCategory;
	}

	public List<SkillGroupDetail> getSkillGroupDetails() {
		return this.skillGroupDetails;
	}

	public void setSkillGroupDetails(List<SkillGroupDetail> skillGroupDetails) {
		this.skillGroupDetails = skillGroupDetails;
	}

	public SkillGroupDetail addSkillGroupDetail(SkillGroupDetail skillGroupDetail) {
		getSkillGroupDetails().add(skillGroupDetail);
		skillGroupDetail.setSkillGroupMaster(this);

		return skillGroupDetail;
	}

	public SkillGroupDetail removeSkillGroupDetail(SkillGroupDetail skillGroupDetail) {
		getSkillGroupDetails().remove(skillGroupDetail);
		skillGroupDetail.setSkillGroupMaster(null);

		return skillGroupDetail;
	}

	public UserMaster getUserMaster() {
		return this.userMaster;
	}

	public void setUserMaster(UserMaster userMaster) {
		this.userMaster = userMaster;
	}

}