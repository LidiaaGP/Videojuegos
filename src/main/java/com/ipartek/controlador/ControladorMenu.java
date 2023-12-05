package com.ipartek.controlador;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ipartek.modelo.Empresa;
import com.ipartek.modelo.Estilo;
import com.ipartek.modelo.Juego;
import com.ipartek.repositorio.EmpresasRepositorio;
import com.ipartek.repositorio.EstilosRepositorio;
import com.ipartek.repositorio.JuegosRepositorio;


@Controller
public class ControladorMenu {
	
	@Autowired
	private JuegosRepositorio juegosrepositorio;
	
	@Autowired
	private EstilosRepositorio estilosRepositorio;
	
	@Autowired
	private EmpresasRepositorio empresasRepositorio;
	
	
	@RequestMapping("/")
	public String cargarInicio(Juego juego, Estilo estilo, Empresa empresa, Model model) {
		List<Juego> listajuegos=juegosrepositorio.obtenerTodosJuegos();
		System.out.println(listajuegos);
		model.addAttribute("juegos",listajuegos);
		
		List<Estilo> listaestilos=estilosRepositorio.obtenerTodosEstilos();
		System.out.println(listaestilos);
		model.addAttribute("estilos",listaestilos);
		
		List<Empresa> listaempresas=empresasRepositorio.obtenerTodasEmpresas();
		System.out.println(listaempresas);
		model.addAttribute("empresas",listaempresas);
		
		return "mostrar";
	}
	
	@RequestMapping("/mostrar")
	public String cargarMostrar(Juego juego, Empresa empresa, Model model) {
		List<Juego> listajuegos=juegosrepositorio.obtenerTodosJuegos();
		System.out.println(listajuegos);
		model.addAttribute("juegos",listajuegos);
		
		List<Estilo> listaestilos=estilosRepositorio.obtenerTodosEstilos();
		System.out.println(listaestilos);
		model.addAttribute("estilos",listaestilos);
		
		List<Empresa> listaempresas=empresasRepositorio.obtenerTodasEmpresas();
		System.out.println(listaempresas);
		model.addAttribute("empresas",listaempresas);
		
		return "mostrar";
	}
	

}
