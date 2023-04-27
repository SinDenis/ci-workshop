package com.example.jpaworkshop.mapper;

import com.example.jpaworkshop.dto.team.GetTeamResponse;
import com.example.jpaworkshop.entity.Team;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-13T19:55:08+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class GetTeamResponseMapperImpl implements GetTeamResponseMapper {

    @Override
    public GetTeamResponse map(Team team) {
        if ( team == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String country = null;
        int rating = 0;

        id = team.getId();
        name = team.getName();
        country = team.getCountry();
        rating = team.getRating();

        GetTeamResponse getTeamResponse = new GetTeamResponse( id, name, country, rating );

        return getTeamResponse;
    }

    @Override
    public List<GetTeamResponse> map(List<Team> teams) {
        if ( teams == null ) {
            return null;
        }

        List<GetTeamResponse> list = new ArrayList<GetTeamResponse>( teams.size() );
        for ( Team team : teams ) {
            list.add( map( team ) );
        }

        return list;
    }
}
