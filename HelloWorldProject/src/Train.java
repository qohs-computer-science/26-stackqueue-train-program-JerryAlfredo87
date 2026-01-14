public class Train {
    private String name, product, origin, destination;
    private int weight, miles;
    public Train(String cn, String dc)
    {
	    name = cn;
    	destination = dc;
    }
    public Train(String cn, String c, String oc, String dc, int w, int mt)
    {
	    name = cn;
    	product = c;
    	origin = oc;
    	destination = dc;
    	weight = w;
    	miles = mt;
    }

    public String getName()
    {
    	return name;
    }

    public String getContents()
    {
    	return product;
    }

    public String getOrigins()
    {
    	return origin;
    }

    public String getDestination()
    {
    	return destination;
    }

    public int getWeight()
    {
    	return weight;
    }

    public int getMiles()
    {
    	return miles;
    }
}
