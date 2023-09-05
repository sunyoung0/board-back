package com.sun.board.common.response;

public interface ResponseCode {

	public static final String SUCCESS = "SU";

	public static final String VALIDATE_FAIL = "VF";

	public static final String EXISTED_EMAIL = "EE";
	public static final String EXISTED_NICKNAME = "EN";
	public static final String EXISTED_TEL_NUMBER = "ET";

	public static final String No_EXISTED_USER = "NU";
	public static final String No_EXISTED_BOARD = "NB";
	
	public static final String No_EXISTED_PERMISSION = "NP";

	public static final String SIGN_IN_FAIL = "DM";

	public static final String DATABASE_ERROR= "DE";

}