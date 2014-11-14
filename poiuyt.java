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
		
		//Original Question FINISHED!
		System.out.println("You have just woken up, school starts in 30 minutes! \nWhat would you like to do? \n 1) Go back to bed. \n 2) Get dressed. \n 3) Lay in bed for 5 minutes.");
		
		text = scan.nextLine();
			//1
				if(text.equals("1")){
		
					if(position==1){
					System.out.println(one + "\n" + position + "/26" + "\n*****************************");
					}
				}
			//2
				if(text.equals("2")){
					
					position ++;
					if(position==2){
					System.out.println(two + "\n" + position + "/26" + "\n*****************************");
					}
				}
			//3
				if(text.equals("3")){
					
					if(position==1){
					System.out.println(one + "\n" + position + "/26" + "\n*****************************");
					}
				}
	
	
		//Path 1-1 FINISHED!
		if(position==1){
			System.out.println("The bells is about to go! You slept in too long! \n 1) Skip class, go back to bed. \n 2) Hurry, put clothes on, exit house to school \n 3) Take your time, make a lunch, watch some TV and hopefully make it to school before 2nd block starts.");
			text = scan.nextLine();
			if(text.equals("1")){
				position --;
				if(position==0){
					System.out.println(one + " You have chosen to skip class!" + "\n" + position + "/26" + "\n*****************************" );
				}
			}
				if(text.equals("2")){
				position ++;
				if(position==2){
					System.out.println(two + " You rushed out the door" + "\n" + position + "/26" + "\n*****************************");
				}
			}
				if(text.equals("3")){
				
				if(position==1){
					System.out.println(one + " You have chosen nutrition over education!" + "\n" + position + "/26" + "\n*****************************");
		}
				
			
		//Path 2-1 NOT FINISHED!
	
	
	
	
	
	}
}
	}	
}
	
