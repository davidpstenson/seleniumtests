package com.selenium.junit;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by David on 21/04/2015.
 */
public class footyTeam {

    public String[] team;
    public int teamSize;



public footyTeam(){

    team = new String[9];
    int teamSize = 0;
}

public void addPlayer(String playerName) {

    if (teamSize < team.length) {
        team[teamSize] = playerName;
        teamSize++;
    }
}

public String toString(){

    String teamRoster = "Team Roster";
    int i = 0;
    while (i < teamSize)
    {
        teamRoster = teamRoster + team[i] + "\n";
        i++;
    }
    return teamRoster;
}

    @Test

    public void teamValueTest(String [] team )
    {

        Assert.assertEquals("Value of array position 0 = David Stenson", "David Stenson", team[0]);
    }
}




