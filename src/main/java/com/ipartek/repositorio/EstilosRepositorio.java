package com.ipartek.repositorio;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ipartek.modelo.Estilo;

@Repository
public interface EstilosRepositorio extends JpaRepository<Estilo, Integer>{
	@Query(value = "SELECT * FROM estilos",nativeQuery = true)
	List<Estilo> obtenerTodosEstilos();
}
