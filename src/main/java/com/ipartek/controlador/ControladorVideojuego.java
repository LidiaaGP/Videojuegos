package com.ipartek.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ipartek.modelo.Juego;
import com.ipartek.repositorio.EmpresasRepositorio;
import com.ipartek.repositorio.EstilosRepositorio;
import com.ipartek.repositorio.JuegosRepositorio;

@Controller
public class ControladorVideojuego {
	@Autowired
	private EstilosRepositorio estilosRepositorio;
	
	@Autowired
	private EmpresasRepositorio empresasRepositorio;
	
	@Autowired
	private JuegosRepositorio juegosrepositorio;
	
	@RequestMapping("/guardarJuego")
	public String agregarJuego(Juego juego)
	{
		juegosrepositorio.save(juego);
		
		return "redirect:mostrar";
	}
	
	@RequestMapping("/borrarJuego")
    public String borrarJuego(@RequestParam int id) {

		juegosrepositorio.deleteById(id);

        return "redirect:/mostrar";
    }
	
	@RequestMapping("/modificarJuego")
    public String modificarJuego(Model model, @RequestParam int id) {
		
		Optional<Juego> optionalJuego = juegosrepositorio.findById(id);

		if (optionalJuego.isPresent()) {
		Juego juego = optionalJuego.get();
		model.addAttribute("juego", juego);
		model.addAttribute("empresas", empresasRepositorio.findAll());
		model.addAttribute("estilos", estilosRepositorio.findAll());
		
		return "form_modificar";
		} 
		else {
			return "redirect:/error";
		}
	}
	
	@RequestMapping("/modificarReal")
    public String modificarJuegoReal(@ModelAttribute Juego juego, Model model) {
		
		System.out.println(juego);
		return "redirect:/mostrar";
	}
}
