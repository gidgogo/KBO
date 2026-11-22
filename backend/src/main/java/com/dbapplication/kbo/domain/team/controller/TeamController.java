package com.dbapplication.kbo.domain.team.controller;

import com.dbapplication.kbo.domain.team.dto.TeamSummaryResponse;
import com.dbapplication.kbo.domain.team.service.TeamService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/teams")
@RequiredArgsConstructor
public class TeamController {

    private final TeamService teamService;

    @GetMapping
    public List<TeamSummaryResponse> getTeams() {
        return teamService.getTeams();
    }
}
