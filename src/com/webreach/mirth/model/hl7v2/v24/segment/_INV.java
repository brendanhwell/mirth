package com.webreach.mirth.model.hl7v2.v24.segment;
import com.webreach.mirth.model.hl7v2.v24.composite.*;
import com.webreach.mirth.model.hl7v2.*;

public class _INV extends Segment {
	public _INV(){
		fields = new Class[]{_CE.class, _CE.class, _CE.class, _CE.class, _CE.class, _CE.class, _NM.class, _NM.class, _NM.class, _NM.class, _CE.class, _TS.class, _TS.class, _TQ.class, _CE.class, _ST.class, _CE.class, _CE.class};
		repeats = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		required = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
		fieldDescriptions = new String[]{"Substance Identifier", "Substance Status", "Substance Type", "Inventory Container Identifier", "Container Carrier Identifier", "Position on Carrier", "Initial Quantity", "Current Quantity", "Available Quantity", "Consumption Quantity", "Quantity Units", "Expiration Date/Time", "First Used Date/Time", "On Board Stability Duration", "Test/Fluid Identifier(s)", "Manufacturer Lot Number", "Manufacturer Identifier", "Supplier Identifier"};
		description = "Inventory Detail";
		name = "INV";
	}
}
