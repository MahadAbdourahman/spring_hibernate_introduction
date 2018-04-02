package spring_demo_one;

public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes a day on batting practice ";
    }
}
