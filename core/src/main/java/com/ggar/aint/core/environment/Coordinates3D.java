package com.ggar.aint.core.environment;

public class Coordinates3D extends Coordinates2D {

	protected final Integer z;

	public Coordinates3D(Integer x, Integer y, Integer z) {
		super(x, y);
		this.z = z;
	}

	public Integer getZ() {
		return z;
	}
}
