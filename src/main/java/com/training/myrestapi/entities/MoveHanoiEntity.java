package com.training.myrestapi.entities;

public class MoveHanoiEntity {
	private String move;
	
	public MoveHanoiEntity() {
		
	}

	/**
	 * @param move
	 */
	public MoveHanoiEntity(String move) {
		super();
		this.move = move;
	}

	/**
	 * @return the move
	 */
	public String getMove() {
		return move;
	}

	/**
	 * @param move the move to set
	 */
	public void setMove(String move) {
		this.move = move;
	}
	
	
}
