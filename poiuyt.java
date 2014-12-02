package poiuyt;
import java.util.Scanner;


public class poiuyt {

	public static void main(String[] args) {
		
		
//PLACES!
		String lose = "You did not make it to the school. 'Failiure isnt fatal, but failiure to change might be' \n Try Again? \n 1) Yes \n 2) No";
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
		String dead = ("You have failed your trip to school. Make better decisions next time!");
		
		String text;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		position = 0;
		
		if(position == 0)
		System.out.println("***************************** \nWelcome to poiuyt \n 1) Play. \n 2) How to play. \n 3) Credits. \n*****************************");
		text = scan.nextLine();
		
		if(text.equals("1")){
			position = 500;
		}
		
		
	
		
		
		
		
		if(text.equals("2")){
			System.out.println("This game is about walking to school, the objective is to get to school. \nMake the correct decisions along the way in order to complete the task at hand. \nTo chose a path, type the key that is assigned to the path you want and then press enter. \nGood Luck! \n Start Game? \n 1) Yes \n 2) No \n*****************************");
			text = scan.nextLine();
			if(text.equals("1")){
				position = 500;
			}
				if(text.equals("2")){
				System.out.println("Thanks for not playing!\n---poiuyt Terminated---\n*****************************");
				}
			
		
		}
		
		if(text.equals("3")){
			System.out.println("\n****************************************************************\nMade by Liam Stewart and Mackenzie Craig \n©poiuyt 2014 \nCheck our project out on GitHub! http://github.com/dtoast/poiuyt \n Start Game? \n 1) Yes \n 2) No\n****************************************************************");
			text = scan.nextLine();
			if(text.equals("1")){
				position = 500;
			}
				if(text.equals("2")){
				System.out.println("Thanks for not playing!\n---poiuyt Terminated---\n*****************************");
				}
		}
		
		
		if(position==500){
		System.out.println("You have just woken up, school starts in 30 minutes! \nWhat would you like to do? \n 1) Go back to bed. \n 2) Get ready for school, leave house headed towards school. \n 3) Lay in bed for 5 minutes.");
		
		text = scan.nextLine();
			//1
				if(text.equals("1")){
					position = 1;
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
					position = 1;
					if(position==1){
					System.out.println(one + "\n" + position + "/26" + "\n*****************************");
					}
				}
		
	
		//Path 1-1 FINISHED!
		if(position==1){
			System.out.println("The bells are about to go! You slept in too long! \n 1) Skip class, go back to bed. \n 2) Hurry, put clothes on, exit house running to school \n 3) Take your time, make a lunch, watch some TV and hopefully make it to school before 2nd block starts.");
			text = scan.nextLine();
			if(text.equals("1")){
				position = 1;
				if(position==1){
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
							text = scan.nextLine();
							if(text.equals("1")){
							position = 0;
						}
							if(text.equals("2")){
							System.out.println("Thanks for playing!");
						}
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
							System.out.println(lose + "\nYou walk into the alley, and you are interupting a mob meeting. Looks like your swimming with the fishes." + "\n" + dead + "\n*****************************");
					}
				}	
			}
				if(position==5){
					System.out.println("How fast do you want to walk to school? \n 1) Slow walk. \n 2) Fast walk. \n 3) Run!");
					text = scan.nextLine();
					if(text.equals("1")){
						position = 6;
						if(position==6){
							System.out.println(seven + " \nA slow walk? What are you, my Grandpa?" + "\n*****************************");
						}
					}
						if(text.equals("2")){
							position = 9;
							if(position==9){
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
		
				if(position==6){
					System.out.println("You come up to an intersection and see a child on the ground! \nWhat do you do? \n 1) Run over and help the child. \n 2) Keep walking as if you didn't see anything \n 3) Stay where you are and call for help!");
					text = scan.nextLine();
					if(text.equals("1")){
						position = 1006;
						if(position==1006){
							System.out.println(nine + " \nYou run over and help this child. *SPLAT* \nOnly place you went was all over someones windshield! \nBetter Luck next time!" + dead + "\n*****************************");
						}
					}
						if(text.equals("2")){
							position = 9;
							if(position==9){
								System.out.println(ten + " \nYou keep walki...*SPLAT* You don't have to look back to know what that was." + "\n*****************************");
							}
					}
						if(text.equals("3")){
						position = 1007;
						if(position==1007){
							System.out.println(nine + "\nYou stayed and helped a child in need! Gold star for you! Although you didn't make it to school." + "\n" + dead + "\n*****************************");
					}
				}	
			}
		
				if(position==9){
					System.out.println("White Van pulls up beside you and the driver asks you to get in. \nWhat do you do? \n 1) Call for help! \n 2) Attempt to cross the busy street to escape the van! \n 3) Get in the Van. \n 4) Ask if he has candy!");
					text = scan.nextLine();
					if(text.equals("1")){
						position = 1008;
						if(position==1008){
							System.out.println(thirteen + " \nYou called for help and 6 more white vans pull up." + dead + "\n*****************************");
						}
					}
						if(text.equals("2")){
							position = 10;
							if(position==10){
								System.out.println(sixteen + " \nYou run and lose the Van!" + "\n*****************************");
							}
					}
						if(text.equals("3")){
						position = 1009;
						if(position==1009){
							System.out.println(nine + "\nHaven't your parents told you not to get into strangers vehicles?" + "\n" + dead + "\n*****************************");
					}
				}	
						if(text.equals("4")){
						position = 1009;
						if(position==1009){
							System.out.println(nine + "\nAre you serious..?" + "\n" + dead + "\n*****************************");
					}
				}	
			}
				if(position==10){
					System.out.println("As you walk on a man with his hood covering his head bumps into you... you think you feel him take your wallet but you aren't sure. \n 1) Chase down the man and demand your wallet back. \n 2) Keep moving. School is more important than money. Remember what Biggie said, 'mo money mo problems'.");
					text = scan.nextLine();
					if(text.equals("1")){
						position = 1008;
						if(position==1008){
							System.out.println(thirteen + " \nThe man turns on you and roundhouse kicks you in the face \n" + dead + "\n*****************************");
						}
					}
						if(text.equals("2")){
							position = 11;
							if(position==11){
								System.out.println(twelve + " \nYou swollow your pride and move on without your wallet." + "\n*****************************");
					}
				}
			}
				if(position==11){
					System.out.println("You are nearing the gas station near the school. Do you want to stop to buy something? \n 1) Yes \n 2) No");
					text = scan.nextLine();
					if(text.equals("1")){
						position = 12;
						if(position==12){
							System.out.println(thirteen + " \nYou enter the gas station; \n" + "\n*****************************");
						}
					}
						if(text.equals("2")){
							position = 1008;
							if(position==1008){
								System.out.println(sixteen + " \nYou don't go to the gas station, but when you walk past you get ran over by a semi." + dead + "\n*****************************");
					}
				}
			}
				if(position==12){
					System.out.println("\n Shopkeeper: 'Hi welcome to GasZone what do you want to buy?' \n 1) A Coffee \n 2) A Chocolate Bar \n 3) Dried Fruit and nuts");
					text = scan.nextLine();
					if(text.equals("1")){
						position = 13;
						if(position==13){
							System.out.println(thirteen + " \nYou chose to buy coffee. You exit the store and walk towards school. \n" + "\n*****************************");
						}
					}
						if(text.equals("2")){
							position = 1008;
							if(position==1008){
								System.out.println(thirteen + " \nYou chose to buy a chocolate bar. You consume it, and as you bite you feel something crunchy... A needle!" + dead + "\n*****************************");
					}
				}
						if(text.equals("3")){
							position = 69;
							if(position==69){
								System.out.println(thirteen + " \nYou chose to buy dried fruit and nuts. You exit the store and walk towards school. \n" + "\n*****************************");
							}
						}
			}
				if(position==69){
					System.out.println("\n Your friends drive by you, they wave at you from the windows of their car.\n 1) Wave Back \n 2) Ignore");
					text = scan.nextLine();
					if(text.equals("1")){
						position = 70;
						if(position==70){
							System.out.println(sixteen + " \nYou wave back, they smile at you.");
						}
					}
						if(text.equals("2")){
							position = 70;
							if(position==70){
								System.out.println(sixteen + " \nYou do not wave back to your friends. Ass hole.");
					}
				}

			}
				if(position==70){
					System.out.println("\n Do you want to eat some of the dried fruit and nuts? \n 1) Yes \n 2) Throw them out");
					text = scan.nextLine();
					if(text.equals("1")){
						position = 1009;
						if(position==1009){
							System.out.println(twenty + " \nYou eat a handful of the mix, too bad your allergic..." + dead + "\n*****************************");
						}
					}
						if(text.equals("2")){
							position = 1009;
							if(position==1009){
								System.out.println(nineteen + " \nYou threw out your only food! You starve!" + dead + "\n*****************************");
					}
				}

			}
				if(position==13){
					System.out.println("\n You can see steam flowing from the lid of your coffee, it is very hot. \n 1) Drink some \n 2) Wait until it cools down");
					text = scan.nextLine();
					if(text.equals("1")){
						position = 14;
						if(position==14){
							System.out.println(twentyfour + " \nYou drink some of the coffee, it is hot but doesn't burn your mouth.");
						}
					}
						if(text.equals("2")){
							position = 1010;
							if(position==1010){
								System.out.println(twentytwo + " \nYou leave the coffee full, but when walking you spill the cup on yourself!" + dead + "\n*****************************");
					}
				}
			}
				if(position==14){
					System.out.println("\n \n \n You have arrived at school. \n \n \n 1) Open the door");
					text = scan.nextLine();
					if(text.equals("1")){
						position = 15;
						if(position==15){
							System.out.println(twentyseven + " \n Congratulations... You have made it to school.");
						}
					}
		}
		}
	}}
