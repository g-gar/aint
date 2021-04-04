package com.ggar.aint.entities.common.event.common;

import com.ggar.aint.entities.common.event.AbstractEvent;
import com.ggar.aint.entities.common.event.EventData;
import com.ggar.aint.entities.common.event.EventPriority;
import com.ggar.aint.entities.common.event.EventType;

public class DeathEvent extends AbstractEvent<DeathEvent.DeathEventData, EventType> {

	protected DeathEvent(DeathEventData data, EventType type, EventPriority priority) {
		super(data, type, priority);
	}

	public class DeathEventData implements EventData {
		private final Long timestamp;
//		private final String cause;

		public DeathEventData(Long timestamp) {
			this.timestamp = timestamp;
		}

		public Long getTimestamp() {
			return timestamp;
		}
	}

}
