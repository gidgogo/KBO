package com.dbapplication.kbo.domain.team.dto;

import com.dbapplication.kbo.domain.team.entity.Team;

/** 목록·순위·경기 카드에 쓰는 팀 요약. */
public record TeamSummaryResponse(
        Long id,
        String code,
        String name,
        String shortName,
        String logoUrl
) {

    public static TeamSummaryResponse from(Team team) {
        return new TeamSummaryResponse(team.getId(), team.getCode(), team.getName(),
                team.getShortName(), team.getLogoUrl());
    }
}
