package TaskA;

public class Setter extends VoleyBallPlayer{
    public int countOfSets;

    public Setter(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberOfPoints, int countOfSets) {
        super(nameOfPlayer, sportType, numberPosition, teamName, numberOfPoints);
        this.countOfSets = countOfSets;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Count of sets: " + countOfSets);
    }

    public static void main(String[] args) {
        Information voleyball = new Setter("John", "Voleyball", 10, "Chicago Bulls", 10, 10);
        voleyball.getInfo();
    }
    
}
