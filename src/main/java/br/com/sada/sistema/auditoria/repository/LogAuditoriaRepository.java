package br.com.sada.sistema.auditoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sada.sistema.auditoria.model.LogAuditoria;

public interface LogAuditoriaRepository extends JpaRepository<LogAuditoria, Integer> {

}
