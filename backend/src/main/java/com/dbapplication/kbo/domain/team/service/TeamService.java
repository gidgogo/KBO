package com.dbapplication.kbo.domain.team.service;

import com.dbapplication.kbo.domain.team.dto.TeamSummaryResponse;
import com.dbapplication.kbo.domain.team.repository.TeamRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TeamService {

    private final TeamRepository teamRepository;

    /** 팀 필터(전체 팀 ▾)에 쓰는 10개 구단 목록. */
    public List<TeamSummaryResponse> getTeams() {
        return teamRepository.findAllByOrderByIdAsc().stream()
                .map(TeamSummaryResponse::from)
                .toList();
    }
}
