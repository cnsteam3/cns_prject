package com.example.demo.repository;

import com.example.demo.entity.Board;
import com.example.demo.entity.Community;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunityRepository extends JpaRepository<Community, Integer> {
}
