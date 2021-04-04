package com.ggar.aint.entities.ant.systems;

import com.ggar.aint.entities.ant.Ant;
import com.ggar.aint.entities.common.PhysicalComponent;
import com.ggar.aint.entities.common.chemical.Chemical;
import com.ggar.aint.entities.common.System;
import com.ggar.aint.entities.common.chemical.Hydrocarbon;
import com.ggar.aint.entities.common.types.ChemicalType;

import java.util.Collection;

public interface NervousSystem extends System {

	Boolean detectsVibration();
	Double getVibrationsAmount();
	Double getVibrationDirection();

	Boolean detectsAirCurrents();
	Double getAirCurrentAmount();
	Double getAirCurrentDirection();

	Boolean detectsLight();
	Double getLightAmount();

	Boolean detectsTemperatureDrop();
	Double getBodyTemperature();

	Boolean detectsChemicals(); //smell
	Collection<Chemical> getDetectedChemicals();
	Chemical createChemical(ChemicalType chemicaltype);

	Boolean isFamiliar(Ant ant);
	Boolean isFromColony(Ant ant);

}
