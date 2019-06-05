public class BottleFactory {

    public Bottle createABottle(String bottleType)
    {
        Bottle bottle = null;

        if(bottleType.equals("s"))
        {
            return new Sprite();
        }
        else if(bottleType.equals("w"))
        {
            return new Water();
        }
        else if(bottleType.equals("c"))
        {
            return new Cola();
        }
        return null;

    }
}
