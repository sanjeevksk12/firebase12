package com.gw.hrconnect.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the skill_group_details database table.
 * 
 */
@Entity
@Table(name="skill_group_details")
@NamedQuery(name="SkillGroupDetail.findAll", query="SELECT s FROM SkillGroupDetail s")
public class SkillGroupDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="skill_group_details_id", unique=true, nullable=false)
	private int skillGroupDetailsId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="is_active", nullable=false)
	private byte isActive;

	@Column(name="last_updated_date", length=45)
	private String lastUpdatedDate;

	@Column(name="skill_group_details_description", length=2000)
	private String skillGroupDetailsDescription;

	@Column(name="skill_group_name", nullable=false, length=200)
	private String skillGroupName;

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

	public SkillGroupDetail() {
	}

	public int getSkillGroupDetailsId() {
		return this.skillGroupDetailsId;
	}

	public void setSkillGroupDetailsId(int skillGroupDetailsId) {
		this.skillGroupDetailsId = skillGroupDetailsId;
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

	public String getLastUpdatedDate() {
		return this.lastUpdatedDate;
	}

	public void setLastUpdatedDate(String lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getSkillGroupDetailsDescription() {
		return this.skillGroupDetailsDescription;
	}

	public void setSkillGroupDetailsDescription(String skillGroupDetailsDescription) {
		this.skillGroupDetailsDescription = skillGroupDetailsDescription;
	}

	public String getSkillGroupName() {
		return this.skillGroupName;
	}

	public void setSkillGroupName(String skillGroupName) {
		this.skillGroupName = skillGroupName;
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