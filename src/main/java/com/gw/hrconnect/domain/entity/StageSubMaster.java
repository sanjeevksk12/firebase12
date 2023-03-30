package com.gw.hrconnect.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the stage_sub_master database table.
 * 
 */
@Entity
@Table(name="stage_sub_master")
@NamedQuery(name="StageSubMaster.findAll", query="SELECT s FROM StageSubMaster s")
public class StageSubMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="stage_sub_id", unique=true, nullable=false)
	private int stageSubId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="is_active", nullable=false)
	private byte isActive;

	@Temporal(TemporalType.DATE)
	@Column(name="last_updated_date")
	private Date lastUpdatedDate;

	@Column(name="stage_sub_name", nullable=false, length=150)
	private String stageSubName;

	//bi-directional many-to-one association to CandidateProcessDetail
	@OneToMany(mappedBy="stageSubMaster")
	private List<CandidateProcessDetail> candidateProcessDetails;

	//bi-directional many-to-one association to StageMaster
	@ManyToOne
	@JoinColumn(name="stage_id", nullable=false)
	private StageMaster stageMaster;

	//bi-directional many-to-one association to UserMaster
	@ManyToOne
	@JoinColumn(name="update_by_user_id", nullable=false)
	private UserMaster userMaster;

	//bi-directional many-to-one association to WorkflowDetail
	@OneToMany(mappedBy="stageSubMaster")
	private List<WorkflowDetail> workflowDetails;

	public StageSubMaster() {
	}

	public int getStageSubId() {
		return this.stageSubId;
	}

	public void setStageSubId(int stageSubId) {
		this.stageSubId = stageSubId;
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

	public String getStageSubName() {
		return this.stageSubName;
	}

	public void setStageSubName(String stageSubName) {
		this.stageSubName = stageSubName;
	}

	public List<CandidateProcessDetail> getCandidateProcessDetails() {
		return this.candidateProcessDetails;
	}

	public void setCandidateProcessDetails(List<CandidateProcessDetail> candidateProcessDetails) {
		this.candidateProcessDetails = candidateProcessDetails;
	}

	public CandidateProcessDetail addCandidateProcessDetail(CandidateProcessDetail candidateProcessDetail) {
		getCandidateProcessDetails().add(candidateProcessDetail);
		candidateProcessDetail.setStageSubMaster(this);

		return candidateProcessDetail;
	}

	public CandidateProcessDetail removeCandidateProcessDetail(CandidateProcessDetail candidateProcessDetail) {
		getCandidateProcessDetails().remove(candidateProcessDetail);
		candidateProcessDetail.setStageSubMaster(null);

		return candidateProcessDetail;
	}

	public StageMaster getStageMaster() {
		return this.stageMaster;
	}

	public void setStageMaster(StageMaster stageMaster) {
		this.stageMaster = stageMaster;
	}

	public UserMaster getUserMaster() {
		return this.userMaster;
	}

	public void setUserMaster(UserMaster userMaster) {
		this.userMaster = userMaster;
	}

	public List<WorkflowDetail> getWorkflowDetails() {
		return this.workflowDetails;
	}

	public void setWorkflowDetails(List<WorkflowDetail> workflowDetails) {
		this.workflowDetails = workflowDetails;
	}

	public WorkflowDetail addWorkflowDetail(WorkflowDetail workflowDetail) {
		getWorkflowDetails().add(workflowDetail);
		workflowDetail.setStageSubMaster(this);

		return workflowDetail;
	}

	public WorkflowDetail removeWorkflowDetail(WorkflowDetail workflowDetail) {
		getWorkflowDetails().remove(workflowDetail);
		workflowDetail.setStageSubMaster(null);

		return workflowDetail;
	}

}