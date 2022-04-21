package com.robot.apocalypse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robot.apocalypse.entity.Survivor;

@Repository
public interface SurvivorRepository extends JpaRepository<Survivor, Long> {
}
