package main.java.map.Ordenacao;

import main.java.map.OperacoesBasicas.AgendaContatos;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    //atributo

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome,atracao);
        eventoMap.put(data,evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
//        Set<LocalDate> localDates = eventoMap.keySet();
//        Collection<Evento> values = eventoMap.values();
//        eventoMap.get();

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento + "acontecerá na data "+ proximaData);
                break;
            }
        }


    }



    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 8, 30), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JANUARY, 13), "Evento 3", "Atração 3");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
