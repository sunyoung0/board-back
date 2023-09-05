package com.sun.board.dto.response.board;

import java.util.ArrayList;
import java.util.List;

import com.sun.board.entity.BoardViewEntity;
import com.sun.board.entity.resultSet.BoardListResultSet;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BoardListResponseDto {
	private int boardNumber;
	private String title;
	private String contents;
	private String ImageUrl;
	private int viewCount;
	private int commentCount;
	private int favoriteCount;
	private String writeDatetime;
	private String writerProfileImage;
	private String writerNickname;

	public BoardListResponseDto (BoardListResultSet resultSet) {
		this.boardNumber = resultSet.getBoardNumber();
		this.title = resultSet.getTitle();
		this.contents = resultSet.getContents();
		this.ImageUrl = resultSet.getImageUrl();
	 	this.viewCount = resultSet.getViewCount();
		this.commentCount = resultSet.getCommentCount();
		this.favoriteCount = resultSet.getFavoriteCount();
		this.writeDatetime = resultSet.getWriteDatetime();
		this.writerProfileImage = resultSet.getWriterProfileImage();
		this.writerNickname = resultSet.getWriterNickname();
	}

	public BoardListResponseDto (BoardViewEntity boardViewEntity) {
		this.boardNumber = boardViewEntity.getBoardNumber();
		this.title = boardViewEntity.getTitle();
		this.contents = boardViewEntity.getContents();
		this.ImageUrl = boardViewEntity.getImageUrl();
	 	this.viewCount = boardViewEntity.getViewCount();
		this.commentCount = boardViewEntity.getCommentCount();
		this.favoriteCount = boardViewEntity.getFavoriteCount();
		this.writeDatetime = boardViewEntity.getWriteDatetime();
		this.writerProfileImage = boardViewEntity.getWriterProfileImage();
		this.writerNickname = boardViewEntity.getWriterNickname();
	}

	// resultSets를 반복 돌면서 BoardListResponseDto 인스턴스로 바꾼 다음에 새로운 리스트로 반환 하는 작업 (GetCurrentBoard 작업)
	public static List<BoardListResponseDto> copyList(List<BoardListResultSet> resultSets) {
		List<BoardListResponseDto> boardList = new ArrayList<>();

		for (BoardListResultSet resultSet : resultSets) {
			BoardListResponseDto board = new BoardListResponseDto(resultSet);
			boardList.add(board);
		}

		return boardList;
	}

	public static List<BoardListResponseDto> copyEntityList(List<BoardViewEntity> boardViewEntities) {
		List<BoardListResponseDto> boardList = new ArrayList<>();

		for (BoardViewEntity entity : boardViewEntities) {
			BoardListResponseDto board = new BoardListResponseDto(entity);
			boardList.add(board);
		}

		return boardList;
	}
}
