import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		
		
//PLACES!
		String dead = "You did not make it to the school. 'Failiure isnt fatal, but failiure to change might be' \nTry again? (Y/N)";
		int position = 1;
		String one = ("X--------------------------O \nYou haven't started your trip to school yet!");
		String two = ("-X-------------------------O \nYou are this close to school.");
		String three = ("--X------------------------O");
		String four = ("---X-----------------------O");
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
		String lose = ("You have failed your trip to school. Make better decisions next time!");
		
		String text;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("********************* \nWelcome to poiuyt \n 1) Play. \n 2) How to play. \n 3) Credits. \n*********************");
		text = scan.nextLine();
		
		
		if(text.equals("2")){
			System.out.println("This game is about walking to school, the objective is to get to school. \nMake the correct decisions along the way in order to complete the task at hand. \nTo chose a path, type the key that is assigned to the path you want and then press enter. \nGood Luck!");
		}
		
		if(text.equals("3")){
			System.out.println("Made by Liam Stewart and Mackenzie Craig \n©poiuyt 2014 \nCheck our project out on GitHub! http://github.com/dtoast/poiuyt");
		}
		
		if(text.equals("1")){
		System.out.println("You have just woken up, school starts in 30 minutes! \nWhat would you like to do? \n 1) Go back to bed. \n 2) Get ready for school, leave house headed towards school. \n 3) Lay in bed for 5 minutes.");
		
		text = scan.nextLine();
			//1
				if(text.equals("1")){
		
					if(position==1){
					System.out.println(one + "\n" + position + "/26" + "\n*****************************");
					}
				}
			//2
				if(text.equals("2")){
					
					position = 2;
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
			System.out.println("The bells are about to go! You slept in too long! \n 1) Skip class, go back to bed. \n 2) Hurry, put clothes on, exit house running to school \n 3) Take your time, make a lunch, watch some TV and hopefully make it to school before 2nd block starts.");
			text = scan.nextLine();
			if(text.equals("1")){
				position = 0;
				if(position==0){
					System.out.println(one + " \nYou have chosen to skip class! You have failed your trip to school!" + "\n" + position + "/26" + "\n*****************************" );
				}
			}
				if(text.equals("2")){
				position = 2;
				if(position==2){
					System.out.println(two + " You rushed out the door, you head towards the school at a fast pace!" + "\n" + position + "/26" + "\n*****************************");
				}
			}
				if(text.equals("3")){
				
					position = 2;
				if(position==2){
					System.out.println(one + " You have chosen nutrition over education! Mom would be proud... or would she?" + "\n" + position + "/26" + "\n*****************************");
		}
				}
		}
				
			
		//Path 2-1 NOT FINISHED!
				if(position==2){
					System.out.println("You spot a raccoon in your front yard. \nWhat do you do? \n 1) Go back inside, wait for it to leave. \n 2) Chase it with a stick. \n 3) Make a run for it.");
					text = scan.nextLine();
					if(text.equals("1")){
						position = 2;
						if(position==2){
							System.out.println(two + " You have chosen to wait til the raccoon has left." + "\n" + position + "/26" + "\n*****************************" );
						}
					}
						if(text.equals("2")){
						position = 999;
						if(position==999){
							System.out.println(lose + "\nYou have lost the battle with the raccoon!" + "\n*****************************");
						}
					}
						if(text.equals("3")){
						
							position = 3;
						if(position==3){
							System.out.println(three + "\nYou spin juked the raccoon! Home free from here out!" + "\n" + position + "/26" + "\n*****************************");
				
						}
					}
				}
			
				if(position==2){
					System.out.println("Friend has offered you a ride \n 1) Accept \n 2) Decline");
					text = scan.nextLine();
					if(text.equals("1")){
						position = 1000;
						if(position==1000){
							System.out.println(sixteen + "\n" + lose + " \nCar Accident! You were half way to school!" + "\n" + "16/26" + "\n*****************************" );
						}
					}
						if(text.equals("2")){
						position = 3;
						if(position==3){
							System.out.println(four + " \nYou have chosen to walk" + "\n" + position + "/26" + "\n*****************************" );
						}
					}
						
				
						}
				
				if(position==3){
					System.out.println("You start walking but you realise you forgot your lunch. \n 1) Go back to get it. \n 2) Keep Walking.");
					text = scan.nextLine();
					if(text.equals("1")){
						position = 1001;
						if(position==1001){
							System.out.println(lose + " \nYou chose to go back and get your lunch but the Raccoon beat you to it" + "\n*****************************");
						}
					}
						if(text.equals("2")){
						position = 4;
						if(position==4){
							System.out.println(five + "\nWho needs food anyways? \nYou keep walking." + "\n*****************************");
				}
			}
		}
				if(position==4){
					System.out.println("When you walk past the alley near your house you hear a metalic sound. \n 1) Run. As fast as you can. \n 2) Act like you didn't hear it, walk away. \n 3) Check it out!");
					text = scan.nextLine();
					if(text.equals("1")){
						position = 5;
						if(position==5){
							System.out.println(six + " \nYou probably didn't need to run, but safety first. You head towards school." + "\n*****************************");
						}
					}
						if(text.equals("2")){
							position = 5;
							if(position==5){
								System.out.println(six + " \nYou keep heading directly towards school." + "\n*****************************");
							}
					}
						if(text.equals("3")){
						position = 1002;
						if(position==1002){
							System.out.println(lose + "\nYou walk into the alley, and you are interupting a mob metting. looks like your swimming with the fishes." + "\n" + dead + "\n*****************************");
					}
				}	
			}
				if(position==5){
					System.out.println("How fast do you want to walk to school? \n 1) Slow walk. \n 2) Fast walk. \n 3) Run!");
					text = scan.nextLine();
					if(text.equals("1")){
						position = 6;
						if(position==5){
							System.out.println(seven + " \nA slow walk? What are you, my Grandpa?" + "\n*****************************");
						}
					}
						if(text.equals("2")){
							position = 6;
							if(position==5){
								System.out.println(eight + " \nA fast walk. Good choice!" + "\n*****************************");
							}
					}
						if(text.equals("3")){
						position = 1002;
						if(position==1002){
							System.out.println(fifteen + "\nYou run, and make up good ground, but you end up triping over a curb. You head to the hospital." + "\n" + dead + "\n*****************************");
					}
				}	
			}
		}
	}
}
