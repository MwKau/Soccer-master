package cs301.Soccer;

import android.util.Log;
import cs301.Soccer.soccerPlayer.SoccerPlayer;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * Soccer player database -- presently, all dummied up
 *
 * @author Zhi Chen
 * @version Mar 30
 *
 */
public class SoccerDatabase implements SoccerDB {
    private HashMap<String, SoccerPlayer> soccerMap = new HashMap<String, SoccerPlayer>();

    /**
     * add a player
     *
     * @see SoccerDB#addPlayer(String, String, int, String)
     */
    @Override
    public boolean addPlayer(String firstName, String lastName, int uniformNumber, String teamName) {
        // Finds the key
        String key = firstName + "##" + lastName;

        // Searches for existing player
        SoccerPlayer test = soccerMap.get(key);

        // If object doesn't exist, create a new object and insert into hashmap
        if (test == null) {
            SoccerPlayer player = new SoccerPlayer(firstName, lastName, uniformNumber,teamName);
            soccerMap.put(key, player);
            return true;
        } else {
            return false;
        }
    }

    /**
     * remove a player
     *
     * @see SoccerDB#removePlayer(String, String)
     */
    @Override
    public boolean removePlayer(String firstName, String lastName) {
        // Finds the key
        String key = firstName + "##" + lastName;

        // Searches for existing player
        SoccerPlayer test = soccerMap.get(key);

        // Removes the player
        if (test == null) {
            return false;
        } else {
            soccerMap.remove(key);
            return true;
        }
    }

    /**
     * look up a player
     *
     * @see SoccerDB#getPlayer(String, String)
     */
    @Override
    public SoccerPlayer getPlayer(String firstName, String lastName) {
        // Finds the key
        String key = firstName + "##" + lastName;

        // Returns the player
        return soccerMap.get(key);
    }

    /**
     * increment a player's goals
     *
     * @see SoccerDB#bumpGoals(String, String)
     */
    @Override
    public boolean bumpGoals(String firstName, String lastName) {
        return false;
    }

    /**
     * increment a player's assists
     *
     * @see SoccerDB#bumpAssists(String, String)
     */
    @Override
    public boolean bumpAssists(String firstName, String lastName) {
        // Finds the key
        String key = firstName + "##" + lastName;

        // Returns the player
        SoccerPlayer test = soccerMap.get(key);

        // Bump
        if (test == null) {
            return false;
        } else {
            test.bumpAssists();
            return true;
        }
    }

    /**
     * increment a player's shots
     *
     * @see SoccerDB#bumpShots(String, String)
     */
    @Override
    public boolean bumpShots(String firstName, String lastName) {
        // Finds the key
        String key = firstName + "##" + lastName;

        // Returns the player
        SoccerPlayer test = soccerMap.get(key);

        // Bump
        if (test == null) {
            return false;
        } else {
            test.bumpShots();
            return true;
        }
    }

    /**
     * increment a player's saves
     *
     * @see SoccerDB#bumpSaves(String, String)
     */
    @Override
    public boolean bumpSaves(String firstName, String lastName) {
        // Finds the key
        String key = firstName + "##" + lastName;

        // Returns the player
        SoccerPlayer test = soccerMap.get(key);

        // Bump
        if (test == null) {
            return false;
        } else {
            test.bumpSaves();
            return true;
        }
    }

    /**
     * increment a player's fouls
     *
     * @see SoccerDB#bumpFouls(String, String)
     */
    @Override
    public boolean bumpFouls(String firstName, String lastName) {
        // Finds the key
        String key = firstName + "##" + lastName;

        // Returns the player
        SoccerPlayer test = soccerMap.get(key);

        // Bump
        if (test == null) {
            return false;
        } else {
            test.bumpFouls();
            return true;
        }
    }

    /**
     * increment a player's yellow cards
     *
     * @see SoccerDB#bumpYellowCards(String, String)
     */
    @Override
    public boolean bumpYellowCards(String firstName, String lastName) {
        // Finds the key
        String key = firstName + "##" + lastName;

        // Returns the player
        SoccerPlayer test = soccerMap.get(key);

        // Bump
        if (test == null) {
            return false;
        } else {
            test.bumpYellowCards();
            return true;
        }
    }

    /**
     * increment a player's red cards
     *
     * @see SoccerDB#bumpRedCards(String, String)
     */
    @Override
    public boolean bumpRedCards(String firstName, String lastName) {
        // Finds the key
        String key = firstName + "##" + lastName;

        // Returns the player
        SoccerPlayer test = soccerMap.get(key);

        // Bump
        if (test == null) {
            return false;
        } else {
            test.bumpRedCards();
            return true;
        }
    }

    /**
     * tells the number of players on a given team
     *
     * @see SoccerDB#numPlayers(String)
     */
    @Override
    // report number of players on a given team (or all players, if null)
    public int numPlayers(String teamName) {
        return -1;
    }

    /**
     * gives the nth player on a the given team
     *
     * @see SoccerDB#playerNum(int, String)
     */
    // get the nTH player
    @Override
    public SoccerPlayer playerNum(int idx, String teamName) {
        return null;
    }

    /**
     * reads database data from a file
     *
     * @see SoccerDB#readData(java.io.File)
     */
    // read data from file
    @Override
    public boolean readData(File file) {
        return file.exists();
    }

    /**
     * write database data to a file
     *
     * @see SoccerDB#writeData(java.io.File)
     */
    // write data to file
    @Override
    public boolean writeData(File file) {
        return false;
    }

    /**
     * helper method that logcat-logs a string, and then returns the string.
     * @param s the string to log
     * @return the string s, unchanged
     */
    private String logString(String s) {
        Log.i("write string", s);
        return s;
    }

    /**
     * returns the list of team names in the database
     *
     * @see cs301.Soccer.SoccerDB#getTeams()
     */
    // return list of teams
    @Override
    public HashSet<String> getTeams() {
        return new HashSet<String>();
    }

}