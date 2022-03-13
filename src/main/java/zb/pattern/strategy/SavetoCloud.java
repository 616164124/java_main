package zb.pattern.strategy;

public class SavetoCloud implements SaveData {
    @Override
    public void saveData(Object i) {
        System.out.println("SavetoCloud.......saveData.");
    }
}
