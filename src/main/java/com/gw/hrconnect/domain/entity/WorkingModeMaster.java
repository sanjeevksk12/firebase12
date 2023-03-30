package com.gw.hrconnect.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the working_mode_master database table.
 * 
 */
@Entity
@Table(name="working_mode_master")
@NamedQuery(name="WorkingModeMaster.findAll", query="SELECT w FROM WorkingModeMaster w")
public class WorkingModeMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="working_mode_id", unique=true, nullable=false)
	private int workingModeId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="is_active", nullable=false)
	private byte isActive;

	@Temporal(TemporalType.DATE)
	@Column(name="last_updated_date")
	private Date lastUpdatedDate;

	@Column(name="working_mode_description", length=1000)
	private String workingModeDescription;

	@Column(name="working_mode_type", nullable=false, length=150)
	private String workingModeType;

	//bi-directional many-to-one association to UserMaster
	@ManyToOne
	@JoinColumn(name="update_by_user_id", nullable=false)
	private UserMaster userMaster;

	public WorkingModeMaster() {
	}

	public int getWorkingModeId() {
		return this.workingModeId;
	}

	public void setWorkingModeId(int workingModeId) {
		this.workingModeId = workingModeId;
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

	public String getWorkingModeDescription() {
		return this.workingModeDescription;
	}

	public void setWorkingModeDescription(String workingModeDescription) {
		this.workingModeDescription = workingModeDescription;
	}

	public String getWorkingModeType() {
		return this.workingModeType;
	}

	public void setWorkingModeType(String workingModeType) {
		this.workingModeType = workingModeType;
	}

	public UserMaster getUserMaster() {
		return this.userMaster;
	}

	public void setUserMaster(UserMaster userMaster) {
		this.userMaster = userMaster;
	}

}