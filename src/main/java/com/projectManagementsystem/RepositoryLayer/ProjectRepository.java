package com.projectManagementsystem.RepositoryLayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectManagementsystem.Model.ProjectModel;
@Repository
public interface ProjectRepository extends JpaRepository<ProjectModel, Long> 
{

}
