/*
 * TODO: Name
 * TODO: Date
 * TODO: Class Period
 * TODO: Program Description
 */
import java.util.Scanner;
import java.io.File;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class MyProgram {
	public static int val = 0;
	public static void main(String[] args) {

		int limitTrackA = 100000, limitTrackB = 100000, limitTrackC = 100000;
		Queue<Train> track0 = new LinkedList<Train>();
		Queue<Train> track1 = new LinkedList<Train>();
		Stack<Train> trackA = new Stack<Train>();
		Stack<Train> trackB = new Stack<Train>();
		Stack<Train> trackC = new Stack<Train>();
		Stack<Train> trackD = new Stack<Train>();

	
		Scanner x = new Scanner(System.in);
		try{
			File f = new File("HelloWorldProject/src/data.txt");
			x = new Scanner (f);
			String name = x.nextLine();
			System.out.println(name);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		while(x.hasNext())
		{
			if(name.compareTo(D) < 0)
			{
				Train myTrain = new Train(name, x.nextLine(), x.nextLine(), x.nextLine(), integer(x.nextLine()), integer(x.nextLine()));
				if(myTrain.getMiles>700)
				{
					track1.add(myTrain);
				}
				else
				{
					track0.add(myTrain);
				}
			}
			else
			{
				Train myTrain = new Train(name, x.nextLine());
			}
		}
		Train currentTrain = new Train();
		int totalWeightA = 0;
		int totalWeightC = 0;
		int totalWeightB = 0;
		while(!track0.isEmpty())
		{
			currentTrain = track0.remove();
			if(currentTrain.getDestination() == "Trenton")
			{
				if(totalWeightA + currentTrain.getWeight())
				trackA.push(currentTrain());
				if(name.compareTo(D) > 0)
				{
					System.out.println(currentTrain.getName() + " leaving for " + currentTrain.getDestination() + " with the following cars:");
					while(!trackA.isEmpty())
					{
						currentTrain = trackA.pop();
						System.out.println(currentTrain.getName() + " containing " + currentTrain.getContents());
					}
				}
			}
			else if(currentTrain.getDestination() == "Charlotte")
			{
				trackB.push(currentTrain());
				if(name.compareTo(D) > 0)
				{
					
				}
			}
			else if(currentTrain.getDestination() == "Baltimore")
			{
				trackC.push(currentTrain());
				if(name.compareTo(D) > 0)
				{
					
				}
			}
			else
			{
				trackD.push(currentTrain());
				if(name.compareTo(D) > 0)
				{
					
				}
			}
		}
	}
}
