package br.com.sada.sistema.auditoria.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class LogAuditoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate data;
	private String acao;
	private Integer userId;
	
	public LogAuditoria(LocalDate data, String acao, Integer userId) {
		super();
		this.data = data;
		this.acao = acao;
		this.userId = userId;
	}

	public Long getId() {
		return id;
	}

	public LocalDate getData() {
		return data;
	}

	public String getAcao() {
		return acao;
	}

	public Integer getUserId() {
		return userId;
	}
}
