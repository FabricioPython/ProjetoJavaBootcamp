import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		/*
		// TODO Auto-generated method stub
		
		//testando
		Curso nomeCurso = new Curso();
		
		Mentoria mentoriaJava = new Mentoria();
		
		Conteudo umCurso = new Curso();
		System.out.println(umCurso + " teste Pai para filha");
		
		System.out.println(nomeCurso);
		
		nomeCurso.setTitulo("java básico");
		nomeCurso.setDescricao("Elementos fundamentais da Sintaxe java e principais pacotes");
		nomeCurso.setCargaHoraria(200);
		
		
		System.out.println(nomeCurso);
		
		System.out.println("\n\n\n");
		
		System.out.println(mentoriaJava);
		
		mentoriaJava.setData(LocalDate.now());
		mentoriaJava.setDescricao("Estruturas de repetição e iterator.");
		mentoriaJava.setTitulo("Lopps e interações");
		System.out.println(mentoriaJava);
		 */
		
		String ms = "";
		
		// 
		
		Curso repeticaoJava = new Curso();
		repeticaoJava.setTitulo("Estruturas de repetição");
		repeticaoJava.setDescricao("aborda os principais loops da linguagem e iterator");
		repeticaoJava.setCargaHoraria(200);
		
		
		
		//
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Trabalhando com iterator");
		mentoria.setDescricao("Ganhando produtividade com iteradores.");
		mentoria.setData(LocalDate.now());
		
		
		
		
		//
		
		Bootcamp bootcampJava = new Bootcamp();
		bootcampJava.setNome("Java Básico");
		bootcampJava.setDesccricao("Boocamp voltado para desenvolvimento inicial na linguagem java. Aspectos fundamentais da linguagem");
		bootcampJava.getConteudos().add(repeticaoJava);
		bootcampJava.getConteudos().add(mentoria);
		
		ms = "Nome Bootcamp: " + bootcampJava.getNome() + " - Conteúdos:" + bootcampJava.getConteudos() ;
		System.out.println(ms);
		
		
		//
		System.out.println("\n\n");
		//


		
		
		
		//
		
		Dev fernanda = new Dev();
		fernanda.setNome("Fernanda Alves");
		
		
		fernanda.inscreverBottocamp(bootcampJava);
		
		ms = "Nome: " + fernanda.getNome() + " - Conteudos Inscritos: " + fernanda.getConteudosInscritos().size() + " - Concluídos: " + fernanda.getConteudosConcluidos().size() + " ";
		System.out.println(ms);
		System.out.println("XP: " + fernanda.calcularTotalXP());
		System.out.println("\n\n");

		
		fernanda.progredi();
		
		System.out.println(fernanda.getConteudosConcluidos() + " - concluidos / incritos - "  + fernanda.getConteudosInscritos());
		System.out.println("Xp: " + fernanda.calcularTotalXP());
		System.out.println("\n\n");

		
		fernanda.progredi();
		
		System.out.println(fernanda.getConteudosConcluidos() + " - concluidos / incritos - "  + fernanda.getConteudosInscritos());
		System.out.println("Xp: " + fernanda.calcularTotalXP());


		


		

		
		
		//
		System.out.println("\n\n");
		//
		
		Dev thiago = new Dev();
		thiago.setNome("thiago Meneses");
		ms = "Nome: " + thiago.getNome() + " - Conteudos Inscritos: " + thiago.getConteudosInscritos().size() + " - Concluídos: " + thiago.getConteudosConcluidos().size() + " ";
		System.out.println(ms);
		System.out.println("XP: " + thiago.calcularTotalXP());
		
		
		
		
		//
		
		System.out.println("\n\n");
		
		
		//
		
		
		
		
		
		
		
		
		
		


		
	}

}
