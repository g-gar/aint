package com.ggar.aint.entities.common.event;

public interface Event<D extends EventData, T extends EventType> {

	D getData();
	T getType();
	EventPriority getPriority();
	Long getTimestamp();

}
