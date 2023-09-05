package com.sun.board.dto.response.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.sun.board.common.response.ResponseCode;
import com.sun.board.common.response.ResponseMessage;
import com.sun.board.dto.response.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PatchUserProfileResponseDto extends ResponseDto {
	
	private PatchUserProfileResponseDto(String code, String message) {
		super(code, message);
	}

	public static ResponseEntity<PatchUserProfileResponseDto> success() {
		PatchUserProfileResponseDto result = new PatchUserProfileResponseDto(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}

	public static ResponseEntity<ResponseDto> NoExistedUser() {
		ResponseDto result = new ResponseDto(ResponseCode.No_EXISTED_USER, ResponseMessage.No_EXISTED_USER);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
	}
}