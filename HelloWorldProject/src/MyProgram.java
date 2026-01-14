/*
 * TODO: Name: Meade Havenstein
 * TODO: Date: 1/12/26
 * TODO: Class Period: 6
 * TODO: Program Description: The prurpose of this program is to send the cars to their proper destination.
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
			/*String name = x.nextLine();
			System.out.println(name);*/
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		String names = "";
		String products = "";
		String origins = "";
    	String destinations = "";
		int weights = 0;
		int milex = 0;
		Train myTrain;
		while(x.hasNext())
		{
			names = x.nextLine();
			System.out.println(names);
			if(names.equals("END"))
			{
				//empty if making nothing happen if name is end
			}//end if
			else if(names.compareTo("D") < 0)
			{
				products = x.nextLine();
				origins = x.nextLine();
				destinations = x.nextLine();
				weights = x.nextInt();
				milex = x.nextInt();
				x.nextLine();
			}//end else if
			else
			{
				destinations = x.nextLine();
			}//end else
			

			if(names.compareTo("D") < 0)
			{
				myTrain = new Train(names, products, origins, destinations, weights, milex);
				if(myTrain.getMiles()>700)
				{
					track1.add(myTrain);
				}//end if
				else
				{
					track0.add(myTrain);
				}//end else
			}//end if
			else if (!names.equals("END"))
			{
				myTrain = new Train(names, destinations);
				track0.add(myTrain);
			}//end else if
		}//end while
		Train currentTrain = new Train("anything", "whatever");
		String temp;
		int totalWeightA = 0;
		int totalWeightC = 0;
		int totalWeightB = 0;
		Train tempTrain = new Train("anything", "whatever");
		while(!track0.isEmpty())
		{
			currentTrain = track0.remove();
			temp = currentTrain.getName();
			if(currentTrain.getDestination().equals("Trenton"))
			{
				if(totalWeightA + currentTrain.getWeight() > limitTrackA)
				{
					tempTrain = currentTrain;
					System.out.println("\nTrack A");
					System.out.println("ENG00000 leaving for Trenton with the following cars:");
					while(!trackA.isEmpty())
					{
						currentTrain = trackA.pop();
						System.out.println(currentTrain.getName() + " containing " + currentTrain.getContents());
					}//end while
					totalWeightA = 0;
					trackA.push(tempTrain);
					totalWeightA += tempTrain.getWeight();
				}//end if
				else
				{
					trackA.push(currentTrain);
					totalWeightA += currentTrain.getWeight();
				}//end else
				if(temp.compareTo("D") > 0)
				{
					System.out.println("\nTrack A");
					System.out.println(currentTrain.getName() + " leaving for " + currentTrain.getDestination() + " with the following cars:");
					trackA.pop();
					while(!trackA.isEmpty())
					{
						currentTrain = trackA.pop();
						System.out.println(currentTrain.getName() + " containing " + currentTrain.getContents());
					}//end while
					totalWeightA = 0;
				}//end if
			}//end if
			else if(currentTrain.getDestination().equals("Charlotte"))
			{
				if(totalWeightB + currentTrain.getWeight() > limitTrackB)
				{
					tempTrain = currentTrain;
					System.out.println("\nTrack B");
					System.out.println("ENG00000 leaving for Charlotte with the following cars:");
					while(!trackB.isEmpty())
					{
						currentTrain = trackB.pop();
						System.out.println(currentTrain.getName() + " containing " + currentTrain.getContents());
					}
					totalWeightB = 0;
					trackB.push(tempTrain);
					totalWeightB += tempTrain.getWeight();
				}//end if
				else
				{
					trackB.push(currentTrain);
					totalWeightB += currentTrain.getWeight();
				}//end else
				if(temp.compareTo("D") > 0)
				{
					System.out.println("\nTrack B");
					System.out.println(currentTrain.getName() + " leaving for " + currentTrain.getDestination() + " with the following cars:");
					trackB.pop();
					while(!trackB.isEmpty())
					{
						currentTrain = trackB.pop();
						System.out.println(currentTrain.getName() + " containing " + currentTrain.getContents());
					}//end while
					totalWeightB = 0;
				}//end if
			}//end else if
			else if(currentTrain.getDestination().equals("Baltimore"))
			{
				if(totalWeightC + currentTrain.getWeight() > limitTrackC)
				{
					tempTrain = currentTrain;
					System.out.println("\nTrack C");
					System.out.println("ENG00000 leaving for Baltimore with the following cars:");
					while(!trackC.isEmpty())
					{
						currentTrain = trackC.pop();
						System.out.println(currentTrain.getName() + " containing " + currentTrain.getContents());
					}
					totalWeightC = 0;
					trackC.push(tempTrain);
					totalWeightC += tempTrain.getWeight();
				}//end if
				else
				{
					trackC.push(currentTrain);
					totalWeightC += currentTrain.getWeight();
				}//end else
				if(temp.compareTo("D") > 0)
				{
					System.out.println("\nTrack C");
					System.out.println(currentTrain.getName() + " leaving for " + currentTrain.getDestination() + " with the following cars:");
					trackC.pop();
					while(!trackC.isEmpty())
					{
						currentTrain = trackC.pop();
						System.out.println(currentTrain.getName() + " containing " + currentTrain.getContents());
					}//end while
					totalWeightC = 0;
				}//end if
			}//end else if
			else
			{
				trackD.push(currentTrain);
				if(temp.compareTo("D") > 0)
				{
					System.out.println("\nTrack D");
					System.out.println(currentTrain.getName() + " leaving for " + currentTrain.getDestination() + " with the following cars:");
					while(!trackD.isEmpty())
					{
						currentTrain = trackD.peek();
						System.out.println(currentTrain.getName() + " containing " + currentTrain.getContents());
					}//end while
				}//end if
			}//end else
		}//end while
		System.out.println("\nTrack D");
		while(!track1.isEmpty())
		{
			currentTrain = track1.remove();
			temp = currentTrain.getName();
			if(currentTrain.getDestination().equals("Trenton"))
			{
				if(totalWeightA + currentTrain.getWeight() > limitTrackA)
				{
					tempTrain = currentTrain;
					System.out.println("\nTrack A");
					System.out.println("ENG00000 leaving for Trenton with the following cars:");
					while(!trackA.isEmpty())
					{
						currentTrain = trackA.pop();
						System.out.println(currentTrain.getName() + " containing " + currentTrain.getContents());
					}//end while
					totalWeightA = 0;
					trackA.push(tempTrain);
					totalWeightA += tempTrain.getWeight();
				}//end if
				else
				{
					trackA.push(currentTrain);
					totalWeightA += currentTrain.getWeight();
				}//end else
			}//end while
			else if(currentTrain.getDestination().equals("Charlotte"))
			{
				if(totalWeightB + currentTrain.getWeight() > limitTrackB)
				{
					tempTrain = currentTrain;
					System.out.println("\nTrack B");
					System.out.println("ENG00000 leaving for Charlotte with the following cars:");
					while(!trackB.isEmpty())
					{
						currentTrain = trackB.pop();
						System.out.println(currentTrain.getName() + " containing " + currentTrain.getContents());
					}//end while
					totalWeightB = 0;
					trackB.push(tempTrain);
					totalWeightB += tempTrain.getWeight();
				}//end if
				else
				{
					trackB.push(currentTrain);
					totalWeightB += currentTrain.getWeight();
				}//end else
			}//end while
			else if(currentTrain.getDestination().equals("Baltimore"))
			{
				if(totalWeightC + currentTrain.getWeight() > limitTrackC)
				{
					tempTrain = currentTrain;
					System.out.println("\nTrack C");
					System.out.println("ENG00000 leaving for Baltimore with the following cars:");
					while(!trackC.isEmpty())
					{
						currentTrain = trackC.pop();
						System.out.println(currentTrain.getName() + " containing " + currentTrain.getContents());
					}//end while
					totalWeightC = 0;
					trackC.push(tempTrain);
					totalWeightC += tempTrain.getWeight();
				}//end if
				else
				{
					trackC.push(currentTrain);
					totalWeightC += currentTrain.getWeight();
				}//end else
			}//end while
			else
			{
				trackD.push(currentTrain);
			}//end while
		}//end while
		System.out.println("\nTrack A");
		if(!trackA.isEmpty())
		{
			System.out.println("ENG00000 leaving for Trenton with the following cars:");
		}//end if
		while(!trackA.isEmpty())
		{
			currentTrain = trackA.pop();
			System.out.println(currentTrain.getName() + " containing " + currentTrain.getContents());
		}//end while
		System.out.println("\nTrack B");
		if(!trackB.isEmpty())
		{
			System.out.println("ENG00000 leaving for Charlotte with the following cars:");
		}//end if
		while(!trackB.isEmpty())
		{
			currentTrain = trackB.pop();
			System.out.println(currentTrain.getName() + " containing " + currentTrain.getContents());
		}//end while
		System.out.println("\nTrack C");
		if(!trackC.isEmpty())
		{
			System.out.println("ENG00000 leaving for Baltimore with the following cars:");
		}//end if
		while(!trackC.isEmpty())
		{
			currentTrain = trackC.pop();
			System.out.println(currentTrain.getName() + " containing " + currentTrain.getContents());
		}//end while
		System.out.println("\nTrack D");
		if(!trackD.isEmpty())
		{
			System.out.println("ENG00000 leaving for " + currentTrain.getDestination() + " with the following cars:");
		}//end if
		while(!trackD.isEmpty())
		{
			currentTrain = trackD.pop();
			System.out.println(currentTrain.getName() + " containing " + currentTrain.getContents() + " heading to " + currentTrain.getDestination());
		}//end while
	}//end main
}//end class