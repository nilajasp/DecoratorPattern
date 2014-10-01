/**
 * Created by nilajapatankar on 7/16/14.
 */
public class HouseWithTerrace extends HouseDecorator {

    public HouseWithTerrace(IHouse thisHouse) {
        super(thisHouse);
    }

    @Override
    public int GetPrice() {
        return super.GetPrice() + 1500;
    }
}
