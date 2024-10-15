package br.com.fiap.projetoAPI.Controller;

import br.com.fiap.projetoAPI.DTO.TrafegoDTO;
import br.com.fiap.projetoAPI.Model.Trafego;
import br.com.fiap.projetoAPI.Repository.TrafegoRepository;
import br.com.fiap.projetoAPI.Service.TrafegoService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("trafego")
public class TrafegoController {
    @Autowired
    private TrafegoService trafegoService;

    @PostMapping
    @Transactional
    public ResponseEntity<String> Cadastrar(@RequestBody  TrafegoDTO json){
        trafegoService.cadastrarTrafego(json);
        return ResponseEntity.ok("Usuario Cadastrado com sucesso");

    }

    @GetMapping("listar")
    @Transactional
    public ResponseEntity<List<Trafego>> Listar(){
        List<Trafego> trafegos = trafegoService.listarDadosTrafego();
        return ResponseEntity.ok(trafegos);
    }
    @GetMapping("buscar/{id}")
    public ResponseEntity<Optional<Trafego>> buscar(@PathVariable Integer id){
        Optional<Trafego> optionalTrafego = trafegoService.buscar(id);
        return ResponseEntity.ok(optionalTrafego);
    }

    @DeleteMapping("{id}")
    @Transactional
    public ResponseEntity<String> deletar(@PathVariable Integer id){
        trafegoService.deletar(id);
        return ResponseEntity.ok("Usuario Excluido!");
    }

    @PutMapping
    @Transactional
    public ResponseEntity<String> atualizar(@RequestBody TrafegoDTO trafegoDTO){
        trafegoService.atualizar(trafegoDTO.id(),trafegoDTO);
        return ResponseEntity.ok("Dados alterados!");
    }







}
