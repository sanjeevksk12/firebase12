package com.gw.hrconnect.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vender_type database table.
 * 
 */
@Entity
@Table(name="vender_type")
@NamedQuery(name="VenderType.findAll", query="SELECT v FROM VenderType v")
public class VenderType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="vender_type_id", unique=true, nullable=false)
	private int venderTypeId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="is_active", nullable=false)
	private byte isActive;

	@Temporal(TemporalType.DATE)
	@Column(name="last_updated_date")
	private Date lastUpdatedDate;

	@Column(name="vender_type", nullable=false, length=150)
	private String venderType;

	//bi-directional many-to-one association to UserMaster
	@ManyToOne
	@JoinColumn(name="update_by_user_id")
	private UserMaster userMaster;

	public VenderType() {
	}

	public int getVenderTypeId() {
		return this.venderTypeId;
	}

	public void setVenderTypeId(int venderTypeId) {
		this.venderTypeId = venderTypeId;
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

	public String getVenderType() {
		return this.venderType;
	}

	public void setVenderType(String venderType) {
		this.venderType = venderType;
	}

	public UserMaster getUserMaster() {
		return this.userMaster;
	}

	public void setUserMaster(UserMaster userMaster) {
		this.userMaster = userMaster;
	}

}