package com.mgs.funcionario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mgs.funcionario.models.Funcionario;
import com.mgs.funcionario.servicos.FuncionarioServico;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioServico funcionarioServico;

    @GetMapping
    public List<Funcionario> getAllFuncionarios() {
        return funcionarioServico.getAllFuncionarios();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> getFuncionarioById(@PathVariable Long id) {
        return funcionarioServico.getFuncionarioById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Funcionario createFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioServico.saveFuncionario(funcionario);
        
    }
    @PutMapping("/{id}")
    public ResponseEntity<Funcionario> updateFuncionario(@PathVariable Long id, @RequestBody Funcionario funcionarioDetails) {
        return funcionarioServico.getFuncionarioById(id)
                .map(funcionario -> {
                    funcionario.setNome(funcionarioDetails.getNome());
                    funcionario.setTelefone(funcionarioDetails.getTelefone());
                    funcionario.setEmail(funcionarioDetails.getEmail());
                    funcionario.setAlergia(funcionarioDetails.getAlergia());
                    funcionario.setProblemaMedicos(funcionarioDetails.getProblemaMedicos());
                    funcionario.setContatoEmergencia(funcionarioDetails.getContatoEmergencia());
                    Funcionario updatedFuncionario = funcionarioServico.saveFuncionario(funcionario);
                    return ResponseEntity.ok(updatedFuncionario);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteFuncionario(@PathVariable Long id) {
        return funcionarioServico.getFuncionarioById(id)
                .map(funcionario -> {
                    funcionarioServico.deleteFuncionario(id);
                    return ResponseEntity.noContent().build();
                })
                .orElse(ResponseEntity.notFound().build());

    }
}