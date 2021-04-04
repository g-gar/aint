package com.ggar.aint.entities.ant;

import com.ggar.aint.entities.ant.capabilities.*;
import com.ggar.aint.entities.ant.systems.CirculatorySystem;
import com.ggar.aint.entities.ant.systems.DigestiveSystem;
import com.ggar.aint.entities.ant.systems.NervousSystem;
import com.ggar.aint.entities.ant.systems.ThreadedSystem;
import com.ggar.aint.entities.common.AbstractLivingBeing;
import com.ggar.aint.entities.common.capabilities.Capability;
import com.ggar.aint.entities.ant.types.LifeCycleStage;
import com.ggar.aint.entities.ant.types.Job;
import com.ggar.aint.entities.common.System;
import com.ggar.aint.entities.common.chemical.Hydrocarbon;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public abstract class Ant extends AbstractLivingBeing {

	protected LifeCycleStage lifeCycleStage;
	protected Job job;
	protected Hydrocarbon individualSignature;

	public Ant(Collection<Capability> capabilities, CirculatorySystem circulatorySystem, NervousSystem nervousSystem, DigestiveSystem digestiveSystem) {
		super(capabilities, Arrays.asList(circulatorySystem, nervousSystem, digestiveSystem));
		systems.forEach(system -> ((ThreadedSystem)system).start());
	}

	public Hydrocarbon getIndividualSignature() {
		return this.individualSignature;
	}

}
