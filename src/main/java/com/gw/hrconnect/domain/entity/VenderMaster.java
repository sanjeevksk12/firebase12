package com.gw.hrconnect.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vender_master database table.
 * 
 */
@Entity
@Table(name="vender_master")
@NamedQuery(name="VenderMaster.findAll", query="SELECT v FROM VenderMaster v")
public class VenderMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="vender_id", unique=true, nullable=false)
	private int venderId;

	@Column(name="contact_person_email_id", nullable=false, length=150)
	private String contactPersonEmailId;

	@Column(name="contact_person_first_name", nullable=false, length=100)
	private String contactPersonFirstName;

	@Column(name="contact_person_last_name", nullable=false, length=100)
	private String contactPersonLastName;

	@Column(name="contact_person_mobile1", nullable=false, length=10)
	private String contactPersonMobile1;

	@Column(name="contact_person_mobile2", nullable=false, length=10)
	private String contactPersonMobile2;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="is_active", nullable=false)
	private byte isActive;

	@Temporal(TemporalType.DATE)
	@Column(name="last_updated_date")
	private Date lastUpdatedDate;

	@Column(name="vender_address", nullable=false, length=1000)
	private String venderAddress;

	@Column(name="vender_company_name", nullable=false, length=200)
	private String venderCompanyName;

	@Column(name="vender_gst_no", nullable=false, length=50)
	private String venderGstNo;

	@Column(name="vender_type_id", length=45)
	private String venderTypeId;

	//bi-directional many-to-one association to UserMaster
	@ManyToOne
	@JoinColumn(name="update_by_user_id")
	private UserMaster userMaster;

	public VenderMaster() {
	}

	public int getVenderId() {
		return this.venderId;
	}

	public void setVenderId(int venderId) {
		this.venderId = venderId;
	}

	public String getContactPersonEmailId() {
		return this.contactPersonEmailId;
	}

	public void setContactPersonEmailId(String contactPersonEmailId) {
		this.contactPersonEmailId = contactPersonEmailId;
	}

	public String getContactPersonFirstName() {
		return this.contactPersonFirstName;
	}

	public void setContactPersonFirstName(String contactPersonFirstName) {
		this.contactPersonFirstName = contactPersonFirstName;
	}

	public String getContactPersonLastName() {
		return this.contactPersonLastName;
	}

	public void setContactPersonLastName(String contactPersonLastName) {
		this.contactPersonLastName = contactPersonLastName;
	}

	public String getContactPersonMobile1() {
		return this.contactPersonMobile1;
	}

	public void setContactPersonMobile1(String contactPersonMobile1) {
		this.contactPersonMobile1 = contactPersonMobile1;
	}

	public String getContactPersonMobile2() {
		return this.contactPersonMobile2;
	}

	public void setContactPersonMobile2(String contactPersonMobile2) {
		this.contactPersonMobile2 = contactPersonMobile2;
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

	public String getVenderAddress() {
		return this.venderAddress;
	}

	public void setVenderAddress(String venderAddress) {
		this.venderAddress = venderAddress;
	}

	public String getVenderCompanyName() {
		return this.venderCompanyName;
	}

	public void setVenderCompanyName(String venderCompanyName) {
		this.venderCompanyName = venderCompanyName;
	}

	public String getVenderGstNo() {
		return this.venderGstNo;
	}

	public void setVenderGstNo(String venderGstNo) {
		this.venderGstNo = venderGstNo;
	}

	public String getVenderTypeId() {
		return this.venderTypeId;
	}

	public void setVenderTypeId(String venderTypeId) {
		this.venderTypeId = venderTypeId;
	}

	public UserMaster getUserMaster() {
		return this.userMaster;
	}

	public void setUserMaster(UserMaster userMaster) {
		this.userMaster = userMaster;
	}

}