package com.example.Registration.repo;

import com.example.Registration.entity.Block;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocksRepo extends JpaRepository<Block, Long> {
}
