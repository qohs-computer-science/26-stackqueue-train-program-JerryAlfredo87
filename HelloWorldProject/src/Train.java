public class Train {
    private String name, product, origin, destination;
    private int weight, miles;
    public train(String cn, String dc)
    {
	    String name = cn;
    	String to = dc;
    }
    public train(String cn, String c, String oc, String dc, int w, int mt)
    {
	    String name = cn;
    	String contents = c;
    	String from = oc;
    	String to = dc;
    	int weight = w;
    	int miles = mt;
    }

    public void getName()
    {
    	return name;
    }

    public void getContents()
    {
    	return contents;
    }

    public void getOrigins()
    {
    	return from;
    }

    public void getDestination()
    {
    	return to;
    }

    public void getWeight()
    {
    	return weight;
    }

    public void getMiles()
    {
    	return miles;
    }


}
