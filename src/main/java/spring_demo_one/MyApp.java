package spring_demo_one;

public class MyApp {

    public static void main(String[] args) {

        //Coach theCoach = new BaseballCoach();
        Coach theCoach = new TrackCoach();
        System.out.println(theCoach.getDailyWorkout());

    }
}
