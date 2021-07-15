package com.crowsoft.jornadatrabalho.service;

import com.crowsoft.jornadatrabalho.model.JornadaTrabalho;
import com.crowsoft.jornadatrabalho.repository.JornadaRepository;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@NoArgsConstructor
public class JornadaService {

    public JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho cadastrar(JornadaTrabalho jornadaTrabalho) {

        return jornadaRepository.save(jornadaTrabalho);
    }

    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho) {
        return jornadaRepository.save(jornadaTrabalho);

    }

    public List<JornadaTrabalho> list() {
        return jornadaRepository.findAll();
    }

    public JornadaTrabalho findOne(Long id) throws Exception {
        return jornadaRepository.findById(id).orElseThrow(() -> new Exception("Jornada não encontrada no banco de dados"));
    }

    public String delete(Long id) throws Exception {

        jornadaRepository.deleteById(id);
        return id + " foi deletado com sucesso!";
    }

    public List<JornadaTrabalho> listAll() {
        return jornadaRepository.findAll();
    }
}
