package BmiService;

public class BmiService {
    public int calculate (int weightInKg, double heightInMeters, int i){
        return (int) (weightInKg / heightInMeters / heightInMeters);
    }
}
