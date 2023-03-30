package com.gw.hrconnect.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the user_master database table.
 * 
 */
@Entity
@Table(name="user_master")
@NamedQuery(name="UserMaster.findAll", query="SELECT u FROM UserMaster u")
public class UserMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_id", unique=true, nullable=false)
	private int userId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="email_id", nullable=false, length=100)
	private String emailId;

	@Column(name="is_active", nullable=false)
	private byte isActive;

	@Temporal(TemporalType.DATE)
	@Column(name="last_login_date")
	private Date lastLoginDate;

	@Column(name="login_id", nullable=false, length=100)
	private String loginId;

	@Column(nullable=false, length=40)
	private String password;

	@Temporal(TemporalType.DATE)
	@Column(name="updated_date")
	private Date updatedDate;

	//bi-directional many-to-one association to CandidateMaster
	@OneToMany(mappedBy="userMaster")
	private List<CandidateMaster> candidateMasters;

	//bi-directional many-to-one association to CandidateProcessDetail
	@OneToMany(mappedBy="userMaster")
	private List<CandidateProcessDetail> candidateProcessDetails;

	//bi-directional many-to-one association to CtcMaster
	@OneToMany(mappedBy="userMaster")
	private List<CtcMaster> ctcMasters;

	//bi-directional many-to-one association to DeptMaster
	@OneToMany(mappedBy="userMaster")
	private List<DeptMaster> deptMasters;

	//bi-directional many-to-one association to DesignationMaster
	@OneToMany(mappedBy="userMaster")
	private List<DesignationMaster> designationMasters;

	//bi-directional many-to-one association to JdDetail
	@OneToMany(mappedBy="userMaster")
	private List<JdDetail> jdDetails;

	//bi-directional many-to-one association to JdRoleMaster
	@OneToMany(mappedBy="userMaster")
	private List<JdRoleMaster> jdRoleMasters;

	//bi-directional many-to-one association to JobMaster
	@OneToMany(mappedBy="userMaster")
	private List<JobMaster> jobMasters;

	//bi-directional many-to-one association to JobTypeMaster
	@OneToMany(mappedBy="userMaster")
	private List<JobTypeMaster> jobTypeMasters;

	//bi-directional many-to-one association to LocationMaster
	@OneToMany(mappedBy="userMaster")
	private List<LocationMaster> locationMasters;

	//bi-directional many-to-one association to ProfileSourceMaster
	@OneToMany(mappedBy="userMaster")
	private List<ProfileSourceMaster> profileSourceMasters;

	//bi-directional many-to-one association to RoleMaster
	@OneToMany(mappedBy="userMaster")
	private List<RoleMaster> roleMasters;

	//bi-directional many-to-one association to SkillCategory
	@OneToMany(mappedBy="userMaster")
	private List<SkillCategory> skillCategories;

	//bi-directional many-to-one association to SkillGroupDetail
	@OneToMany(mappedBy="userMaster")
	private List<SkillGroupDetail> skillGroupDetails;

	//bi-directional many-to-one association to SkillGroupMaster
	@OneToMany(mappedBy="userMaster")
	private List<SkillGroupMaster> skillGroupMasters;

	//bi-directional many-to-one association to SkillMaster
	@OneToMany(mappedBy="userMaster")
	private List<SkillMaster> skillMasters;

	//bi-directional many-to-one association to StageMaster
	@OneToMany(mappedBy="userMaster")
	private List<StageMaster> stageMasters;

	//bi-directional many-to-one association to StageSubMaster
	@OneToMany(mappedBy="userMaster")
	private List<StageSubMaster> stageSubMasters;

	//bi-directional many-to-one association to RoleMaster
	@ManyToOne
	@JoinColumn(name="update_by_role_id", nullable=false)
	private RoleMaster roleMaster;

	//bi-directional many-to-one association to VenderMaster
	@OneToMany(mappedBy="userMaster")
	private List<VenderMaster> venderMasters;

	//bi-directional many-to-one association to VenderType
	@OneToMany(mappedBy="userMaster")
	private List<VenderType> venderTypes;

	//bi-directional many-to-one association to WorkflowMaster
	@OneToMany(mappedBy="userMaster")
	private List<WorkflowMaster> workflowMasters;

	//bi-directional many-to-one association to WorkingModeMaster
	@OneToMany(mappedBy="userMaster")
	private List<WorkingModeMaster> workingModeMasters;

	public UserMaster() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public Date getLastLoginDate() {
		return this.lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getLoginId() {
		return this.loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public List<CandidateMaster> getCandidateMasters() {
		return this.candidateMasters;
	}

	public void setCandidateMasters(List<CandidateMaster> candidateMasters) {
		this.candidateMasters = candidateMasters;
	}

	public CandidateMaster addCandidateMaster(CandidateMaster candidateMaster) {
		getCandidateMasters().add(candidateMaster);
		candidateMaster.setUserMaster(this);

		return candidateMaster;
	}

	public CandidateMaster removeCandidateMaster(CandidateMaster candidateMaster) {
		getCandidateMasters().remove(candidateMaster);
		candidateMaster.setUserMaster(null);

		return candidateMaster;
	}

	public List<CandidateProcessDetail> getCandidateProcessDetails() {
		return this.candidateProcessDetails;
	}

	public void setCandidateProcessDetails(List<CandidateProcessDetail> candidateProcessDetails) {
		this.candidateProcessDetails = candidateProcessDetails;
	}

	public CandidateProcessDetail addCandidateProcessDetail(CandidateProcessDetail candidateProcessDetail) {
		getCandidateProcessDetails().add(candidateProcessDetail);
		candidateProcessDetail.setUserMaster(this);

		return candidateProcessDetail;
	}

	public CandidateProcessDetail removeCandidateProcessDetail(CandidateProcessDetail candidateProcessDetail) {
		getCandidateProcessDetails().remove(candidateProcessDetail);
		candidateProcessDetail.setUserMaster(null);

		return candidateProcessDetail;
	}

	public List<CtcMaster> getCtcMasters() {
		return this.ctcMasters;
	}

	public void setCtcMasters(List<CtcMaster> ctcMasters) {
		this.ctcMasters = ctcMasters;
	}

	public CtcMaster addCtcMaster(CtcMaster ctcMaster) {
		getCtcMasters().add(ctcMaster);
		ctcMaster.setUserMaster(this);

		return ctcMaster;
	}

	public CtcMaster removeCtcMaster(CtcMaster ctcMaster) {
		getCtcMasters().remove(ctcMaster);
		ctcMaster.setUserMaster(null);

		return ctcMaster;
	}

	public List<DeptMaster> getDeptMasters() {
		return this.deptMasters;
	}

	public void setDeptMasters(List<DeptMaster> deptMasters) {
		this.deptMasters = deptMasters;
	}

	public DeptMaster addDeptMaster(DeptMaster deptMaster) {
		getDeptMasters().add(deptMaster);
		deptMaster.setUserMaster(this);

		return deptMaster;
	}

	public DeptMaster removeDeptMaster(DeptMaster deptMaster) {
		getDeptMasters().remove(deptMaster);
		deptMaster.setUserMaster(null);

		return deptMaster;
	}

	public List<DesignationMaster> getDesignationMasters() {
		return this.designationMasters;
	}

	public void setDesignationMasters(List<DesignationMaster> designationMasters) {
		this.designationMasters = designationMasters;
	}

	public DesignationMaster addDesignationMaster(DesignationMaster designationMaster) {
		getDesignationMasters().add(designationMaster);
		designationMaster.setUserMaster(this);

		return designationMaster;
	}

	public DesignationMaster removeDesignationMaster(DesignationMaster designationMaster) {
		getDesignationMasters().remove(designationMaster);
		designationMaster.setUserMaster(null);

		return designationMaster;
	}

	public List<JdDetail> getJdDetails() {
		return this.jdDetails;
	}

	public void setJdDetails(List<JdDetail> jdDetails) {
		this.jdDetails = jdDetails;
	}

	public JdDetail addJdDetail(JdDetail jdDetail) {
		getJdDetails().add(jdDetail);
		jdDetail.setUserMaster(this);

		return jdDetail;
	}

	public JdDetail removeJdDetail(JdDetail jdDetail) {
		getJdDetails().remove(jdDetail);
		jdDetail.setUserMaster(null);

		return jdDetail;
	}

	public List<JdRoleMaster> getJdRoleMasters() {
		return this.jdRoleMasters;
	}

	public void setJdRoleMasters(List<JdRoleMaster> jdRoleMasters) {
		this.jdRoleMasters = jdRoleMasters;
	}

	public JdRoleMaster addJdRoleMaster(JdRoleMaster jdRoleMaster) {
		getJdRoleMasters().add(jdRoleMaster);
		jdRoleMaster.setUserMaster(this);

		return jdRoleMaster;
	}

	public JdRoleMaster removeJdRoleMaster(JdRoleMaster jdRoleMaster) {
		getJdRoleMasters().remove(jdRoleMaster);
		jdRoleMaster.setUserMaster(null);

		return jdRoleMaster;
	}

	public List<JobMaster> getJobMasters() {
		return this.jobMasters;
	}

	public void setJobMasters(List<JobMaster> jobMasters) {
		this.jobMasters = jobMasters;
	}

	public JobMaster addJobMaster(JobMaster jobMaster) {
		getJobMasters().add(jobMaster);
		jobMaster.setUserMaster(this);

		return jobMaster;
	}

	public JobMaster removeJobMaster(JobMaster jobMaster) {
		getJobMasters().remove(jobMaster);
		jobMaster.setUserMaster(null);

		return jobMaster;
	}

	public List<JobTypeMaster> getJobTypeMasters() {
		return this.jobTypeMasters;
	}

	public void setJobTypeMasters(List<JobTypeMaster> jobTypeMasters) {
		this.jobTypeMasters = jobTypeMasters;
	}

	public JobTypeMaster addJobTypeMaster(JobTypeMaster jobTypeMaster) {
		getJobTypeMasters().add(jobTypeMaster);
		jobTypeMaster.setUserMaster(this);

		return jobTypeMaster;
	}

	public JobTypeMaster removeJobTypeMaster(JobTypeMaster jobTypeMaster) {
		getJobTypeMasters().remove(jobTypeMaster);
		jobTypeMaster.setUserMaster(null);

		return jobTypeMaster;
	}

	public List<LocationMaster> getLocationMasters() {
		return this.locationMasters;
	}

	public void setLocationMasters(List<LocationMaster> locationMasters) {
		this.locationMasters = locationMasters;
	}

	public LocationMaster addLocationMaster(LocationMaster locationMaster) {
		getLocationMasters().add(locationMaster);
		locationMaster.setUserMaster(this);

		return locationMaster;
	}

	public LocationMaster removeLocationMaster(LocationMaster locationMaster) {
		getLocationMasters().remove(locationMaster);
		locationMaster.setUserMaster(null);

		return locationMaster;
	}

	public List<ProfileSourceMaster> getProfileSourceMasters() {
		return this.profileSourceMasters;
	}

	public void setProfileSourceMasters(List<ProfileSourceMaster> profileSourceMasters) {
		this.profileSourceMasters = profileSourceMasters;
	}

	public ProfileSourceMaster addProfileSourceMaster(ProfileSourceMaster profileSourceMaster) {
		getProfileSourceMasters().add(profileSourceMaster);
		profileSourceMaster.setUserMaster(this);

		return profileSourceMaster;
	}

	public ProfileSourceMaster removeProfileSourceMaster(ProfileSourceMaster profileSourceMaster) {
		getProfileSourceMasters().remove(profileSourceMaster);
		profileSourceMaster.setUserMaster(null);

		return profileSourceMaster;
	}

	public List<RoleMaster> getRoleMasters() {
		return this.roleMasters;
	}

	public void setRoleMasters(List<RoleMaster> roleMasters) {
		this.roleMasters = roleMasters;
	}

	public RoleMaster addRoleMaster(RoleMaster roleMaster) {
		getRoleMasters().add(roleMaster);
		roleMaster.setUserMaster(this);

		return roleMaster;
	}

	public RoleMaster removeRoleMaster(RoleMaster roleMaster) {
		getRoleMasters().remove(roleMaster);
		roleMaster.setUserMaster(null);

		return roleMaster;
	}

	public List<SkillCategory> getSkillCategories() {
		return this.skillCategories;
	}

	public void setSkillCategories(List<SkillCategory> skillCategories) {
		this.skillCategories = skillCategories;
	}

	public SkillCategory addSkillCategory(SkillCategory skillCategory) {
		getSkillCategories().add(skillCategory);
		skillCategory.setUserMaster(this);

		return skillCategory;
	}

	public SkillCategory removeSkillCategory(SkillCategory skillCategory) {
		getSkillCategories().remove(skillCategory);
		skillCategory.setUserMaster(null);

		return skillCategory;
	}

	public List<SkillGroupDetail> getSkillGroupDetails() {
		return this.skillGroupDetails;
	}

	public void setSkillGroupDetails(List<SkillGroupDetail> skillGroupDetails) {
		this.skillGroupDetails = skillGroupDetails;
	}

	public SkillGroupDetail addSkillGroupDetail(SkillGroupDetail skillGroupDetail) {
		getSkillGroupDetails().add(skillGroupDetail);
		skillGroupDetail.setUserMaster(this);

		return skillGroupDetail;
	}

	public SkillGroupDetail removeSkillGroupDetail(SkillGroupDetail skillGroupDetail) {
		getSkillGroupDetails().remove(skillGroupDetail);
		skillGroupDetail.setUserMaster(null);

		return skillGroupDetail;
	}

	public List<SkillGroupMaster> getSkillGroupMasters() {
		return this.skillGroupMasters;
	}

	public void setSkillGroupMasters(List<SkillGroupMaster> skillGroupMasters) {
		this.skillGroupMasters = skillGroupMasters;
	}

	public SkillGroupMaster addSkillGroupMaster(SkillGroupMaster skillGroupMaster) {
		getSkillGroupMasters().add(skillGroupMaster);
		skillGroupMaster.setUserMaster(this);

		return skillGroupMaster;
	}

	public SkillGroupMaster removeSkillGroupMaster(SkillGroupMaster skillGroupMaster) {
		getSkillGroupMasters().remove(skillGroupMaster);
		skillGroupMaster.setUserMaster(null);

		return skillGroupMaster;
	}

	public List<SkillMaster> getSkillMasters() {
		return this.skillMasters;
	}

	public void setSkillMasters(List<SkillMaster> skillMasters) {
		this.skillMasters = skillMasters;
	}

	public SkillMaster addSkillMaster(SkillMaster skillMaster) {
		getSkillMasters().add(skillMaster);
		skillMaster.setUserMaster(this);

		return skillMaster;
	}

	public SkillMaster removeSkillMaster(SkillMaster skillMaster) {
		getSkillMasters().remove(skillMaster);
		skillMaster.setUserMaster(null);

		return skillMaster;
	}

	public List<StageMaster> getStageMasters() {
		return this.stageMasters;
	}

	public void setStageMasters(List<StageMaster> stageMasters) {
		this.stageMasters = stageMasters;
	}

	public StageMaster addStageMaster(StageMaster stageMaster) {
		getStageMasters().add(stageMaster);
		stageMaster.setUserMaster(this);

		return stageMaster;
	}

	public StageMaster removeStageMaster(StageMaster stageMaster) {
		getStageMasters().remove(stageMaster);
		stageMaster.setUserMaster(null);

		return stageMaster;
	}

	public List<StageSubMaster> getStageSubMasters() {
		return this.stageSubMasters;
	}

	public void setStageSubMasters(List<StageSubMaster> stageSubMasters) {
		this.stageSubMasters = stageSubMasters;
	}

	public StageSubMaster addStageSubMaster(StageSubMaster stageSubMaster) {
		getStageSubMasters().add(stageSubMaster);
		stageSubMaster.setUserMaster(this);

		return stageSubMaster;
	}

	public StageSubMaster removeStageSubMaster(StageSubMaster stageSubMaster) {
		getStageSubMasters().remove(stageSubMaster);
		stageSubMaster.setUserMaster(null);

		return stageSubMaster;
	}

	public RoleMaster getRoleMaster() {
		return this.roleMaster;
	}

	public void setRoleMaster(RoleMaster roleMaster) {
		this.roleMaster = roleMaster;
	}

	public List<VenderMaster> getVenderMasters() {
		return this.venderMasters;
	}

	public void setVenderMasters(List<VenderMaster> venderMasters) {
		this.venderMasters = venderMasters;
	}

	public VenderMaster addVenderMaster(VenderMaster venderMaster) {
		getVenderMasters().add(venderMaster);
		venderMaster.setUserMaster(this);

		return venderMaster;
	}

	public VenderMaster removeVenderMaster(VenderMaster venderMaster) {
		getVenderMasters().remove(venderMaster);
		venderMaster.setUserMaster(null);

		return venderMaster;
	}

	public List<VenderType> getVenderTypes() {
		return this.venderTypes;
	}

	public void setVenderTypes(List<VenderType> venderTypes) {
		this.venderTypes = venderTypes;
	}

	public VenderType addVenderType(VenderType venderType) {
		getVenderTypes().add(venderType);
		venderType.setUserMaster(this);

		return venderType;
	}

	public VenderType removeVenderType(VenderType venderType) {
		getVenderTypes().remove(venderType);
		venderType.setUserMaster(null);

		return venderType;
	}

	public List<WorkflowMaster> getWorkflowMasters() {
		return this.workflowMasters;
	}

	public void setWorkflowMasters(List<WorkflowMaster> workflowMasters) {
		this.workflowMasters = workflowMasters;
	}

	public WorkflowMaster addWorkflowMaster(WorkflowMaster workflowMaster) {
		getWorkflowMasters().add(workflowMaster);
		workflowMaster.setUserMaster(this);

		return workflowMaster;
	}

	public WorkflowMaster removeWorkflowMaster(WorkflowMaster workflowMaster) {
		getWorkflowMasters().remove(workflowMaster);
		workflowMaster.setUserMaster(null);

		return workflowMaster;
	}

	public List<WorkingModeMaster> getWorkingModeMasters() {
		return this.workingModeMasters;
	}

	public void setWorkingModeMasters(List<WorkingModeMaster> workingModeMasters) {
		this.workingModeMasters = workingModeMasters;
	}

	public WorkingModeMaster addWorkingModeMaster(WorkingModeMaster workingModeMaster) {
		getWorkingModeMasters().add(workingModeMaster);
		workingModeMaster.setUserMaster(this);

		return workingModeMaster;
	}

	public WorkingModeMaster removeWorkingModeMaster(WorkingModeMaster workingModeMaster) {
		getWorkingModeMasters().remove(workingModeMaster);
		workingModeMaster.setUserMaster(null);

		return workingModeMaster;
	}

}