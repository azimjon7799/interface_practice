package TaskA;

public class GoalKeeper extends FootballPlayer{
    public int countOfSaves;

    public GoalKeeper(String nameOfPlayer, String sportType, int numberPosition, String teamName, int countOfRedCards, int countOfYellowCards, int countOfGoals, int countOfSaves) {
        super(nameOfPlayer, sportType, numberPosition, teamName, countOfRedCards, countOfYellowCards, countOfGoals);
        this.countOfSaves = countOfSaves;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Count of saves: " + countOfSaves);
    }

    public static void main(String[] args) {
        FootballPlayer player = new GoalKeeper("Casilas", "Football", 1, "Real Madrid", 4, 1, 3, 100);
        player.getInfo();
    }
    
}
