package com.ggar.aint.entities.ant.capabilities;

import com.ggar.aint.entities.common.exceptions.CantSleepException;

public interface SleepCapability {

	Boolean needsToSleep();

	/**
	 * Short method for the basic sleeping process (canSleep, acquireValidSleepState, repairBody, wakeUp)
	 * @return
	 */
	void sleep() throws CantSleepException;

	Boolean canSleep();

	void acquireValidSleepState() throws CantSleepException;

	/**
	 * Called only when the entity has acquired a valid sleep state
	 */
	void repairBody();

	void wakeUp();

	void wakeUpForcefully();

	Boolean isAsleep();
}
