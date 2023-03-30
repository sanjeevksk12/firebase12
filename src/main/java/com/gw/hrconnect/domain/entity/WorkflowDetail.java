package com.gw.hrconnect.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the workflow_details database table.
 * 
 */
@Entity
@Table(name="workflow_details")
@NamedQuery(name="WorkflowDetail.findAll", query="SELECT w FROM WorkflowDetail w")
public class WorkflowDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="workflow_details_id", unique=true, nullable=false)
	private int workflowDetailsId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="is_active", nullable=false)
	private byte isActive;

	@Temporal(TemporalType.DATE)
	@Column(name="last_updated_date")
	private Date lastUpdatedDate;

	@Column(name="update_by_user_id")
	private int updateByUserId;

	@Column(name="workflow__id")
	private int workflowId;

	//bi-directional many-to-one association to StageMaster
	@ManyToOne
	@JoinColumn(name="stage_id")
	private StageMaster stageMaster;

	//bi-directional many-to-one association to StageSubMaster
	@ManyToOne
	@JoinColumn(name="stage_sub_id")
	private StageSubMaster stageSubMaster;

	public WorkflowDetail() {
	}

	public int getWorkflowDetailsId() {
		return this.workflowDetailsId;
	}

	public void setWorkflowDetailsId(int workflowDetailsId) {
		this.workflowDetailsId = workflowDetailsId;
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

	public int getUpdateByUserId() {
		return this.updateByUserId;
	}

	public void setUpdateByUserId(int updateByUserId) {
		this.updateByUserId = updateByUserId;
	}

	public int getWorkflowId() {
		return this.workflowId;
	}

	public void setWorkflowId(int workflowId) {
		this.workflowId = workflowId;
	}

	public StageMaster getStageMaster() {
		return this.stageMaster;
	}

	public void setStageMaster(StageMaster stageMaster) {
		this.stageMaster = stageMaster;
	}

	public StageSubMaster getStageSubMaster() {
		return this.stageSubMaster;
	}

	public void setStageSubMaster(StageSubMaster stageSubMaster) {
		this.stageSubMaster = stageSubMaster;
	}

}