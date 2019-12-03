/******************************************************************************
 * Cody Brock
 * Brandon Hernandez
 * Cooper McDonald
 * CSE 360
 * Team Project
 * ---
 * Description of file contents
 *****************************************************************************/

import java.util.Scanner;		// Probably only needed for the command line interface
import java.util.ArrayList;

/******************************************************************************
 * Summary sentence.
 * Full description.
 * 
 * @author Cody Brock
 * @author Brandon Hernandez
 * @author Cooper McDonald
 ******************************************************************************/
public class Format_O_Tron {
	
	//// Class Variables //////////////////////////////////////////////////////
	
	private String inFilename;
	private String outFilename;
	private ArrayList<String> inLines;
	private ArrayList<String> outLines;
	private ArrayList<String> errors;

	//// Constructors /////////////////////////////////////////////////////////
	
	public Format_O_Tron() {
		this.inFilename = "";
		this.outFilename = "";
		this.inLines = new ArrayList<String>();
		this.outLines = new ArrayList<String>();
		this.errors = new ArrayList<String>();
		//potentially GUI startup stuff?
	}
	
	//// Methods //////////////////////////////////////////////////////////////
	
	/**************************************************************************
	 * Guides the overall function of the program.
	 * Starts the program, initializing the GUI and local variables. Checks for
	 * user input and calls the appropriate methods to enact the actual core
	 * functionality, such as file read/write, tag interpretation, etc.
	 *************************************************************************/
	public void mainLoop() {
		
		
		Scanner ui = new Scanner(System.in); // only needed for text version
		
		boolean quit = false;
		while(quit == false) {
			//potentially GUI update stuff?
			
			String option = getInput(ui); // param only needed for text version
			
			switch(option) {
				case "open":
					this.inFilename = getFilename(ui);
					this.errors.add(open(this.inFilename));
					break;
				case "save": 
					this.inFilename = getFilename(ui);
					this.errors.add(save(this.outFilename));
					break;
				case "exit": 
					quit = true;
			}
		}
		//potentially GUI end stuff?
		System.out.println("EXIT");		
	}
	
	
	/**************************************************************************
	 * Gets user input from clicks in the GUI.
	 * 
	 * @param	?			?
	 * @return	command		String reflecting user selection
	 *************************************************************************/
	private String getInput() {
		//placeholder code so this thing will compile
		System.out.println("getInput");
		return "getInput()";
	}
	
	/**************************************************************************
	 * Alternate version of getInput for command line interface
	 * 
	 * @param	ui			Scanner object to get keyboard input
	 * @return	command		String reflecting user selection
	 *************************************************************************/
	private String getInput(Scanner ui) {
		System.out.print(
        "+++ MAIN MENU +++\n" +
        "----------------------------------------------------\n" +
        "'open' - Open a source file\n" +
        "'save' - Save document with formatting\n" +
        "'exit' - Exit\n" +
        "----------------------------------------------------\n" +
		"Type a command and press 'ENTER' :  ");
		
		// Skipping input validation because this will be replaced with a gui
		//return ui.next().toLowerCase().strip(); // just a little format help tho
		return "";
	}
	
	/**************************************************************************
	 * Helper method for getting filenames while we don't have a gui
	 * 
	 * @param	ui			Scanner object to get keyboard input
	 * @return	filename	String of a filename to act upon
	 *************************************************************************/
	private String getFilename(Scanner ui) {
		System.out.print("Type path or filename and press 'ENTER' :  ");
		
		// Skipping input validation because this will be replaced with a gui
		return ui.next();
	}
	
	/**************************************************************************
	 * Opens the input file and reads contents to list of lines (inLines).
	 * Read file at destination inFilename. Does no processing on the source
	 * text, just makes it available to display in the gui and later process
	 * into a formatted document via the save() method.
	 * 
	 * @param	filename	path to the .txt to be processed
	 * @return	error		error/success message
	 *************************************************************************/
	private String open(String filename) {
		//placeholder code so this thing will compile
		System.out.println("open");
		return "open(\"" + filename + "\")";
	}
	
	/**************************************************************************
	 * Processes inLines into a formatted document and saves them to file.
	 * Formatting tags are recognized using a helper method and necessary
	 * formatting is applied to content lines. Processed lines are saved to new
	 * .txt file at outFilename
	 * 
	 * @param	filename	path to write new .txt with formatted document
	 * @return	error		error/success message
	 *************************************************************************/
	private String save(String filename) {
		//placeholder code so this thing will compile
		System.out.println("save:");
		return "save(\"" + filename + "\")";
	}

}
