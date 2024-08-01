package br.com.alura.screenmatch.frases.controller;

import br.com.alura.screenmatch.frases.dto.FrasesDTO;
import br.com.alura.screenmatch.frases.service.FrasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class FrasesController {
    @Autowired
    private FrasesService service;

    @GetMapping("/frases")
    public FrasesDTO obterFrases() {
        return service.frasesAleatorias();
    }
}
