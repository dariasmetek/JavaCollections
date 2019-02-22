import controller.CityController;

public class CityMain {
    public static void main(String[] args) {
        CityController cc = new CityController();
        cc.insertIntoCity("Grudziadz", 95000., 59.1);
        cc.insertIntoCity("Bydgoszcz", 320000., 59.1);
        cc.insertIntoCity("Torun", 200000., 59.1);
        //cc.selectFromCitybyID(1);
        //cc.selectFromCitybyID(10);
        cc.deletefromCityById(10);
        //cc.saveCityTableData();
        cc.selectFromCity();
        //cc.updateCityValueById(1, 44444.);



    }


}
