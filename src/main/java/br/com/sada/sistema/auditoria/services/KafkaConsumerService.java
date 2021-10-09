package br.com.sada.sistema.auditoria.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import br.com.sada.sistema.auditoria.model.dto.LogAuditoriaDto;

@Service
public class KafkaConsumerService {

	private LogAuditoriaServiceImpl logAuditoriaServiceImpl;

	public KafkaConsumerService(LogAuditoriaServiceImpl logAuditoriaServiceImpl) {
		this.logAuditoriaServiceImpl = logAuditoriaServiceImpl;
	}

	@KafkaListener(topics = "AUDIT_LOG_TOPIC3", groupId = "group-id")
	public void consume(LogAuditoriaDto logAuditoriaDto) {
		logAuditoriaServiceImpl.save(logAuditoriaDto.toLogAuditoria());
	}

}
