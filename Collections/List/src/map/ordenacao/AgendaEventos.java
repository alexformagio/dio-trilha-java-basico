package map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
	private Map<LocalDate, Evento> eventos;

	public AgendaEventos() {
		super();
	    this.eventos = new HashMap<LocalDate, Evento>();	
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
	  eventos.put(data, new Evento(data, nome, atracao));	
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventos);
		for (Evento event : eventosOrdenados.values()) {
			System.out.println(event);
		}
	}// Exibe a agenda de eventos em ordem crescente de data.
	
	public void obterProximoEvento() {
		LocalDate hoje= LocalDate.now();
		Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventos);
		for (Map.Entry<LocalDate, Evento> entry : eventosOrdenados.entrySet()) {
			LocalDate data = entry.getKey();
			Evento evento = entry.getValue();
			if(data.equals(hoje) || data.isAfter(hoje)) {
				System.out.println("O próximo evento ocorrerá " + data + ", detalhes do evento: " + evento);
				break;
			}
		}
		
	}	// Retorna o próximo evento que ocorrerá.
	
	
    public static void main(String[] args) {
		AgendaEventos agenda  = new AgendaEventos();
		agenda.adicionarEvento(LocalDate.of(2024, 10,1), "KnotFest", "Slipknot");
		agenda.adicionarEvento(LocalDate.of(2025, 1,1), "Reveion Santos", " Chali brow cover");
		agenda.adicionarEvento(LocalDate.of(2023, 1,1), "Reveion Copacabana", "Ivete Sangalo");
		agenda.adicionarEvento(LocalDate.of(2024, 1,1), "Reveion Copacabana", "Zeca Pagodinho");
		System.out.println("############    Exibir em ordem cronologica    #########");
        agenda.exibirAgenda();
        System.out.println("############    Exibir Próximo evento    #########");
        agenda.obterProximoEvento();
		
	}
}
