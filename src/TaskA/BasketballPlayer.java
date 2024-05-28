package TaskA;

public class BasketballPlayer extends Player{
    public int numberOfGoals;

    public BasketballPlayer(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberOfGoals) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.numberOfGoals = numberOfGoals;
    }
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Number of goals: " + numberOfGoals);
    }
    
}
