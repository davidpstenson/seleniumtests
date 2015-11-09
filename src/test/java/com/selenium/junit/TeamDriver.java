package com.selenium.junit;

/**
 * Created by David on 21/04/2015.
 */
public class TeamDriver
{
    public static void main(String[] args)
    {
        footyTeam t = new footyTeam();

        t.addPlayer("David Stenson");
        t.addPlayer("Simon Ward");
        t.addPlayer("Dave Coffey");
        t.addPlayer("Andy McLoughlin");
        t.addPlayer("Keith Moore");
        t.addPlayer("Paulo Coughlan");
        t.addPlayer("Cian McKeogh");

        System.out.println(t.toString());
    }




}
