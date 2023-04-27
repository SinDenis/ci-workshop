package com.example.jpaworkshop.mapper;

import com.example.jpaworkshop.dto.team.GetEnrichedTeamResponse;
import com.example.jpaworkshop.entity.Player;
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
public class GetEnrichedTeamResponseMapperImpl implements GetEnrichedTeamResponseMapper {

    @Override
    public List<GetEnrichedTeamResponse> map(List<Team> teams) {
        if ( teams == null ) {
            return null;
        }

        List<GetEnrichedTeamResponse> list = new ArrayList<GetEnrichedTeamResponse>( teams.size() );
        for ( Team team : teams ) {
            list.add( map( team ) );
        }

        return list;
    }

    @Override
    public GetEnrichedTeamResponse map(Team team) {
        if ( team == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String country = null;
        int rating = 0;
        List<String> players = null;

        id = team.getId();
        name = team.getName();
        country = team.getCountry();
        rating = team.getRating();
        players = playerListToStringList( team.getPlayers() );

        GetEnrichedTeamResponse getEnrichedTeamResponse = new GetEnrichedTeamResponse( id, name, country, rating, players );

        return getEnrichedTeamResponse;
    }

    protected List<String> playerListToStringList(List<Player> list) {
        if ( list == null ) {
            return null;
        }

        List<String> list1 = new ArrayList<String>( list.size() );
        for ( Player player : list ) {
            list1.add( map( player ) );
        }

        return list1;
    }
}
