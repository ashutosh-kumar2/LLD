package isp;

public class AllRounder implements Player{

    @Override
    public void bat(){
        System.out.println("AllRounder is batting...");
    }

    @Override
    public void bowl(){
        System.out.println("AllRounder is bowling...");
    }

    @Override
    public void field(){
        System.out.println("AllRounder is fielding...");
    }
}
