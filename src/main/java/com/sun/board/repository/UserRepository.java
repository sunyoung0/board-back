package com.sun.board.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sun.board.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
  boolean existsByEmail(String email);
  boolean existsByNickname(String nickname);
  boolean existsByTelNumber(String telNumber);

  UserEntity findByEmail(String email);

  @Query(
    value = "SELECT * " +
            "FROM user " +
            "WHERE email IN ( " +
            "SELECT user_email " +
            "FROM favorite " +
            "WHERE board_number = ?1 " +
            ")", nativeQuery = true
  )
  List<UserEntity> getFavoriteList(Integer boardNumber);  // 첫번째 매개변수인 boardNumber가 ?1 자리에 들어감
}