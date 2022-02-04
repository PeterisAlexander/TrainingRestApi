package com.training.myrestapi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.myrestapi.methodes.CalculatePI;
import com.training.myrestapi.methodes.HanoiTower;
import com.training.myrestapi.methodes.NombreComplexe;

@RestController
@RequestMapping("/api")
public class MonAPIController {
	
	@GetMapping(value="/pi") 
	public Double calculPi(
			@RequestParam("nombre") Integer nombre,
			@RequestParam("arrondi") Integer scale 
	) {
		
		return CalculatePI.calculingPi(nombre, scale);
	}
	
	@GetMapping(value="/complex") 
	public String calculNombreComplexe(
			@RequestParam("a") double a,
			@RequestParam("b") double b,
			@RequestParam("c") double c,
			@RequestParam("d") double d
	) {
		NombreComplexe c1 = new NombreComplexe(a, b);
		NombreComplexe c2 = new NombreComplexe(c, d);
		
		NombreComplexe c3;
		
        c3 = NombreComplexe.somme(c1, c2);
        

        String real =String.valueOf(c3.real);
        String imag =String.valueOf(c3.imag);
       

        return "La somme des deux nombres est : " + real +" + " +imag+"i";
	}
	
	@GetMapping(value="/tours-hanoi") 
	public String calculStepHanoiTower(@RequestParam("nbDisk") int nbDisk) {
		int nbShift = HanoiTower.nbStepShift(nbDisk, "Right", "Middle", "Left");
		return "Shift number : " + nbShift;  
	}
}
