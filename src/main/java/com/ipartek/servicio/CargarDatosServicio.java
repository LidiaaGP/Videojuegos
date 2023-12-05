package com.ipartek.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ipartek.modelo.Empresa;
import com.ipartek.modelo.Estilo;
import com.ipartek.repositorio.EmpresasRepositorio;
import com.ipartek.repositorio.EstilosRepositorio;

import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;

@Service
public class CargarDatosServicio {

	@Autowired
	private EmpresasRepositorio empresasRepositorio;
	
	@Autowired
	private EstilosRepositorio estilosRepositorio;
	
	@PostConstruct
	@Transactional
	public void inicializarDatos() {
		
		empresasRepositorio.save(new Empresa(1, "Varias empresas"));
		empresasRepositorio.save(new Empresa(2, "Nintendo"));
		empresasRepositorio.save(new Empresa(3, "Xbox"));
		empresasRepositorio.save(new Empresa(4, "PlayStation"));
		
		estilosRepositorio.save(new Estilo(1, "Plataformas"));
		estilosRepositorio.save(new Estilo(2, "Aventura grafica"));
		estilosRepositorio.save(new Estilo(3, "Peleas"));
		estilosRepositorio.save(new Estilo(4, "JRPG"));
		estilosRepositorio.save(new Estilo(5, "Granjas"));
	}
}
