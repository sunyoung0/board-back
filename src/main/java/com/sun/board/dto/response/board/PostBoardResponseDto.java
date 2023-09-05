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
public class PostBoardResponseDto extends ResponseDto {

	private PostBoardResponseDto (String code, String message) {
		super(code, message);
	}

	public static ResponseEntity<PostBoardResponseDto> success() {
		PostBoardResponseDto result = new PostBoardResponseDto(ResponseCode.SUCCESS,ResponseMessage.SUCCESS);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}

	public static ResponseEntity<ResponseDto> noExistedUser() {
		ResponseDto result = new ResponseDto(ResponseCode.No_EXISTED_USER, ResponseMessage.No_EXISTED_USER);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
	}
}