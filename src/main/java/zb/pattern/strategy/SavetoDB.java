package zb.pattern.strategy;

public class SavetoDB implements SaveData{
    @Override
    public void saveData(Object i) {
        System.out.println("SavetoDB.......saveData.");
    }
}
