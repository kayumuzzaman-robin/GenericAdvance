package generic.advance;

/**
 * Generics
 */
public class App {
    public static void main(String[] args) {
        CricketPlayer cricketPlayer = new CricketPlayer("Sachin");
        FootballPlayer footballPlayer = new FootballPlayer("CR7");
        FootballPlayer footballPlayer1 = new FootballPlayer("Messi");
        BaseballPlayer baseballPlayer = new BaseballPlayer("Kasem");

        Team<FootballPlayer> realMadrid = new Team<>("RealMadrid");
        realMadrid.addPlayer(footballPlayer);
        realMadrid.addPlayer(footballPlayer);
        realMadrid.addPlayer(footballPlayer1);
//      realMadrid.addPlayer(cricketPlayer); // can't add this, will throw compile time exception as
//      crickePlayer is not belongs to realMadrid team as realMadrid team is Generics by Team<Football>
        System.out.println("Total player of realMadrid = " + realMadrid.playerList.size());

//        Team<String> stringTeam = new Team<>(); // generic Team<String> not possible & will throw compile time exception
//        Type parameter 'java.lang.String' is not within its bound; should extend 'generic.advance.Player'
//        Because Team class is generic by Team<T extends Player> so only subclass of Player will support it

    }
}
