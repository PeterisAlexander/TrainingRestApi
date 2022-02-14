package com.training.myrestapi.entities;

public class HanoiTowerEntity {
	
	public int nbDisk;
	public String start; 
	public String middle; 
	public String end;
	
	/**
	 * @param nbDisk
	 * @param start
	 * @param middle
	 * @param end
	 */
	public HanoiTowerEntity(int nbDisk, String start, String middle, String end) {
//		super();
		this.nbDisk = nbDisk;
		this.start = start;
		this.middle = middle;
		this.end = end;
	}

	public HanoiTowerEntity(int nbDisk, String start, String end) {
		//super();
		this.nbDisk = nbDisk;
		this.start = start;
		this.end = end;
	}

	public HanoiTowerEntity() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the nbDisk
	 */
	public int getNbDisk() {
		return nbDisk;
	}

	/**
	 * @param nbDisk the nbDisk to set
	 */
	public void setNbDisk(int nbDisk) {
		this.nbDisk = nbDisk;
	}

	/**
	 * @return the start
	 */
	public String getStart() {
		return start;
	}

	/**
	 * @param start the start to set
	 */
	public void setStart(String start) {
		this.start = start;
	}

	/**
	 * @return the middle
	 */
//	public String getMiddle() {
//		return middle;
//	}

	/**
	 * @param middle the middle to set
	 */
//	public void setMiddle(String middle) {
//		this.middle = middle;
//	}

	/**
	 * @return the end
	 */
	public String getEnd() {
		return end;
	}

	/**
	 * @param end the end to set
	 */
	public void setEnd(String end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "HanoiTowerEntity [nbDisk=" + nbDisk + ", start=" + start + ", end=" + end + "]";
	}
	
	
	
	
}
