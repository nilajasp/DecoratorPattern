/**
 * Created by nilajapatankar on 7/16/14.
 */
public abstract class HouseDecorator implements IHouse {

    private IHouse decorateWithHouse;

    public HouseDecorator(IHouse decorateWithHouse)
    {
        this.decorateWithHouse = decorateWithHouse;
    }

    @Override
    public int GetPrice() {
        return decorateWithHouse.GetPrice();
    }
}
