package TaskA;

public class FootballPlayer extends Player {
    public int countOfRedCards;
    public int countOfYellowCards; 
    public int countOfGoals;
    public FootballPlayer(String nameOfPlayer, String sportType, int numberPosition, String teamName, int countOfRedCards, int countOfYellowCards, int countOfGoals) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.countOfRedCards = countOfRedCards;
        this.countOfYellowCards = countOfYellowCards;
        this.countOfGoals = countOfGoals;
    }
    
    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Player's count of red cards: " + countOfRedCards);
        System.out.println("Count of yellow cards: " + countOfYellowCards);
        System.out.println("Count of goals: " + countOfGoals);
    }
}
