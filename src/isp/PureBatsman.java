package isp;

public class PureBatsman implements Player{

    @Override
    public void bat(){
        System.out.println("PureBatsman is batting...");
    }

    @Override
    public void field(){
        System.out.println("PureBatsman is fielding...");
    }
}
