package com.ipartek.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.ipartek.modelo.Juego;

@Repository
public interface JuegosRepositorio extends JpaRepository<Juego, Integer>{
	@Query(value = "SELECT * FROM juegos",nativeQuery = true)
	List<Juego> obtenerTodosJuegos();
}
