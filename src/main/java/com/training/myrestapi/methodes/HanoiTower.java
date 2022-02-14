package com.training.myrestapi.methodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import org.springframework.http.ResponseEntity;

import com.training.myrestapi.entities.HanoiTowerEntity;
import com.training.myrestapi.entities.MoveHanoiEntity;

public class HanoiTower {
	
	/**
	 * 
	 * @param <E>
	 * @param nbDisk
	 * @param Start
	 * @param Middle
	 * @param End  
	 * @param ResponseEntity 
	 * @return nbShift
	 */
	public static List<HanoiTowerEntity> stepShift(int nbDisk, String start, String end , String middle) {
		
		List<HanoiTowerEntity> strList = new ArrayList<HanoiTowerEntity>();
		
		if (nbDisk >= 1) {
			strList = stepShift(nbDisk - 1, start, middle, end);
			System.out.println("Disk " + nbDisk + " from " + start + " to " + end);
			strList = stepShift(nbDisk - 1, middle, end, start);
		}
		
		return strList;
	}
	
	public static int nbShift(int nbDisk, String start, String end , String middle) {
		int nbShift = 0;
		
		if (nbDisk >= 1) {
			nbShift += nbShift(nbDisk - 1, start, middle, end);
			nbShift += 1;
			nbShift += nbShift(nbDisk - 1, middle, end, start);
		 }
		
		System.out.println("Shift number : " + nbShift);
		
		return nbShift;
	}
}
