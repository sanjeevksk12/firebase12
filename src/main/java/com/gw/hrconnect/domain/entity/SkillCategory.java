package com.gw.hrconnect.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the skill_category database table.
 * 
 */
@Entity
@Table(name="skill_category")
@NamedQuery(name="SkillCategory.findAll", query="SELECT s FROM SkillCategory s")
public class SkillCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="skill_category_id", unique=true, nullable=false)
	private int skillCategoryId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="is_active", nullable=false)
	private int isActive;

	@Temporal(TemporalType.DATE)
	@Column(name="last_updated_date")
	private Date lastUpdatedDate;

	//bi-directional many-to-one association to SkillGroupMaster
	@ManyToOne
	@JoinColumn(name="skill_group_id", nullable=false)
	private SkillGroupMaster skillGroupMaster;

	//bi-directional many-to-one association to SkillMaster
	@ManyToOne
	@JoinColumn(name="skill_id", nullable=false)
	private SkillMaster skillMaster;

	//bi-directional many-to-one association to UserMaster
	@ManyToOne
	@JoinColumn(name="update_by_user_id", nullable=false)
	private UserMaster userMaster;

	public SkillCategory() {
	}

	public int getSkillCategoryId() {
		return this.skillCategoryId;
	}

	public void setSkillCategoryId(int skillCategoryId) {
		this.skillCategoryId = skillCategoryId;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public Date getLastUpdatedDate() {
		return this.lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public SkillGroupMaster getSkillGroupMaster() {
		return this.skillGroupMaster;
	}

	public void setSkillGroupMaster(SkillGroupMaster skillGroupMaster) {
		this.skillGroupMaster = skillGroupMaster;
	}

	public SkillMaster getSkillMaster() {
		return this.skillMaster;
	}

	public void setSkillMaster(SkillMaster skillMaster) {
		this.skillMaster = skillMaster;
	}

	public UserMaster getUserMaster() {
		return this.userMaster;
	}

	public void setUserMaster(UserMaster userMaster) {
		this.userMaster = userMaster;
	}

}