package com.khm.reactivepostgres.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import com.khm.reactivepostgres.entity.Professor;

public interface ProfessorRepository extends R2dbcRepository<Professor, Integer>{
    
}
