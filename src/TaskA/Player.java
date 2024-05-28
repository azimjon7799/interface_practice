package TaskA;

public class Player implements Information{
    public String nameOfPlayer;
    public String sportType;
    public int numberPosition;
    public String teamName;

    public Player(String nameOfPlayer, String sportType, int numberPosition, String teamName) {
        this.nameOfPlayer = nameOfPlayer;
        this.sportType = sportType;
        this.numberPosition = numberPosition;
        this.teamName = teamName;
    } 
    @Override
    public void getInfo() {
        System.out.println("Player: " + nameOfPlayer);
        System.out.println("Player's Sport Type: " + sportType);
        System.out.println("Player's number of position: " + numberPosition);
        System.out.println("Player's team name: " + teamName);
    }
    @Override
    public String getTeamName() {
        return teamName;
    }
    
}
