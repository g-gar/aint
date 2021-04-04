package com.ggar.aint.entities.ant.systems;

import com.ggar.aint.entities.common.LivingBeing;
import com.ggar.aint.entities.common.System;
import com.ggar.aint.entities.common.event.Event;

public abstract class ThreadedSystem<T extends LivingBeing> extends Thread implements System {

	protected final T entity;

	protected ThreadedSystem(T entity) {
		this.entity = entity;
	}

	@Override
	public synchronized void fireEvent(Event event) {
		entity.acceptEvent(event);
	}

	public T getEntity() {
		return entity;
	}
}
