package com.sun.board.dto.response.auth;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.sun.board.common.response.ResponseCode;
import com.sun.board.common.response.ResponseMessage;
import com.sun.board.dto.response.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SignInResponseDto extends ResponseDto {
	
	private String token;
	private int expiredTime;

	// AllArgsConstructor
	// private SignInResponseDto (String token) {
	// 	super(code, message);
	// }

	private SignInResponseDto (String code, String message, String token) {
		super(code, message);
		this.token = token;
		this.expiredTime = 3600 * 5;	// 5시간
	}

	// 인스턴스를 만들어주는 메서드
	public static ResponseEntity<SignInResponseDto> success(String token) {
		SignInResponseDto result = new SignInResponseDto(ResponseCode.SUCCESS, ResponseMessage.SUCCESS, token);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}

	public static ResponseEntity<ResponseDto> signInDataMismatch() {
		ResponseDto result = new ResponseDto(ResponseCode.SIGN_IN_FAIL, ResponseMessage.SIGN_IN_FAIL);
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(result);
	}
}