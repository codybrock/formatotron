import java.io.*;
import java.util.Scanner;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import java.io.File;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;


public class GUI extends Composite {
	
	//// Global Variables ///////////////////////////////////////////////////////
	private Text text;		// Text box for open 
	private Text text_1;	// Text box for save
	
	// Open and save files
	File openFile = new File("");
	File saveFile = new File("");

	
	//Scanner sc = new Scanner(openFile);
	
	/**
	 * Main method used for creating and printing a GUI. 
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(new GridLayout(1, false));
		GUI newGUI = new GUI(shell, SWT.NONE);
		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}
			
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public GUI(Composite parent, int style) {
		
		//// Setting Layout ////////////////////////////////////////////////////////
		
		super(parent, style);
		setLayout(new GridLayout(3, false));
		new Label(this, SWT.NONE);
		
		//// Labels and Composites /////////////////////////////////////////////////
		
		// Label for Source File
		Label lblSourceFile = new Label(this, SWT.NONE);
		lblSourceFile.setText("Source File:");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		// Base container for input file before formatting. This should not be changed and will contain the input file label
		ScrolledComposite scrolledComposite = new ScrolledComposite(this, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		GridData gd_scrolledComposite = new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1);
		gd_scrolledComposite.heightHint = 174;
		gd_scrolledComposite.widthHint = 425;
		scrolledComposite.setLayoutData(gd_scrolledComposite);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		// Label that will be containing input file txt
		Label lblSourceFileTxt = new Label(scrolledComposite, SWT.NONE);
		lblSourceFileTxt.setText("Source file txt");
		scrolledComposite.setContent(lblSourceFileTxt);
		scrolledComposite.setMinSize(lblSourceFileTxt.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		new Label(this, SWT.NONE);
		
		// Label that will take in text input and find file  corresponding
		text = new Text(this, SWT.BORDER);
		GridData gd_text = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_text.widthHint = 329;
		text.setLayoutData(gd_text);
		
		// Open button 
		Button btnOpen = new Button(this, SWT.NONE);
		GridData gd_btnOpen = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_btnOpen.widthHint = 90;
		btnOpen.setLayoutData(gd_btnOpen);
		btnOpen.setText("Open");
		new Label(this, SWT.NONE);
		
		// Text box that will contain output file directory
		text_1 = new Text(this, SWT.BORDER);
		GridData gd_text_1 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_text_1.widthHint = 332;
		text_1.setLayoutData(gd_text_1);
		
		// Save button
		Button btnSave = new Button(this, SWT.NONE);
		GridData gd_btnSave = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_btnSave.widthHint = 90;
		btnSave.setLayoutData(gd_btnSave);
		btnSave.setText("Save");
		new Label(this, SWT.NONE);
		
		// Error log label
		Label lblErrorLog = new Label(this, SWT.NONE);
		lblErrorLog.setText("Error log:");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		// Base container for error log text box
		ScrolledComposite scrolledComposite_1 = new ScrolledComposite(this, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		GridData gd_scrolledComposite_1 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1);
		gd_scrolledComposite_1.heightHint = 61;
		gd_scrolledComposite_1.widthHint = 427;
		scrolledComposite_1.setLayoutData(gd_scrolledComposite_1);
		scrolledComposite_1.setExpandHorizontal(true);
		scrolledComposite_1.setExpandVertical(true);
		
		// Label containing list of errors
		Label lblErrorLogHere = new Label(scrolledComposite_1, SWT.NONE);
		lblErrorLogHere.setText("Error log here");
		scrolledComposite_1.setContent(lblErrorLogHere);
		scrolledComposite_1.setMinSize(lblErrorLogHere.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		// Exit button 
		Button btnExit = new Button(this, SWT.NONE);
		GridData gd_btnExit = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_btnExit.widthHint = 90;
		btnExit.setLayoutData(gd_btnExit);
		btnExit.setText("Exit");
		
		//// Action Listeners /////////////////////////////////////////////////////
		
		//// Open button Listener ////
			
		btnOpen.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(org.eclipse.swt.widgets.Event arg0) {
				// Actions performed once the open button is clicked
				openFile = new File(text.getText());
				System.out.println(openFile);
			}	
		});
						
		//// Save button Listener ////
			
		btnSave.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(org.eclipse.swt.widgets.Event arg0) {
				// Actions performed once the save button is clicked
				saveFile = new File(text_1.getText());
				System.out.println(saveFile);
			}	
		});
						
		//// Exit button listener ////
			
		btnExit.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(org.eclipse.swt.widgets.Event arg0) {
				// Actions performed once the exit button is clicked
				System.out.println("Successfully exited");
				System.exit(0);				
			}	
		});
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
