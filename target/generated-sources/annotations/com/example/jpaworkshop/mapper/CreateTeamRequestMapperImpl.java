package com.example.jpaworkshop.mapper;

import com.example.jpaworkshop.dto.team.CreateTeamRequest;
import com.example.jpaworkshop.entity.Team;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-13T19:55:08+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class CreateTeamRequestMapperImpl implements CreateTeamRequestMapper {

    @Override
    public Team map(CreateTeamRequest request) {
        if ( request == null ) {
            return null;
        }

        Team team = new Team();

        team.setName( request.name() );
        team.setCountry( request.country() );
        team.setRating( request.rating() );

        return team;
    }
}
