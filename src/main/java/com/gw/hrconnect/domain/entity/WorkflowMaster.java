package com.gw.hrconnect.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the workflow_master database table.
 * 
 */
@Entity
@Table(name="workflow_master")
@NamedQuery(name="WorkflowMaster.findAll", query="SELECT w FROM WorkflowMaster w")
public class WorkflowMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="workflow_id", unique=true, nullable=false)
	private int workflowId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="is_active", nullable=false)
	private byte isActive;

	@Temporal(TemporalType.DATE)
	@Column(name="last_updated_date")
	private Date lastUpdatedDate;

	@Column(name="work_name", nullable=false, length=150)
	private String workName;

	@Column(name="workflow_decription", length=2000)
	private String workflowDecription;

	//bi-directional many-to-one association to CandidateProcessDetail
	@OneToMany(mappedBy="workflowMaster")
	private List<CandidateProcessDetail> candidateProcessDetails;

	//bi-directional many-to-one association to UserMaster
	@ManyToOne
	@JoinColumn(name="update_by_user_id", nullable=false)
	private UserMaster userMaster;

	public WorkflowMaster() {
	}

	public int getWorkflowId() {
		return this.workflowId;
	}

	public void setWorkflowId(int workflowId) {
		this.workflowId = workflowId;
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

	public String getWorkName() {
		return this.workName;
	}

	public void setWorkName(String workName) {
		this.workName = workName;
	}

	public String getWorkflowDecription() {
		return this.workflowDecription;
	}

	public void setWorkflowDecription(String workflowDecription) {
		this.workflowDecription = workflowDecription;
	}

	public List<CandidateProcessDetail> getCandidateProcessDetails() {
		return this.candidateProcessDetails;
	}

	public void setCandidateProcessDetails(List<CandidateProcessDetail> candidateProcessDetails) {
		this.candidateProcessDetails = candidateProcessDetails;
	}

	public CandidateProcessDetail addCandidateProcessDetail(CandidateProcessDetail candidateProcessDetail) {
		getCandidateProcessDetails().add(candidateProcessDetail);
		candidateProcessDetail.setWorkflowMaster(this);

		return candidateProcessDetail;
	}

	public CandidateProcessDetail removeCandidateProcessDetail(CandidateProcessDetail candidateProcessDetail) {
		getCandidateProcessDetails().remove(candidateProcessDetail);
		candidateProcessDetail.setWorkflowMaster(null);

		return candidateProcessDetail;
	}

	public UserMaster getUserMaster() {
		return this.userMaster;
	}

	public void setUserMaster(UserMaster userMaster) {
		this.userMaster = userMaster;
	}

}