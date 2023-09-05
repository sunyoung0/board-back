package com.sun.board.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sun.board.entity.BoardViewEntity;

@Repository
public interface BoardViewRepository extends JpaRepository<BoardViewEntity, Integer> {
	BoardViewEntity findByBoardNumber(Integer BoardNumber);

	List<BoardViewEntity> findTop3ByOrderByFavoriteCountDesc();
	List<BoardViewEntity> findByTitleContainsOrContentsContainsOrderByWriteDatetimeDesc(String title, String contents);
	List<BoardViewEntity> findByWriterEmailOrderByWriteDatetimeDesc(String email);
}
