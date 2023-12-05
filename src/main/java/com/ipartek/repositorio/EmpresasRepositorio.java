package com.ipartek.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ipartek.modelo.Empresa;

@Repository
public interface EmpresasRepositorio extends JpaRepository<Empresa, Integer>{
	@Query(value = "SELECT * FROM empresas",nativeQuery = true)
	List<Empresa> obtenerTodasEmpresas();
}


