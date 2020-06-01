package com.example.bodyleasing.project.domain.project.repository;

import com.example.bodyleasing.commontypes.ProjectId;
import com.example.bodyleasing.project.domain.project.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@Repository
@NoRepositoryBean
public interface ProjectRepository extends JpaRepository<Project, Long> {

    public Project findById(ProjectId projectId);
}
