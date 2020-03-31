package com.example.system.service;

import com.example.system.domain.Departamento;

import java.util.List;

public interface DepartamentoService {

     void salvar(Departamento departamento);
     void editar(Departamento departamento);
     void excluir(Long id);
     Departamento buscarPorId(Long id);
     List<Departamento> buscarTodos();

     boolean departamentoTemCargo(Long id);
}
