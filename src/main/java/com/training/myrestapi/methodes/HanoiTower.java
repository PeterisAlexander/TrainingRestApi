package com.training.myrestapi.methodes;

public class HanoiTower {
	
	/**
	 * 
	 * @param nbDisk
	 * @param Start
	 * @param Middle
	 * @param End
	 * @return nbShift
	 */
	public static int nbStepShift(int nbDisk, String Start, String Middle, String End ) {
		
		int nbShift = 0;
		
		if (nbDisk >= 1) {
			
			nbStepShift(nbDisk - 1, Start, Middle, End);
			System.out.println("Disk " + nbDisk + " from " + Start + " to " + End);
			nbStepShift(nbDisk - 1, Middle, End, Start);
			
			nbShift += nbStepShift(nbDisk - 1, Start, Middle, End);
			nbShift += 1;
			nbShift += nbStepShift(nbDisk - 1, Middle, End, Start);
		}
		
		return nbShift;
		
	}
}
