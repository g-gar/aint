package com.ggar.aint.actor;

import java.util.Collection;
import java.util.concurrent.Future;

public interface LivingBeing extends Being, Alive, Edible {

	void sleep(Long milliseconds);
	void eat(Edible edible);
	Future<Collection<LivingBeing>> reproduce(LivingBeing mate);

}
