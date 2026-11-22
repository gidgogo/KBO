package com.dbapplication.kbo.domain.team.repository;

import com.dbapplication.kbo.domain.team.entity.Team;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {

    List<Team> findAllByOrderByIdAsc();
}
