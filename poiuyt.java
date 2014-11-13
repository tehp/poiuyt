package poiuyt;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		
		int position = 1;
		String one = ("X--------------------------O \nYou haven't started your trip to school yet!");
		String two = ("-X-------------------------O \nYou are this close to school");
		String three = ("--X------------------------O \nYou are this close to school");
		String four = ("---X-----------------------O \nYou are this close to school");
		String five = ("----X----------------------O");
		String six = ("-----X---------------------O");
		String seven = ("------X--------------------O");
		String eight = ("-------X-------------------O");
		String nine = ("--------X------------------O");
		String ten = ("---------X-----------------O");
		String eleven = ("----------X----------------O");
		String twelve = ("-----------X---------------O");
		String thirteen = ("------------X--------------O");
		String fourteen = ("-------------X-------------O");
		String fifteen = ("--------------X------------O");
		String sixteen = ("---------------X-----------O");
		String seventeen = ("----------------X----------O");
		String eighteen = ("-----------------X---------O");
		String nineteen = ("------------------X--------O");
		String twenty = ("-------------------X-------O");
		String twentyone = ("--------------------X------O");
		String twentytwo = ("---------------------X-----O");
		String twentythree = ("----------------------X----O");
		String twentyfour = ("-----------------------X---O");
		String twentyfive = ("------------------------X--O");
		String twentysix = ("-------------------------X-O");
		String twentyseven = ("--------------------------XO");
		
		String text;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	
		System.out.println("You have just woken up, school starts in 30 minutes! \n What would you like to do? \n 1) Go back to bed. \n 2) Get dressed. \n 3) Lay in bed for 5 minutes.");
		//Question1
		text = scan.nextLine();
	//1
		if(text.equals("1")){
				System.out.println(one);
		}
			//2
				if(text.equals("2")){
					
					position ++;
					if(position==1);
					System.out.println(two);
				}
					//3
						if(text.equals("3")){
							System.out.println(one);
						}
		if (text=="1"){
			System.out.println("You have just woken up, school starts in 30 minutes! \n What would you like to do? \n 1) Go back to bed. \n 2) Get dressed. \n 3) Lay in bed for 5 minutes.");	
		}
		
		
		}
	
	}
