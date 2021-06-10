package kodlamaio.HRMS.entities.dtos;

import java.util.List;

import kodlamaio.HRMS.entities.Concrete.JobSeeker;
import kodlamaio.HRMS.entities.Concrete.ResumeEducation;
import kodlamaio.HRMS.entities.Concrete.ResumeExperience;
import kodlamaio.HRMS.entities.Concrete.ResumeImage;
import kodlamaio.HRMS.entities.Concrete.ResumeLanguage;
import kodlamaio.HRMS.entities.Concrete.ResumeLink;
import kodlamaio.HRMS.entities.Concrete.ResumeSkill;

public class JobSeekerResumeDto {

	public JobSeeker jobSeeker;
	public List<ResumeEducation> educations;
	public List<ResumeSkill> resumeSkills;
	public List<ResumeLink> resumeLinks;
	public List<ResumeExperience> jobExperiences;
	public List<ResumeLanguage> languages;
	public ResumeImage image;
}
