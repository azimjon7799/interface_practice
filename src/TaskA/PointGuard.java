package TaskA;

public class PointGuard extends BasketballPlayer{
    public int countOfGuard;
    public PointGuard(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberOfGoals, int countOfGuard) {
        super(nameOfPlayer, sportType, numberPosition, teamName, numberOfGoals);
        this.countOfGuard = countOfGuard;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Number of guard: " + countOfGuard);
    }

    public static void main(String[] args) {
        Player player = new PointGuard("John", "Basketball", 20, "Chicago Bulls", 100, 10);
        player.getInfo();
    }
    
}
