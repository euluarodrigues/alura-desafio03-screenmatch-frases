package br.com.alura.screenmatch.frases.dto;

import jakarta.persistence.Column;

public record FrasesDTO(String titulo,
                        String frase,
                        String personagem,
                        String poster) {
}
