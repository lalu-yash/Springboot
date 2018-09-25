package com.yash.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.model.UserDetail;
@Repository
public interface UserDetailRepository extends JpaRepository<UserDetail, Integer> {

}
