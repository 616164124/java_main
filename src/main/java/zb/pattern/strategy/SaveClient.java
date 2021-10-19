package zb.pattern.strategy;

public class SaveClient {
    private SaveData saveData;

    public SaveClient(SaveData saveData) {
        this.saveData = saveData;
    }

    public void save(Object obj) {
        this.saveData.saveData(obj);
    }

    public SaveData getSaveData() {
        return saveData;
    }

    public void setSaveData(SaveData saveData) {
        this.saveData = saveData;
    }
}
