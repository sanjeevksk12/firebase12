package com.gw.hrconnect.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the skill_master database table.
 * 
 */
@Entity
@Table(name="skill_master")
@NamedQuery(name="SkillMaster.findAll", query="SELECT s FROM SkillMaster s")
public class SkillMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="skill_id", unique=true, nullable=false)
	private int skillId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="is_active", nullable=false)
	private byte isActive;

	@Temporal(TemporalType.DATE)
	@Column(name="last_updated_date")
	private Date lastUpdatedDate;

	@Column(name="skill_desciption", nullable=false, length=2000)
	private String skillDesciption;

	@Column(name="skill_name", nullable=false, length=150)
	private String skillName;

	@Column(name="skill_version", length=150)
	private String skillVersion;

	@Column(name="version_type_id", nullable=false, length=100)
	private String versionTypeId;

	//bi-directional many-to-one association to SkillCategory
	@OneToMany(mappedBy="skillMaster")
	private List<SkillCategory> skillCategories;

	//bi-directional many-to-one association to SkillGroupDetail
	@OneToMany(mappedBy="skillMaster")
	private List<SkillGroupDetail> skillGroupDetails;

	//bi-directional many-to-one association to UserMaster
	@ManyToOne
	@JoinColumn(name="update_by_user_id", nullable=false)
	private UserMaster userMaster;

	public SkillMaster() {
	}

	public int getSkillId() {
		return this.skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
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

	public Date getLastUpdatedDate() {
		return this.lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getSkillDesciption() {
		return this.skillDesciption;
	}

	public void setSkillDesciption(String skillDesciption) {
		this.skillDesciption = skillDesciption;
	}

	public String getSkillName() {
		return this.skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getSkillVersion() {
		return this.skillVersion;
	}

	public void setSkillVersion(String skillVersion) {
		this.skillVersion = skillVersion;
	}

	public String getVersionTypeId() {
		return this.versionTypeId;
	}

	public void setVersionTypeId(String versionTypeId) {
		this.versionTypeId = versionTypeId;
	}

	public List<SkillCategory> getSkillCategories() {
		return this.skillCategories;
	}

	public void setSkillCategories(List<SkillCategory> skillCategories) {
		this.skillCategories = skillCategories;
	}

	public SkillCategory addSkillCategory(SkillCategory skillCategory) {
		getSkillCategories().add(skillCategory);
		skillCategory.setSkillMaster(this);

		return skillCategory;
	}

	public SkillCategory removeSkillCategory(SkillCategory skillCategory) {
		getSkillCategories().remove(skillCategory);
		skillCategory.setSkillMaster(null);

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
		skillGroupDetail.setSkillMaster(this);

		return skillGroupDetail;
	}

	public SkillGroupDetail removeSkillGroupDetail(SkillGroupDetail skillGroupDetail) {
		getSkillGroupDetails().remove(skillGroupDetail);
		skillGroupDetail.setSkillMaster(null);

		return skillGroupDetail;
	}

	public UserMaster getUserMaster() {
		return this.userMaster;
	}

	public void setUserMaster(UserMaster userMaster) {
		this.userMaster = userMaster;
	}

}