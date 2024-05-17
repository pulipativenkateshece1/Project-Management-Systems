package com.projectManagementsystem.ServiceLayer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectManagementsystem.Model.ProjectModel;
import com.projectManagementsystem.RepositoryLayer.ProjectRepository;
@Service
public class ProjectServiceclass implements ProjectServicelayerInterface 
{
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public ProjectModel createProject(ProjectModel model) {
		// TODO Auto-generated method stub
		return projectRepository.save(model);
	}

	@Override
	public List<ProjectModel> getAllDetails() {
		// TODO Auto-generated method stub
		return projectRepository.findAll();
	}

	@Override
	public Optional<ProjectModel> getProjectId(Long id) {
		// TODO Auto-generated method stub
		return projectRepository.findById(id);
	}

	@Override
	public ProjectModel updateProject(Long id, ProjectModel model) {
		// TODO Auto-generated method stub
		ProjectModel model2 = projectRepository.findById(id).orElseThrow(()-> new RuntimeException("Project Not Found"));
		model2.setName(model.getName());
		model2.setDescription(model.getDescription());
		model2.setStartDate(model.getStartDate());
		model2.setEndDate(model.getEndDate());
		return projectRepository.save(model2);
	}

	@Override
	public void deleteProject(Long id) 
	{
		projectRepository.deleteById(id);
		// TODO Auto-generated method stub

	}

	

}
