package com.ggar.aint.entities.common;

import com.ggar.aint.entities.common.event.Event;

public interface System extends Runnable {

	void fireEvent(Event event);

}
