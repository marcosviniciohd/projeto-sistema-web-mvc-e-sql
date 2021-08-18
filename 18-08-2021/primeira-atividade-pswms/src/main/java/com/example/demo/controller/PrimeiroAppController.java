package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("numeros")
public class PrimeiroAppController {
	
	@RequestMapping("/aleatorios")
	public String numerosAleatorios(Model model) {
		int[] numeros = new int[6];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random()* 60) + 1;
			model.addAttribute("numero", numeros );
		}
		return "numeros-aleatorios";
	}
	

}
