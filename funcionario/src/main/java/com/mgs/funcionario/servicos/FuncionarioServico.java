package com.mgs.funcionario.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgs.funcionario.models.Funcionario;
import com.mgs.funcionario.repositorios.FuncionarioRepository;

@Service
public class FuncionarioServico {
	
	@Autowired
    private FuncionarioRepository funcionarioRepository;

	public List<Funcionario> getAllFuncionarios() {
        return funcionarioRepository.findAll();
	}
	
	public Optional<Funcionario> getFuncionarioById(Long id) {
        return funcionarioRepository.findById(id);
	}
	
	public Funcionario saveFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }
	
	public void deleteFuncionario(Long id) {
		funcionarioRepository.deleteById(id);
    }

	public Funcionario saveEmployee(Funcionario funcionario) {
		return null;
	}

	
}