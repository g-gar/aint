package com.ggar.aint.entities.ant.systems;

import com.ggar.aint.core.entities.Edible;
import com.ggar.aint.entities.common.System;

public interface DigestiveSystem extends System {

	Double getCropSpareSpace();

	Double getStomachSpareSpace();

	/**
	 *
	 * @param edible
	 * @return the resultant energy after processing an Edible
	 */
	Long ingest(Edible edible);

	/**
	 *
	 * @return true if it's storing an Edible in the crop stomach
	 */
	Boolean canRegurgitate();

	/**
	 *
	 * @return an Edible object stored in the crop stomach, if any
	 */
	Edible regurgitate();

	/**
	 *
	 * @return true if contains residues from the digestion process
	 */
	Boolean hasResidues();

	/**
	 *
	 * @return a percentage of the hind gut's unnocuppied space
	 */
	Double getHindGutSpareSpace();

	/**
	 *
	 * @return an Edible object symbolizing the residues from the digestion process
	 */
	Edible ejectResidues();
}
