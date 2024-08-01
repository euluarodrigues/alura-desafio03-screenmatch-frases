package br.com.alura.screenmatch.frases.service;

import br.com.alura.screenmatch.frases.dto.FrasesDTO;
import br.com.alura.screenmatch.frases.model.Frases;
import br.com.alura.screenmatch.frases.repository.FrasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FrasesService {
    @Autowired
    private FrasesRepository repository;

    public FrasesDTO frasesAleatorias() {
        Frases f = repository.fraseAleatoria();
        return new FrasesDTO(f.getTitulo(), f.getFrase(), f.getPersonagem(), f.getPoster());
    }

}
