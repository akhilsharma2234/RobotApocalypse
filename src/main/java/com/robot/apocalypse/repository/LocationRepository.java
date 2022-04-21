package com.robot.apocalypse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robot.apocalypse.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}
