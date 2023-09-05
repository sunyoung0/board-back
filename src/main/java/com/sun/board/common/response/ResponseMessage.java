package com.sun.board.common.response;

public interface ResponseMessage {

	//java8 부터는 기본으로 추가 되어있어서  public static final 생략하고 적어도 됨
	public static final String SUCCESS = "Success";

	public static final String VALIDATE_FAIL = "Validate Fail";

	public static final String EXISTED_EMAIL = "Existed Email";
	public static final String EXISTED_NICKNAME = "Existed Nickname";
	public static final String EXISTED_TEL_NUMBER = "Existed Tel Number";

	public static final String No_EXISTED_USER = "No Existed User";
	public static final String No_EXISTED_BOARD = "No Existed Board";
	
	public static final String No_EXISTED_PERMISSION = "No Permission";

	public static final String SIGN_IN_FAIL = "Sign In Data Mismatch";

	public static final String DATABASE_ERROR= "Database Error";

}