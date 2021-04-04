package com.ggar.aint.core.entities;

/**
 * Implemented by anything that contains cells
 */
public interface Edible extends Entity {

	Long getAccumulatedSalt();
	Long getAccumulatedMeat();
	Long getAccumulatedWater();

}
