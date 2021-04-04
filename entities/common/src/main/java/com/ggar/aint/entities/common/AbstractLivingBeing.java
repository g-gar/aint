package com.ggar.aint.entities.common;

import com.ggar.aint.entities.common.capabilities.Capability;

import java.util.Collection;
import java.util.Map;

public abstract class AbstractLivingBeing implements LivingBeing {

	protected Long birthTimestamp;
	protected Long deathTimestamp;

	protected final Collection<Capability> capabilities;
	protected final Collection<System> systems;

	public AbstractLivingBeing(Collection<Capability> capabilities, Collection<System> systems) {
		this.capabilities = capabilities;
		this.systems = systems;
		this.birthTimestamp = java.lang.System.currentTimeMillis();
	}

	@Override
	public Long getAge() {
		return java.lang.System.currentTimeMillis() - birthTimestamp;
	}

	@Override
	public Long getDeathTimestamp() {
		return deathTimestamp;
	}

	@Override
	public System getSystem(Class<System> identifier) throws NullPointerException {
		return systems.stream()
			.filter(system -> identifier.isAssignableFrom(system.getClass()))
			.findAny()
			.orElseThrow(NullPointerException::new);
	}
}
