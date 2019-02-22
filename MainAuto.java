import controller.AutoController;
public class MainAuto {
    public static void main(String[] args) {
        AutoController ac = new AutoController();
        ac.addAuto("321321VGD2321", "VW", "Passat", 150000);
        ac.addAuto("45566677GV555", "Toyota", "Corolla", 100000);
        ac.addEquipment("321321VGD2321", "A");
        ac.addEquipment("45566677GV555", "B");
        ac.deleteAutobyVin("321321VGD2321");
        ac.deleteEquipment("45566677GV555", "B" );
        ac.getAllAutos();
    }
}
