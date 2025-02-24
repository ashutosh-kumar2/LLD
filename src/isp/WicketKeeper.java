package isp;

public class WicketKeeper implements Player{
    @Override
    public void bat(){
        System.out.println("Wicketkeeper is batting...");
    }

    @Override
    public void keepWicket(){
        System.out.println("Wicketkeeper is keeping...");
    }
}
