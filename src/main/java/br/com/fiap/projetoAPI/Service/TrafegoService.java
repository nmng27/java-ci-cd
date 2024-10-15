package br.com.fiap.projetoAPI.Service;

import br.com.fiap.projetoAPI.DTO.TrafegoDTO;
import br.com.fiap.projetoAPI.Model.Trafego;
import br.com.fiap.projetoAPI.Repository.TrafegoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class TrafegoService {
    @Autowired
    private TrafegoRepository trafegoRepository;

    @Transactional
    public void cadastrarTrafego(TrafegoDTO json) {
        trafegoRepository.save(new Trafego(json));
    }

    @Transactional
    public List<Trafego> listarDadosTrafego() {
        return trafegoRepository.findAll();
    }

    @Transactional
    public Optional<Trafego> buscar(Integer id) {
        return trafegoRepository.findById(id);
    }

    @Transactional
    public void deletar(Integer id) {
        trafegoRepository.deleteById(id);

    }
    public Trafego atualizar(Integer id,TrafegoDTO trafegoDTO){
        Trafego trafego = trafegoRepository.findById(id).get();
        trafego.setHora(trafegoDTO.hora());
        trafego.setVolume(trafegoDTO.volume());
        trafego.setSituacao(trafegoDTO.situacao());
        return trafego;
    }


}




















