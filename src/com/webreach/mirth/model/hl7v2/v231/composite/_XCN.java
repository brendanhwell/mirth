package com.webreach.mirth.model.hl7v2.v231.composite;
import com.webreach.mirth.model.hl7v2.*;

public class _XCN extends Composite {
	public _XCN(){
		fields = new Class[]{_ST.class, _FN.class, _ST.class, _ST.class, _ST.class, _ST.class, _IS.class, _IS.class, _HD.class, _ID.class, _ST.class, _ID.class, _IS.class, _HD.class, _ID.class};
		repeats = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		required = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
		fieldDescriptions = new String[]{"ID Number (ST)", "Family Last Name", "Given Name", "Middle Initial or Name", "Suffix", "Prefix", "Degree", "Source Table", "Assigning Authority", "Name Type Code", "Identifier Check Digit", "Code Identifying the Check Digit Scheme Employed", "Identifier Type Code", "Assigning Facility", "Name Representation Code"};
		description = "Extended Composite ID Number and Name For Persons";
		name = "XCN";
	}
}
