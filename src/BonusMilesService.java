public class BonusMilesService {

    public int calculate(int price) {
        int miles1Rub = 20; // Мили за 1 рубль
        return price / miles1Rub;
    }
}
