package com.sun.board.dto.response.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.sun.board.common.response.ResponseCode;
import com.sun.board.common.response.ResponseMessage;
import com.sun.board.dto.response.ResponseDto;
import com.sun.board.entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GetUserResponseDto extends ResponseDto {
	private String email;
	private String nickname;
	private String profileImageUrl;

	private GetUserResponseDto(String code, String message, UserEntity userEntity) {
		super(code, message);
		this.email = userEntity.getEmail();
		this.nickname = userEntity.getNickname();
		this.profileImageUrl = userEntity.getProfileImageUrl();
	}

	public static ResponseEntity<GetUserResponseDto> success(UserEntity userEntity) {
		GetUserResponseDto result = new GetUserResponseDto(ResponseCode.SUCCESS,ResponseMessage.SUCCESS, userEntity);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}

	public static ResponseEntity<ResponseDto> noExistedUser() {
		ResponseDto result = new ResponseDto(ResponseCode.No_EXISTED_USER, ResponseMessage.No_EXISTED_USER);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
	}
}