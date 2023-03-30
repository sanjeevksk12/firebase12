package com.gw.hrconnect.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the jd_role_master database table.
 * 
 */
@Entity
@Table(name="jd_role_master")
@NamedQuery(name="JdRoleMaster.findAll", query="SELECT j FROM JdRoleMaster j")
public class JdRoleMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="jd_role_id", unique=true, nullable=false)
	private int jdRoleId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="is_active", nullable=false)
	private byte isActive;

	@Column(name="jd_role_name", nullable=false, length=150)
	private String jdRoleName;

	@Temporal(TemporalType.DATE)
	@Column(name="last_updated_date")
	private Date lastUpdatedDate;

	@Column(name="max_level_of_experience_in_years", nullable=false, length=45)
	private String maxLevelOfExperienceInYears;

	@Column(name="min_level_of_experience_in_years", nullable=false, length=100)
	private String minLevelOfExperienceInYears;

	//bi-directional many-to-one association to UserMaster
	@ManyToOne
	@JoinColumn(name="update_by_user_id")
	private UserMaster userMaster;

	public JdRoleMaster() {
	}

	public int getJdRoleId() {
		return this.jdRoleId;
	}

	public void setJdRoleId(int jdRoleId) {
		this.jdRoleId = jdRoleId;
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

	public String getJdRoleName() {
		return this.jdRoleName;
	}

	public void setJdRoleName(String jdRoleName) {
		this.jdRoleName = jdRoleName;
	}

	public Date getLastUpdatedDate() {
		return this.lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getMaxLevelOfExperienceInYears() {
		return this.maxLevelOfExperienceInYears;
	}

	public void setMaxLevelOfExperienceInYears(String maxLevelOfExperienceInYears) {
		this.maxLevelOfExperienceInYears = maxLevelOfExperienceInYears;
	}

	public String getMinLevelOfExperienceInYears() {
		return this.minLevelOfExperienceInYears;
	}

	public void setMinLevelOfExperienceInYears(String minLevelOfExperienceInYears) {
		this.minLevelOfExperienceInYears = minLevelOfExperienceInYears;
	}

	public UserMaster getUserMaster() {
		return this.userMaster;
	}

	public void setUserMaster(UserMaster userMaster) {
		this.userMaster = userMaster;
	}

}