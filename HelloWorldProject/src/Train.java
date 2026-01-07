public class Train {
    private String name, product, origin, destination;
    private int weight, miles;
    public train(String cn, String dc)
    {
	    name = cn;
    	destination = dc;
    }
    public train(String cn, String c, String oc, String dc, int w, int mt)
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
    	return contents;
    }

    public String getOrigins()
    {
    	return from;
    }

    public String getDestination()
    {
    	return to;
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
