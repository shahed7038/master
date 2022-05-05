package Exerciseprb;

import java.util.Random;
import java.util.Scanner;

class Game{
		int randomnumber;
		int inputnumber;
		int count=0;
		Game(){
			Random rand=new Random();
			this.randomnumber=rand.nextInt(100);
			System.out.println(randomnumber);
		}
		void takeuserinput() {
			System.out.println("Guess a number");
			Scanner sc= new Scanner(System.in);
			this.inputnumber=sc.nextInt();		
		}
		boolean isCorrectNumber() {
			count++;
			if(randomnumber==inputnumber) {
				System.out.println("You have Guess it right :"+randomnumber);
				System.out.println("you have attempted no of time:" +count);
			}
			else if(inputnumber>randomnumber){
				System.out.println("Too high");
			}
			else if(inputnumber<randomnumber){
				System.out.println("Too low");
			}
	  return false;

		}

	}

public class Guess_a_number_game {

	public static void main(String[] args) {
		Game g= new Game();
		boolean b= false;
		while(!b) {
		g.takeuserinput();
		g.isCorrectNumber();
		}
	}

	}


