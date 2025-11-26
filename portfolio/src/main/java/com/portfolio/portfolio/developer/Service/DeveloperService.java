package com.portfolio.portfolio.developer.Service;

import org.springframework.stereotype.Service;

import com.portfolio.portfolio.developer.Entity.EntityProject;
import com.portfolio.portfolio.developer.Mapper.DeveloperMapper;
import com.portfolio.portfolio.developer.Repository.DeveloperRepository;
import com.portfolio.portfolio.developer.dto.DTOProject;
import com.portfolio.portfolio.enumerator.enumerator;

@Service
public class DeveloperService implements IDeveloperService {

    protected DeveloperRepository repo;
    protected DeveloperMapper mapper;

    public DeveloperService(DeveloperRepository repo, DeveloperMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    // Crea un nuovo progetto a partire dal DTO ricevuto e lo salva nel database.

    public EntityProject addProject(DTOProject project) {
        EntityProject entity = mapper.addProject(project);
        return repo.save(entity);
    }

    @Override

    // Restituisce il progetto corrispondente all'id indicato, oppure null se non
    // esiste.

    public EntityProject getProjectById(int id) {
        // ricerca del progetto
        EntityProject project = repo.findById(id).orElse(null);
        return project;
    }

    @Override
    // Elimina il progetto se esiste. Restituisce true se la cancellazione è
    // avvenuta, false altrimenti.

    public boolean delProject(int id) {
        EntityProject project = getProjectById(id);

        if (project != null) {
            repo.deleteById(id);
            return true;
        } else {
            return false;
        }

    }

    @Override
    // Imposta lo stato del progetto come terminato, se il progetto esiste, e lo
    // salva nuovamente.

    public EntityProject finishProject(int id) {

        EntityProject project = getProjectById(id);

        if (project != null) {
            project.setStatus_enum(enumerator.FINISH);
            return repo.save(project);
        } else {
            return null;
        }
    }

}
