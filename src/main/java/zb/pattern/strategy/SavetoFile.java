package zb.pattern.strategy;

public class SavetoFile implements SaveData {
    @Override
    public void saveData(Object i) {
        System.out.println("SavetoFile.......saveData.");
    }
}
