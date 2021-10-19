package zb.pattern.strategy;

public class Test {
    public static void main(String[] args) {
        SavetoFile savetoFile = new SavetoFile();
        SaveClient saveClient = new SaveClient(savetoFile);
        saveClient.save(savetoFile);
        SavetoDB savetoDB = new SavetoDB();
        SaveClient saveClient1 = new SaveClient(savetoDB);
        saveClient1.save(savetoDB);

    }
}
