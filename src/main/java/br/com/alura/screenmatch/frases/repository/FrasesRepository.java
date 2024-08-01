package br.com.alura.screenmatch.frases.repository;

import br.com.alura.screenmatch.frases.model.Frases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FrasesRepository extends JpaRepository<Frases, Long> {

    @Query("SELECT f FROM Frases f ORDER BY FUNCTION('RANDOM') LIMIT 1")
    Frases fraseAleatoria();
}
