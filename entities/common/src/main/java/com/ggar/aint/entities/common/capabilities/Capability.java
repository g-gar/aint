package com.ggar.aint.entities.common.capabilities;

public interface Capability<T,R> {

	Boolean canExecute(T parameter);
	R execute(T parameter);

}
