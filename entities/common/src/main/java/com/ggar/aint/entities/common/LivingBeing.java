package com.ggar.aint.entities.common;

import com.ggar.aint.core.entities.Alive;
import com.ggar.aint.core.entities.Edible;
import com.ggar.aint.core.entities.Entity;
import com.ggar.aint.entities.common.event.Event;
import com.ggar.aint.entities.common.types.PhysicalComponentType;
import com.ggar.aint.entities.common.types.SensorType;

import java.util.Map;

public interface LivingBeing extends Entity, Runnable, Alive, Edible {

	Long getAge();
	Long getDeathTimestamp();
	void acceptEvent(Event event);

	System getSystem(Class<System> identifier) throws NullPointerException;
}
