package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	
	private String nome;
	
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	
	
	
	
	public  void inscreverBottocamp(Bootcamp bootcamp) {
		
		this.conteudosInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
				
	}
	
	
	
	public  void progredi() {
		
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		
		if (conteudo.isPresent()) {
			
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
			
		}
		
		else {
			
			System.err.println("Você não está matriculado em nunhum Conteúdo.");
			
		}
		
	}
	
	
	
	public double calcularTotalXP() {
		
		return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXP()).sum();
		
	}
	
	

	public String getNome() {
		return nome;
	}
	
	

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}
	
	

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}
	
	

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}
	
	

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}



	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInscritos, nome);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) && Objects.equals(nome, other.nome);
	}



	@Override
	public String toString() {
		return "Dev [nome = " + nome + ", conteudosInscritos = " + conteudosInscritos + ", conteudosConcluidos = "
				+ conteudosConcluidos + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
