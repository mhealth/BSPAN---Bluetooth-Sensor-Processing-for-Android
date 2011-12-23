package com.t2;

/**
 * Static global constants for the Android Spine Server
 * @author scott.coleman
 *
 */
public class Constants {
	public static final String TAG = "BFDemo";
	public static final int RESERVED_ADDRESS_ZEPHYR = -15;   // 0xfff1
	public static final int RESERVED_ADDRESS_MINDSET = -14;  // 0xfff2
	public static final int RESERVED_ADDRESS_SHIMMER = -13;  // 0xfff3
	public static final int RESERVED_ADDRESS_ARDUINO = 1;
	
	
	public static final int DATA_TYPE_HEARTRATE = 1;
	public static final int DATA_TYPE_MEDITATION = 2;
	public static final int DATA_TYPE_ATTENTION = 3;
	public static final int DATA_SIGNAL_STRENGTH = 4;	
	public static final int DATA_ZEPHYR_BATTLEVEL = 5;	
	public static final int DATA_ZEPHYR_HEARTRATE = 6;	
	public static final int DATA_ZEPHYR_RESPRATE = 7;	
	public static final int DATA_ZEPHYR_SKINTEMP = 8;	

	public static final byte EXECODE_POOR_SIG_QUALITY = 2;
	public static final byte EXECODE_ATTENTION = 4;
	public static final byte EXECODE_MEDITATION = 5;
	public static final byte EXECODE_BLINK_STRENGTH = 0x16;
	public static final byte EXECODE_RAW_WAVE = (byte) 0x80;
	public static final byte EXECODE_SPECTRAL = (byte) 0x83;
	public static final byte EXECODE_RAW_ACCUM = (byte) 0x90;				// Special T2 code for gaterhing 1 second of raw data and sending it all together
	public static final int RAW_ACCUM_SIZE = 512;				// Size of raw wave data accumulator
	

	
}