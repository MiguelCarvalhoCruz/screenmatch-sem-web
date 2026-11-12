package br.com.alura.screenmatch.model;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Episodio {

    private Integer temporada;
    private String titulo;
    private Integer numeroEp;
    private Double avaliacaoEp;
    private LocalDate dataLancamento;

    public Episodio(Integer numeroTemporada, DadosEpisodios dadosEpisodios){

        this.temporada = numeroTemporada;
        this.titulo = dadosEpisodios.titulo();
        this.numeroEp = dadosEpisodios.numeroEpisodio();

        try {

            this.avaliacaoEp = Double.valueOf(dadosEpisodios.avaliacaoEp());
        } catch (NumberFormatException ex) {
            this.avaliacaoEp = 0.0;
        }

        try {

            this.dataLancamento = LocalDate.parse(dadosEpisodios.dataLancamento());
        } catch (DateTimeParseException ex) {

            this.dataLancamento = null;
        }

    }

    public Integer getTemporada() {
        return temporada;
    }

    public void setTemporada(Integer temporada) {
        this.temporada = temporada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumeroEp() {
        return numeroEp;
    }

    public void setNumeroEp(Integer numeroEp) {
        this.numeroEp = numeroEp;
    }

    public Double getAvaliacaoEp() {
        return avaliacaoEp;
    }

    public void setAvaliacaoEp(Double avaliacaoEp) {
        this.avaliacaoEp = avaliacaoEp;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public String toString() {
        return "temporada=" + temporada +
                ", titulo='" + titulo + '\'' +
                ", numeroEp=" + numeroEp +
                ", avaliacaoEp=" + avaliacaoEp +
                ", dataLancamento=" + dataLancamento;
    }
}
