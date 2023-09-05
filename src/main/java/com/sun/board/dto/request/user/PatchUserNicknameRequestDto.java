package com.sun.board.dto.request.user;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PatchUserNicknameRequestDto {
	
	@NotBlank
	private String nickname;
}