import java.io.IOException;
import java.util.Scanner;

import domain.Client;
import helper.Database;
import helper.Utils;
import ui.AddNewClientUI;

public class Application {
	
	/*
	 * Arda Altunyay
	 * 12.04.2018
	 * */

	public static void main(String[] args) {
		Database.init();
		int choice;
				
		while(true) {
			//Brand UI
			Utils.printLine(49);
			Utils.print("|                                               |");
			Utils.print("|                   AGATE LTD                   |");
			Utils.print("|                                               |");
			
			//Menu UI
			Utils.printLine(49);
			Utils.print("|     1- Add a new client                       |");
			Utils.print("|     2- Add a new campaign                     |");
			Utils.print("|     5- Assign staff to work on a campaign     |");
			Utils.print("|     11- Add a new advert to a campaign        |");
			Utils.print("|     12- Add a new member of staff             |");
			Utils.print("|     999- Exit                                 |");
			Utils.printLine(49);
			
			Utils.print("Enter a number=> ", true);
			choice = new Scanner(System.in).nextInt();
			Utils.printLine(49);
			switch(choice) {
				
				case 1:
					AddNewClientUI.getInstance();
					break;
				case 2:
					Utils.print("add a new campaign");
					break;
				case 5:
					Utils.print("assign staff to work on a campaign");
					break;
				case 11:
					Utils.print("add a new advert to a campaign");
					break;
				case 12:
					Utils.print("add a new member of staff");
					break;
				case 999:
					Utils.print("exit");
					System.exit(0);
					break;
				default:
					Utils.print("error, try enter a number");
					break;
			}
			Utils.printRow(40);
		}
		
	}

}
