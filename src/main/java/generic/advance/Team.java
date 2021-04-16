package generic.advance;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> {
    String teamName;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    List<T> playerList = new ArrayList<>();

    public void addPlayer(T player){
        if (playerList.contains(player)){
            System.out.println("Player already exists, can't add duplicate");
        } else {
            playerList.add(player);
            System.out.println(player.getPlayerName() + " has been added");
        }
    }

}
