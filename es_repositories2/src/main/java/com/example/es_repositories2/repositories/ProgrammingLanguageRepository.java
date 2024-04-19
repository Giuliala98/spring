package com.example.es_repositories2.repositories;

import com.example.es_repositories2.entity.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages")
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
}
