/*****************************************************************
SPINE - Signal Processing In-Node Environment is a framework that 
allows dynamic on node configuration for feature extraction and a 
OtA protocol for the management for WSN

Copyright (C) 2007 Telecom Italia S.p.A. 
 
GNU Lesser General Public License
 
This library is free software; you can redistribute
modify it under the terms of the sub-license (below).

*****************************************************************/

/*****************************************************************
BSPAN - BlueTooth Sensor Processing for Android is a framework 
that extends the SPINE framework to work on Android and the 
Android Bluetooth communication services.

Copyright (C) 2011 The National Center for Telehealth and 
Technology

Eclipse Public License 1.0 (EPL-1.0)

This library is free software; you can redistribute it and/or
modify it under the terms of the Eclipse Public License as
published by the Free Software Foundation, version 1.0 of the 
License.

The Eclipse Public License is a reciprocal license, under 
Section 3. REQUIREMENTS iv) states that source code for the 
Program is available from such Contributor, and informs licensees 
how to obtain it in a reasonable manner on or through a medium 
customarily used for software exchange.

Post your updates and modifications to our GitHub or email to 
t2@tee2.org.

This library is distributed WITHOUT ANY WARRANTY; without 
the implied warranty of MERCHANTABILITY or FITNESS FOR A 
PARTICULAR PURPOSE.  See the Eclipse Public License 1.0 (EPL-1.0)
for more details.
 
You should have received a copy of the Eclipse Public License
along with this library; if not, 
visit http://www.opensource.org/licenses/EPL-1.0

*****************************************************************/

package spine.datamodel;

import spine.SPINEFunctionConstants;
import spine.SPINESensorConstants;

public class AlarmData extends Data {
	
	private static final long serialVersionUID = 1L;
	
	private byte dataType;
	private byte sensorCode;
	private byte valueType;
	private byte alarmType;
	private int currentValue;
	

	/**
	 * Getter method of the function code
	 * @return the function code
	 */
	public byte getFunctionCode() {
		return functionCode;
	}
		
	/**
	 * Getter method of the data type
	 * @return the data type
	 */
	public byte getDataType() {
		return dataType;
	}	

	/**
	 * Getter method of the sensor code
	 * @return the sensor code
	 */
	public byte getSensorCode() {
		return sensorCode;
	}

	/**
	 * Getter method of the value type
	 * @return the value type
	 */
	public byte getValueType() {
		return valueType;
	}	
	
	/**
	 * Getter method of the alarm type
	 * @return the alarm type
	 */
	public byte getAlarmType() {
		return alarmType;
	}

	/**
	 * Getter method of the current value
	 * @return the current value
	 */
	public int getCurrentValue() {
		return currentValue;
	}
	
	/**
	 * 
	 * Returns a string representation of the Alarm object.
	 * 
	 */
	public String toString() {
		return "From node: {" + this.node.toShortString() + "} - " + SPINEFunctionConstants.ALARM_LABEL  + 
				" on " + SPINEFunctionConstants.functionalityCodeToString(SPINEFunctionConstants.FEATURE,this.dataType) + " on sensor " + SPINESensorConstants.sensorCodeToString(this.sensorCode) + 
				" VALUE " + this.currentValue ;
	}

	/**
	 * @param dataType the dataType to set
	 */
	public void setDataType(byte dataType) {
		this.dataType = dataType;
	}

	/**
	 * @param sensorCode the sensorCode to set
	 */
	public void setSensorCode(byte sensorCode) {
		this.sensorCode = sensorCode;
	}

	/**
	 * @param valueType the valueType to set
	 */
	public void setValueType(byte valueType) {
		this.valueType = valueType;
	}

	/**
	 * @param alarmType the alarmType to set
	 */
	public void setAlarmType(byte alarmType) {
		this.alarmType = alarmType;
	}

	/**
	 * @param currentValue the currentValue to set
	 */
	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}

}
