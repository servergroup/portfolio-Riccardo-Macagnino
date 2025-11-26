package com.portfolio.portfolio.developer.Service;

import com.portfolio.portfolio.developer.Entity.EntityProject;
import com.portfolio.portfolio.developer.dto.DTOProject;

public interface IDeveloperService {

    public EntityProject addProject(DTOProject project);

    public EntityProject getProjectById(int id);

    public boolean delProject(int id);

    public EntityProject finishProject(int id);

}
