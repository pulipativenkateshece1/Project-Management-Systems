package com.projectManagementsystem.ServiceLayer;

import java.util.List;
import java.util.Optional;

import com.projectManagementsystem.Model.ProjectModel;

public interface ProjectServicelayerInterface 
{
	public ProjectModel createProject(ProjectModel model);
	public List<ProjectModel> getAllDetails();
	public Optional<ProjectModel> getProjectId(Long id);
	public ProjectModel updateProject(Long id, ProjectModel model);
	public void deleteProject(Long id);
	

}
