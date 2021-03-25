package com.ggar.aint.entity;

public interface LivingBeing<T extends LivingBeing, O extends LivingBeing> extends Entity, Alive, Reproductible<T,O>, Edible {

	void sleep(Long milliseconds);
	void eat(Edible edible);

}
