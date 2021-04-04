package com.ggar.aint.entities.ant.fireant;

import com.ggar.aint.core.entities.Entity;
import com.ggar.aint.entities.ant.Ant;
import com.ggar.aint.entities.ant.systems.CirculatorySystem;
import com.ggar.aint.entities.ant.systems.DigestiveSystem;
import com.ggar.aint.entities.ant.systems.NervousSystem;
import com.ggar.aint.entities.common.capabilities.Capability;
import com.ggar.aint.entities.common.event.Event;

import java.util.Collection;

public class FireAnt extends Ant {

	public FireAnt(Collection<Capability> capabilities, CirculatorySystem circulatorySystem, NervousSystem nervousSystem, DigestiveSystem digestiveSystem) {
		super(capabilities, circulatorySystem, nervousSystem, digestiveSystem);
	}

	@Override
	public Long getAccumulatedSalt() {
		return null;
	}

	@Override
	public Long getAccumulatedMeat() {
		return null;
	}

	@Override
	public Long getAccumulatedWater() {
		return null;
	}

	@Override
	public void interact(Entity entity) {

	}

	@Override
	public void acceptEvent(Event event) {

	}

	@Override
	public void run() {

	}
}
