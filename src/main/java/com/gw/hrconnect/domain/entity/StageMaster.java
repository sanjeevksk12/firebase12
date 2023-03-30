package com.gw.hrconnect.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the stage_master database table.
 * 
 */
@Entity
@Table(name="stage_master")
@NamedQuery(name="StageMaster.findAll", query="SELECT s FROM StageMaster s")
public class StageMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="stage_id", unique=true, nullable=false)
	private int stageId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="is_active", nullable=false)
	private byte isActive;

	@Temporal(TemporalType.DATE)
	@Column(name="last_updated_date")
	private Date lastUpdatedDate;

	@Column(name="stage_name", nullable=false, length=150)
	private String stageName;

	//bi-directional many-to-one association to CandidateProcessDetail
	@OneToMany(mappedBy="stageMaster")
	private List<CandidateProcessDetail> candidateProcessDetails;

	//bi-directional many-to-one association to UserMaster
	@ManyToOne
	@JoinColumn(name="update_by_user_id", nullable=false)
	private UserMaster userMaster;

	//bi-directional many-to-one association to StageSubMaster
	@OneToMany(mappedBy="stageMaster")
	private List<StageSubMaster> stageSubMasters;

	//bi-directional many-to-one association to WorkflowDetail
	@OneToMany(mappedBy="stageMaster")
	private List<WorkflowDetail> workflowDetails;

	public StageMaster() {
	}

	public int getStageId() {
		return this.stageId;
	}

	public void setStageId(int stageId) {
		this.stageId = stageId;
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

	public String getStageName() {
		return this.stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

	public List<CandidateProcessDetail> getCandidateProcessDetails() {
		return this.candidateProcessDetails;
	}

	public void setCandidateProcessDetails(List<CandidateProcessDetail> candidateProcessDetails) {
		this.candidateProcessDetails = candidateProcessDetails;
	}

	public CandidateProcessDetail addCandidateProcessDetail(CandidateProcessDetail candidateProcessDetail) {
		getCandidateProcessDetails().add(candidateProcessDetail);
		candidateProcessDetail.setStageMaster(this);

		return candidateProcessDetail;
	}

	public CandidateProcessDetail removeCandidateProcessDetail(CandidateProcessDetail candidateProcessDetail) {
		getCandidateProcessDetails().remove(candidateProcessDetail);
		candidateProcessDetail.setStageMaster(null);

		return candidateProcessDetail;
	}

	public UserMaster getUserMaster() {
		return this.userMaster;
	}

	public void setUserMaster(UserMaster userMaster) {
		this.userMaster = userMaster;
	}

	public List<StageSubMaster> getStageSubMasters() {
		return this.stageSubMasters;
	}

	public void setStageSubMasters(List<StageSubMaster> stageSubMasters) {
		this.stageSubMasters = stageSubMasters;
	}

	public StageSubMaster addStageSubMaster(StageSubMaster stageSubMaster) {
		getStageSubMasters().add(stageSubMaster);
		stageSubMaster.setStageMaster(this);

		return stageSubMaster;
	}

	public StageSubMaster removeStageSubMaster(StageSubMaster stageSubMaster) {
		getStageSubMasters().remove(stageSubMaster);
		stageSubMaster.setStageMaster(null);

		return stageSubMaster;
	}

	public List<WorkflowDetail> getWorkflowDetails() {
		return this.workflowDetails;
	}

	public void setWorkflowDetails(List<WorkflowDetail> workflowDetails) {
		this.workflowDetails = workflowDetails;
	}

	public WorkflowDetail addWorkflowDetail(WorkflowDetail workflowDetail) {
		getWorkflowDetails().add(workflowDetail);
		workflowDetail.setStageMaster(this);

		return workflowDetail;
	}

	public WorkflowDetail removeWorkflowDetail(WorkflowDetail workflowDetail) {
		getWorkflowDetails().remove(workflowDetail);
		workflowDetail.setStageMaster(null);

		return workflowDetail;
	}

}