package com.portfolio.portfolio.developer.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.portfolio.portfolio.developer.Entity.EntityProject;
import com.portfolio.portfolio.developer.Service.DeveloperService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.portfolio.portfolio.developer.dto.DTOProject;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/developer")
public class DeveloperController {

    @Autowired
    protected DeveloperService service;

    @PostMapping("addProject")
    public EntityProject addProject(@RequestBody DTOProject entity) {

        return service.addProject(entity);
    }

    @GetMapping("/find/{id}")
    public EntityProject getProjectById(@PathVariable int id) {
        return service.getProjectById(id);
    }

    @DeleteMapping("/del/{id}")
    public boolean delProject( @PathVariable int id) {
        return service.delProject(id);
    }

    @GetMapping("/finish/{id}")
    public EntityProject finishProject(@PathVariable int id) {
        return service.finishProject(id);
    }
}
