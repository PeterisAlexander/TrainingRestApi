package com.training.myrestapi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.myrestapi.methodes.CalculatePI;

@RestController
@RequestMapping("/api")
public class MonAPIController {
	
	@GetMapping(value="/pi") 
	public Double calculPi(@RequestParam("nombre") Integer nombre,@RequestParam("arrondi") Integer scale ) {
		
		return CalculatePI.calculingPi(nombre, scale);
	}
}
