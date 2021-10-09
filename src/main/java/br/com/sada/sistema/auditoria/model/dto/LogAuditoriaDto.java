package br.com.sada.sistema.auditoria.model.dto;

import java.time.LocalDate;

import br.com.sada.sistema.auditoria.model.LogAuditoria;

public class LogAuditoriaDto {

	private LocalDate data;
	private String acao;
	private int usuarioId;

	public LogAuditoriaDto(String acao, int usuarioId) {
		this.data = LocalDate.now();
		this.acao = acao;
		this.usuarioId = usuarioId;
	}

	public LogAuditoriaDto() {
	}

	public LocalDate getData() {
		return data;
	}

	public String getAcao() {
		return acao;
	}

	public int getUsuarioId() {
		return usuarioId;
	}

	public LogAuditoria toLogAuditoria() {
		return new LogAuditoria(data, acao, usuarioId);
	}
	
}
