package br.com.sada.sistema.auditoria.services;

import org.springframework.stereotype.Service;

import br.com.sada.sistema.auditoria.model.LogAuditoria;
import br.com.sada.sistema.auditoria.repository.LogAuditoriaRepository;

@Service
public class LogAuditoriaServiceImpl {

	private LogAuditoriaRepository logAuditoriaRepository;

	public LogAuditoriaServiceImpl(LogAuditoriaRepository logAuditoriaRepository) {
		this.logAuditoriaRepository = logAuditoriaRepository;
	}

	public void save(LogAuditoria logAuditoria) {
		logAuditoriaRepository.save(logAuditoria);
		
	}

}
