package com.portfolio.portfolio.developer.Mapper;



import org.springframework.stereotype.Component;

import com.portfolio.portfolio.developer.Entity.EntityProject;
import com.portfolio.portfolio.developer.dto.DTOProject;
import com.portfolio.portfolio.enumerator.enumerator;

//Mapper
@Component
public class DeveloperMapper {

    public EntityProject addProject(DTOProject project) {
        EntityProject entity = new EntityProject();
       
        


       
        entity.setName_developer(project.getName_developer());
        entity.setId_client(project.getId_client());
        entity.setStatus_enum(enumerator.OK);
        entity.setName_project(project.getName_project());
        entity.setName_developer(project.getName_developer());

        return entity;
    }

}
