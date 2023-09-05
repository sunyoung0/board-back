package com.sun.board.dto.response.board;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.sun.board.common.response.ResponseCode;
import com.sun.board.common.response.ResponseMessage;
import com.sun.board.dto.response.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PutFavoriteResponseDto extends ResponseDto{
	
	private PutFavoriteResponseDto(String code, String message) {
		super(code, message);
	}

	public static ResponseEntity<PutFavoriteResponseDto> success() {
		PutFavoriteResponseDto result = new PutFavoriteResponseDto(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}

	public static ResponseEntity<ResponseDto> noExistedUser() {
		ResponseDto result = new ResponseDto(ResponseCode.No_EXISTED_USER, ResponseMessage.No_EXISTED_USER);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
	}

	public static ResponseEntity<ResponseDto> noExistedBoard() {
		ResponseDto result = new ResponseDto(ResponseCode.No_EXISTED_BOARD, ResponseMessage.No_EXISTED_BOARD);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
	}
}