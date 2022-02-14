package com.training.myrestapi.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.myrestapi.entities.HanoiTowerEntity;
import com.training.myrestapi.entities.MoveHanoiEntity;
import com.training.myrestapi.methodes.CalculatePI;
import com.training.myrestapi.methodes.HanoiTower;
import com.training.myrestapi.methodes.NombreComplexe;

import net.minidev.json.JSONObject;

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
	
	@GetMapping(value="/tour-hanoi/nbShift") 
	public ResponseEntity<Integer> calculStepHanoiTower(@RequestParam("nbDisk") int nbDisk) {
		
		int nbShift = HanoiTower.nbShift(nbDisk, "Right", "Left", "Middle");
		
		return ResponseEntity.ok().body(nbShift);
	}
	
	@GetMapping(value="/tour-hanoi/stepMove") 
	public List<HanoiTowerEntity> stepMoveHanoiTower(@RequestParam("nbDisk") int nbDisk) {
		
		HanoiTowerEntity hanoiTower = new HanoiTowerEntity();
		
		List<HanoiTowerEntity> hanoiTowerList  = new ArrayList<HanoiTowerEntity>();		

		hanoiTowerList.add(new HanoiTowerEntity(1, "A", "C"));
		hanoiTowerList.add(new HanoiTowerEntity(2, "A", "B"));
		hanoiTowerList.add(new HanoiTowerEntity(1, "C", "B"));
		hanoiTowerList.add(new HanoiTowerEntity(3, "A", "C"));
		hanoiTowerList.add(new HanoiTowerEntity(1, "B", "A"));
		hanoiTowerList.add(new HanoiTowerEntity(2, "B", "C"));
		hanoiTowerList.add(new HanoiTowerEntity(1, "A", "C"));
		 
		return hanoiTowerList;
	}
}
