package com.sun.board.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sun.board.entity.FavoriteEntity;
import com.sun.board.entity.pk.FavoritePk;

@Repository
public interface FavoriteRepository extends JpaRepository<FavoriteEntity, FavoritePk> {
	
	boolean existsByUserEmailAndBoardNumber(String userEmail, Integer boardNumber);

	@Transactional
	void deleteByBoardNumber(Integer boardNumber);

}
