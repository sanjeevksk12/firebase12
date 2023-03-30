package com.gw.hrconnect.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ctc_master database table.
 * 
 */
@Entity
@Table(name="ctc_master")
@NamedQuery(name="CtcMaster.findAll", query="SELECT c FROM CtcMaster c")
public class CtcMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ctc_id", unique=true, nullable=false)
	private int ctcId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="ctc_range_from", nullable=false)
	private double ctcRangeFrom;

	@Column(name="ctc_range_max", nullable=false)
	private double ctcRangeMax;

	@Column(name="is_active", nullable=false)
	private byte isActive;

	@Column(name="jd_role_id")
	private int jdRoleId;

	@Temporal(TemporalType.DATE)
	@Column(name="last_updated_date")
	private Date lastUpdatedDate;

	//bi-directional many-to-one association to UserMaster
	@ManyToOne
	@JoinColumn(name="update_by_user_id")
	private UserMaster userMaster;

	public CtcMaster() {
	}

	public int getCtcId() {
		return this.ctcId;
	}

	public void setCtcId(int ctcId) {
		this.ctcId = ctcId;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public double getCtcRangeFrom() {
		return this.ctcRangeFrom;
	}

	public void setCtcRangeFrom(double ctcRangeFrom) {
		this.ctcRangeFrom = ctcRangeFrom;
	}

	public double getCtcRangeMax() {
		return this.ctcRangeMax;
	}

	public void setCtcRangeMax(double ctcRangeMax) {
		this.ctcRangeMax = ctcRangeMax;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public int getJdRoleId() {
		return this.jdRoleId;
	}

	public void setJdRoleId(int jdRoleId) {
		this.jdRoleId = jdRoleId;
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

}