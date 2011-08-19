package com.t2.compassionMeditation;

import java.io.Serializable;
import java.util.ArrayList;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class PreferenceData {

	public static final String USER_ID_FIELD_NAME = "preference";	
	
	
	// id is generated by the database and set on the object automagically
	@DatabaseField(generatedId = true)
	int id;	
	
	

	@DatabaseField(dataType=DataType.SERIALIZABLE)
	public ArrayList<Boolean> mBioHarnessParameters = new ArrayList<Boolean>();
	
	public PreferenceData() {
		// needed by ormlite
	}
	
	public PreferenceData(BioUser bioUser, long time) {
	}
	
}
