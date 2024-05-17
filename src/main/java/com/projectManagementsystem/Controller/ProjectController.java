package com.projectManagementsystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectManagementsystem.Model.ProjectModel;
import com.projectManagementsystem.ServiceLayer.ProjectServicelayerInterface;

@RestController
@RequestMapping("/projects")
public class ProjectController 
{
	@Autowired
	private ProjectServicelayerInterface projectServicelayerInterface;
	
	@PostMapping
	public ProjectModel createProject(@RequestBody ProjectModel model )
	{
		return projectServicelayerInterface.createProject(model);
	}
	@GetMapping
	public List<ProjectModel> getAllDetails()
	{
		return projectServicelayerInterface.getAllDetails();
	}
	@GetMapping("/{id}")
	public ResponseEntity<ProjectModel> getProjectById(@PathVariable Long id)
	{
		ProjectModel model = projectServicelayerInterface.getProjectId(id).orElseThrow(()-> new RuntimeException("Project Not Found"));
		 return ResponseEntity.ok(model);
	}
	@PutMapping("/{id}")
	public ProjectModel updateProject(@PathVariable Long id, @RequestBody ProjectModel model)
	{
		return projectServicelayerInterface.updateProject(id, model);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteProject(@PathVariable Long id)
	{
		projectServicelayerInterface.deleteProject(id);
		return ResponseEntity.noContent().build();
	}
	

}
