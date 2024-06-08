package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descção do Curso Java");
		curso1.setCargaHoraria(10);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descção do Curso JavaScript");
		curso2.setCargaHoraria(20);
		
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());
        
        
        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);
        
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev alexandre = new Dev();
        alexandre.setNome("Alexandre Formagio");
        alexandre.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + alexandre.getNome() + " : " + alexandre.getConteudoInscrito());
        alexandre.progredir();
        alexandre.progredir();
        alexandre.progredir();
        System.out.println("Conteúdos inscritos " + alexandre.getNome() + " : " + alexandre.getConteudoInscrito());
        System.out.println("Conteúdos concluido " + alexandre.getNome() + " : " + alexandre.getConteudoConcluido());
        System.out.println("XP: " + alexandre.calcularXP());
        
        Dev henrique = new Dev();
        henrique.setNome("Henrique Rocha");
        henrique.inscreverBootcamp(bootcamp);
        henrique.progredir();
        System.out.println("Conteúdos inscritos " + henrique.getNome() + " : " + henrique.getConteudoInscrito());
        System.out.println("Conteúdos concluido " + henrique.getNome() + " : " + henrique.getConteudoConcluido());
        System.out.println("XP: " + henrique.calcularXP());
        
        
        
        
        
        
		
		
	}

}
