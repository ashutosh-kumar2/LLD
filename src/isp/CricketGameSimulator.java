package isp;

import java.util.Arrays;
import java.util.List;

public class CricketGameSimulator {

    public final List<PureBatsman> pureBatsmen;
    public final List<AllRounder> allRounders;
    public final WicketKeeper wicketKeeper;
    public final CricketGameHelper cricketGameHelper;

    public CricketGameSimulator(List<PureBatsman> pureBatsmen, List<AllRounder> allRounders, WicketKeeper wicketKeeper, CricketGameHelper cricketGameHelper) {
        this.pureBatsmen = pureBatsmen;
        this.allRounders = allRounders;
        this.wicketKeeper = wicketKeeper;
        this.cricketGameHelper = cricketGameHelper;
    }

    public void simulate(){
        System.out.println("Simulation started");
        startBatting();
        startBowling();
        startFielding();
        startKeeping();
        System.out.println("Simulation ended");
    }

    public void startBatting(){
        for(int i = 0; i < pureBatsmen.size(); i++){
            cricketGameHelper.bat(pureBatsmen.get(i));
        }
        cricketGameHelper.bat(wicketKeeper);
        for(int i = 0; i < allRounders.size(); i++){
            cricketGameHelper.bat(allRounders.get(i));
        }
    }

    public void startBowling(){
        for(int i = 0; i < allRounders.size(); i++){
            cricketGameHelper.bowl(allRounders.get(i));
        }
        cricketGameHelper.bowl(pureBatsmen.get(0)); // does not throw error, does not print on console either
    }

    public void startFielding(){
        for(int i = 0; i < pureBatsmen.size(); i++){
            cricketGameHelper.field(pureBatsmen.get(i));
        }
        for(int i = 0; i < allRounders.size(); i++){
            cricketGameHelper.field(allRounders.get(i));
        }
    }

    public void startKeeping(){
        cricketGameHelper.keep(wicketKeeper);
    }

    public static void main(String[] args) {
        List<PureBatsman> pureBatsmen = Arrays.asList(new PureBatsman(), new PureBatsman(), new PureBatsman(), new PureBatsman());
        List<AllRounder> allRounders = Arrays.asList(new AllRounder(), new AllRounder(), new AllRounder(), new AllRounder(), new AllRounder(), new AllRounder());
        WicketKeeper wicketKeeper = new WicketKeeper();
        CricketGameSimulator cricketGameSimulator = new CricketGameSimulator(pureBatsmen, allRounders, wicketKeeper, new CricketGameHelper());
        cricketGameSimulator.simulate();
    }

}
