package TaskA;

public class VoleyBallPlayer extends Player{
    public int numberOfPoints;
    public VoleyBallPlayer(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberOfPoints) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.numberOfPoints = numberOfPoints;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Number of points: " + numberOfPoints);
    } 
}
