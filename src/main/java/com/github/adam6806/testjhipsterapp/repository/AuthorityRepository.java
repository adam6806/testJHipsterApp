package com.github.adam6806.testjhipsterapp.repository;

import com.github.adam6806.testjhipsterapp.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
