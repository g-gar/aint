package com.ggar.aint.entities.ant.systems;

import com.ggar.aint.core.entities.Edible;
import com.ggar.aint.entities.common.PhysicalComponent;

public abstract class AbstractDigestiveSystem implements DigestiveSystem {

	private final PhysicalComponent mouth;
	private final PhysicalComponent pharynx;
//	esophagus
	private final PhysicalComponent crop;
	private final PhysicalComponent stomach;
	private final PhysicalComponent hindGut;
	private final PhysicalComponent anus;

//	esophagus transport speed
//	food processing rate/speed (awake vs asleep states)
//	food to feces transformation rate/speed

	public AbstractDigestiveSystem(PhysicalComponent mouth, PhysicalComponent pharynx, PhysicalComponent crop, PhysicalComponent stomach, PhysicalComponent hindGut, PhysicalComponent anus) {
		this.mouth = mouth;
		this.pharynx = pharynx;
		this.crop = crop;
		this.stomach = stomach;
		this.hindGut = hindGut;
		this.anus = anus;
	}
}
