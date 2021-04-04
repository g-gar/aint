package com.ggar.aint.entities.common.event;

public abstract class AbstractEvent<D extends EventData, T extends EventType> implements Event<D,T> {

	protected final D data;
	protected final T type;
	protected final EventPriority priority;
	protected final Long timestamp;

	protected AbstractEvent(D data, T type, EventPriority priority) {
		this.data = data;
		this.type = type;
		this.priority = priority;
		this.timestamp = System.currentTimeMillis();
	}

	@Override
	public D getData() {
		return data;
	}

	@Override
	public T getType() {
		return type;
	}

	@Override
	public EventPriority getPriority() {
		return priority;
	}

	@Override
	public Long getTimestamp() {
		return timestamp;
	}
}
