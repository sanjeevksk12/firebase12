package com.gw.hrconnect.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the candidate_process_details database table.
 * 
 */
@Entity
@Table(name="candidate_process_details")
@NamedQuery(name="CandidateProcessDetail.findAll", query="SELECT c FROM CandidateProcessDetail c")
public class CandidateProcessDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="candidate_process_details_id", unique=true, nullable=false)
	private int candidateProcessDetailsId;

	@Column(nullable=false, length=2000)
	private String comments;

	@Column(name="interview_schedule_candidate_joined")
	private byte interviewScheduleCandidateJoined;

	@Temporal(TemporalType.DATE)
	@Column(name="interview_schedule_date")
	private Date interviewScheduleDate;

	@Column(name="is_followup_next_round")
	private byte isFollowupNextRound;

	@Column(name="stage_status", length=100)
	private String stageStatus;

	@Column(name="stage_sub_status", length=100)
	private String stageSubStatus;

	//bi-directional many-to-one association to CandidateMaster
	@ManyToOne
	@JoinColumn(name="candidate_id")
	private CandidateMaster candidateMaster;

	//bi-directional many-to-one association to StageMaster
	@ManyToOne
	@JoinColumn(name="stage_id")
	private StageMaster stageMaster;

	//bi-directional many-to-one association to StageSubMaster
	@ManyToOne
	@JoinColumn(name="stage_sub_id")
	private StageSubMaster stageSubMaster;

	//bi-directional many-to-one association to UserMaster
	@ManyToOne
	@JoinColumn(name="update_by_user_id", nullable=false)
	private UserMaster userMaster;

	//bi-directional many-to-one association to WorkflowMaster
	@ManyToOne
	@JoinColumn(name="workflow_id")
	private WorkflowMaster workflowMaster;

	public CandidateProcessDetail() {
	}

	public int getCandidateProcessDetailsId() {
		return this.candidateProcessDetailsId;
	}

	public void setCandidateProcessDetailsId(int candidateProcessDetailsId) {
		this.candidateProcessDetailsId = candidateProcessDetailsId;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public byte getInterviewScheduleCandidateJoined() {
		return this.interviewScheduleCandidateJoined;
	}

	public void setInterviewScheduleCandidateJoined(byte interviewScheduleCandidateJoined) {
		this.interviewScheduleCandidateJoined = interviewScheduleCandidateJoined;
	}

	public Date getInterviewScheduleDate() {
		return this.interviewScheduleDate;
	}

	public void setInterviewScheduleDate(Date interviewScheduleDate) {
		this.interviewScheduleDate = interviewScheduleDate;
	}

	public byte getIsFollowupNextRound() {
		return this.isFollowupNextRound;
	}

	public void setIsFollowupNextRound(byte isFollowupNextRound) {
		this.isFollowupNextRound = isFollowupNextRound;
	}

	public String getStageStatus() {
		return this.stageStatus;
	}

	public void setStageStatus(String stageStatus) {
		this.stageStatus = stageStatus;
	}

	public String getStageSubStatus() {
		return this.stageSubStatus;
	}

	public void setStageSubStatus(String stageSubStatus) {
		this.stageSubStatus = stageSubStatus;
	}

	public CandidateMaster getCandidateMaster() {
		return this.candidateMaster;
	}

	public void setCandidateMaster(CandidateMaster candidateMaster) {
		this.candidateMaster = candidateMaster;
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

	public UserMaster getUserMaster() {
		return this.userMaster;
	}

	public void setUserMaster(UserMaster userMaster) {
		this.userMaster = userMaster;
	}

	public WorkflowMaster getWorkflowMaster() {
		return this.workflowMaster;
	}

	public void setWorkflowMaster(WorkflowMaster workflowMaster) {
		this.workflowMaster = workflowMaster;
	}

}