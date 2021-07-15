package com.crowsoft.jornadatrabalho.controller;

import com.crowsoft.jornadatrabalho.model.JornadaTrabalho;
import com.crowsoft.jornadatrabalho.service.JornadaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
@Api(value = "API REST JORNADA DE TRABALHO")
@CrossOrigin(origins = "*")
public class JornadaController {

    @Autowired
    private JornadaService jornadaService;

    @PostMapping
    public ResponseEntity<JornadaTrabalho> save(@RequestBody JornadaTrabalho jornadaTrabalho){

        return ResponseEntity.ok(jornadaService.cadastrar(jornadaTrabalho));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) throws Exception {
       return ResponseEntity.ok(jornadaService.delete(id));
    }

    @PutMapping
    public ResponseEntity<JornadaTrabalho> update(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return ResponseEntity.ok(jornadaService.update(jornadaTrabalho));
    }

    @GetMapping
    public ResponseEntity<List<JornadaTrabalho>> findAll(){
       return ResponseEntity.ok(jornadaService.listAll());
    }

    @GetMapping("/findJornada/{id}")
    public ResponseEntity<JornadaTrabalho> findJornada(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(jornadaService.findOne(id));
    }
}
