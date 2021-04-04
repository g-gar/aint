package com.ggar.aint.entities.ant.systems;

import com.ggar.aint.entities.common.LivingBeing;

public abstract class AbstractNervousSystem<T extends LivingBeing> extends ThreadedSystem<T> implements NervousSystem {
	protected AbstractNervousSystem(T entity) {
		super(entity);
	}
}
