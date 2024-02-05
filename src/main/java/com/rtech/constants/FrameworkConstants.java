package com.rtech.constants;


/**
 * * Framework Constants holds all the constant values used within the framework. If some value needs to be changed
 * or modified often, then it should be stored in the property files
 * 
 * 
 * 15-Dec-2022
 * @author Raktim Sarkar
 * @version 1.0
 * @since 1.0
 */

public final class FrameworkConstants {
	
	private FrameworkConstants()
	{
		
	}
	
	private static final String RESOURCESPATH = System.getProperty("user.dir")  + "/src/test/resources";
	private static final String EXCELPATH  = RESOURCESPATH + "/excel/bdd.xlsx"  ;

	

	public static String getExcelpath() {
		return EXCELPATH;
	}
	
}
