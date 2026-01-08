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
			if(x.nextLine().compareTo(D) < 0)
			{
				Train myTrain = new Train(x.nextLine(), x.nextLine(), x.nextLine(), x.nextLine(), Integer.valueOf(x.nextLine()), Integer.valueOf(x.nextLine()));
				if(myTrain.getMiles()>700)
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
				Train myTrain = new Train(x.nextLine(), x.nextLine());
			}
		}
		Train currentTrain = new Train();
		int totalWeightA = 0;
		int totalWeightC = 0;
		int totalWeightB = 0;
		while(!track0.isEmpty())
		{
			currentTrain = track0.remove();
			if(currentTrain.getDestination().equals("Trenton"))
			{
				if(totalWeightA + currentTrain.getWeight() > limitTrackA)
				{
					Train tempEngine = new Train(ENG00000, "Trenton");
					trackA.push(tempEngine);
				}
				else
				{
					trackA.push(currentTrain);
					totalWeightA += currentTrain.getWeight();
				}
				if(temp.compareTo("D") > 0)
				{
					System.out.println(currentTrain.getName() + " leaving for " + currentTrain.getDestination() + " with the following cars:");
					while(!trackA.isEmpty())
					{
						currentTrain = trackA.pop();
						System.out.println(currentTrain.getName() + " containing " + currentTrain.getContents());
					}
				}
			}
			else if(currentTrain.getDestination().equals("Charlotte"))
			{
				if(totalWeightB + currentTrain.getWeight() > limitTrackB)
				{
					Train tempEngine = new Train(ENG00000, "Charlotte");
					trackB.push(tempEngine);
				}
				else
				{
					trackB.push(currentTrain);
					totalWeightB += currentTrain.getWeight();
				}
				if(temp.compareTo("D") > 0)
				{
					System.out.println(currentTrain.getName() + " leaving for " + currentTrain.getDestination() + " with the following cars:");
					while(!trackB.isEmpty())
					{
						currentTrain = trackB.pop();
						System.out.println(currentTrain.getName() + " containing " + currentTrain.getContents());
					}
				}
			}
			else if(currentTrain.getDestination().equals("Baltimore"))
			{
				if(totalWeightC + currentTrain.getWeight() > limitTrackC)
				{
					Train tempEngine = new Train(ENG00000, "Baltimore");
					trackC.push(tempEngine);
				}
				else
				{
					trackC.push(currentTrain);
					totalWeightC += currentTrain.getWeight();
				}
				if(temp.compareTo("D") > 0)
				{
					System.out.println(currentTrain.getName() + " leaving for " + currentTrain.getDestination() + " with the following cars:");
					while(!trackC.isEmpty())
					{
						currentTrain = trackC.pop();
						System.out.println(currentTrain.getName() + " containing " + currentTrain.getContents());
					}
				}
			}
			else
			{
				trackD.push(currentTrain());
				if(temp.compareTo("D") > 0)
				{
					System.out.println(currentTrain.getName() + " leaving for " + currentTrain.getDestination() + " with the following cars:");
					while(!trackC.isEmpty())
					{
						currentTrain = trackD.pop();
						System.out.println(currentTrain.getName() + " containing " + currentTrain.getContents());
					}
				}
			}
		}
	}
}
