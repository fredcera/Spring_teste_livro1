package com.example.spring_teste_2.Controller;

import com.example.spring_teste_2.Entities.Propriedade;
import com.example.spring_teste_2.Repositories.PropriedadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PropriedadeController {

    @Autowired
    private PropriedadeRepository repository;

    @GetMapping("/find")
    List<Propriedade> findByFiltro (@RequestParam("filtro") String filtro){
        return repository.findByFiltro(filtro);
    }

}
