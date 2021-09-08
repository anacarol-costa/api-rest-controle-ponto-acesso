package com.github.anacarolcosta.apirestcontrolepontoacesso.repository;

import com.github.anacarolcosta.apirestcontrolepontoacesso.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
