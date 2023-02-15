package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	
	private String nome;
	
	
	private String desccricao;
	
	
	private final LocalDate dataInicial = LocalDate.now();
	
	
	private final LocalDate dataFinal = dataInicial.plusDays(45);
	
	
	private Set<Dev> devsInscritos = new HashSet<>();
	
	
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	
	

	public String getNome() {
		return nome;
	}
	

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public String getDesccricao() {
		return desccricao;
	}
	

	public void setDesccricao(String desccricao) {
		this.desccricao = desccricao;
	}
	

	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}
	

	public void setDevsInscritos(Set<Dev> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}
	

	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	

	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	

	public LocalDate getDataInicial() {
		return dataInicial;
	}
	

	public LocalDate getDataFinal() {
		return dataFinal;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataFinal, dataInicial, desccricao, devsInscritos, nome);
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataFinal, other.dataFinal)
				&& Objects.equals(dataInicial, other.dataInicial) && Objects.equals(desccricao, other.desccricao)
				&& Objects.equals(devsInscritos, other.devsInscritos) && Objects.equals(nome, other.nome);
	}
	

	@Override
	public String toString() {
		return "Bootcamp [nome = " + nome + ", desccricao = " + desccricao + ", dataInicial = " + dataInicial + ", dataFinal = "
				+ dataFinal + ", devsInscritos = " + devsInscritos + ", conteudos = " + conteudos + "]";
	}
	
	

}
