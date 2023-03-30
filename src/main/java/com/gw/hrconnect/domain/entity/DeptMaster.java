package com.gw.hrconnect.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the dept_master database table.
 * 
 */
@Entity
@Table(name="dept_master")
@NamedQuery(name="DeptMaster.findAll", query="SELECT d FROM DeptMaster d")
public class DeptMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dept_id", unique=true, nullable=false)
	private int deptId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="dept_name", nullable=false, length=100)
	private String deptName;

	@Column(name="is_active", nullable=false)
	private byte isActive;

	@Temporal(TemporalType.DATE)
	@Column(name="last_updated_date")
	private Date lastUpdatedDate;

	//bi-directional many-to-one association to UserMaster
	@ManyToOne
	@JoinColumn(name="update_by_user_id")
	private UserMaster userMaster;

	//bi-directional many-to-one association to DesignationMaster
	@OneToMany(mappedBy="deptMaster")
	private List<DesignationMaster> designationMasters;

	public DeptMaster() {
	}

	public int getDeptId() {
		return this.deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
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

	public UserMaster getUserMaster() {
		return this.userMaster;
	}

	public void setUserMaster(UserMaster userMaster) {
		this.userMaster = userMaster;
	}

	public List<DesignationMaster> getDesignationMasters() {
		return this.designationMasters;
	}

	public void setDesignationMasters(List<DesignationMaster> designationMasters) {
		this.designationMasters = designationMasters;
	}

	public DesignationMaster addDesignationMaster(DesignationMaster designationMaster) {
		getDesignationMasters().add(designationMaster);
		designationMaster.setDeptMaster(this);

		return designationMaster;
	}

	public DesignationMaster removeDesignationMaster(DesignationMaster designationMaster) {
		getDesignationMasters().remove(designationMaster);
		designationMaster.setDeptMaster(null);

		return designationMaster;
	}

}