import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//testando
		Curso nomeCurso = new Curso();
		
		Mentoria mentoriaJava = new Mentoria();
		
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
		
		
		


		
	}

}
