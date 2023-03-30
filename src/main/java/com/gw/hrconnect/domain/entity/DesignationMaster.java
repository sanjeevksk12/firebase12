package com.gw.hrconnect.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the designation_master database table.
 * 
 */
@Entity
@Table(name="designation_master")
@NamedQuery(name="DesignationMaster.findAll", query="SELECT d FROM DesignationMaster d")
public class DesignationMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="designation_id", unique=true, nullable=false)
	private int designationId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="designation_name", nullable=false, length=100)
	private String designationName;

	@Column(name="is_active", nullable=false)
	private byte isActive;

	@Temporal(TemporalType.DATE)
	@Column(name="last_updated_date", nullable=false)
	private Date lastUpdatedDate;

	//bi-directional many-to-one association to DeptMaster
	@ManyToOne
	@JoinColumn(name="dept_id", nullable=false)
	private DeptMaster deptMaster;

	//bi-directional many-to-one association to UserMaster
	@ManyToOne
	@JoinColumn(name="update_by_user_id", nullable=false)
	private UserMaster userMaster;

	public DesignationMaster() {
	}

	public int getDesignationId() {
		return this.designationId;
	}

	public void setDesignationId(int designationId) {
		this.designationId = designationId;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getDesignationName() {
		return this.designationName;
	}

	public void setDesignationName(String designationName) {
		this.designationName = designationName;
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

	public DeptMaster getDeptMaster() {
		return this.deptMaster;
	}

	public void setDeptMaster(DeptMaster deptMaster) {
		this.deptMaster = deptMaster;
	}

	public UserMaster getUserMaster() {
		return this.userMaster;
	}

	public void setUserMaster(UserMaster userMaster) {
		this.userMaster = userMaster;
	}

}