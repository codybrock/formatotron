import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Button;

public class GUI extends Composite {

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
		
		// Label for "Source File"
		Label lblSourceFile = new Label(this, SWT.NONE);
		lblSourceFile.setText("Source File:");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		// Base container for input file before formatting. This should not be changed and will contain the input file label
		ScrolledComposite scrolledComposite = new ScrolledComposite(this, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		GridData gd_scrolledComposite = new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1);
		gd_scrolledComposite.heightHint = 162;
		gd_scrolledComposite.widthHint = 415;
		scrolledComposite.setLayoutData(gd_scrolledComposite);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		// Label that will be containing input file txt
		Label lblOutputHere = new Label(scrolledComposite, SWT.NONE);
		lblOutputHere.setText("Output here");
		scrolledComposite.setContent(lblOutputHere);
		scrolledComposite.setMinSize(lblOutputHere.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		new Label(this, SWT.NONE);
		
		// Base container for open file label. Do not change
		ScrolledComposite scrolledComposite_2 = new ScrolledComposite(this, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		GridData gd_scrolledComposite_2 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_scrolledComposite_2.heightHint = 3;
		gd_scrolledComposite_2.widthHint = 315;
		scrolledComposite_2.setLayoutData(gd_scrolledComposite_2);
		scrolledComposite_2.setExpandHorizontal(true);
		scrolledComposite_2.setExpandVertical(true);
		
		// Label that will contain the open filename
		Label lblOpenFilename = new Label(scrolledComposite_2, SWT.NONE);
		lblOpenFilename.setText("Open filename");
		scrolledComposite_2.setContent(lblOpenFilename);
		scrolledComposite_2.setMinSize(lblOpenFilename.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		
		// Open button
		Button btnOpen = new Button(this, SWT.NONE);
		GridData gd_btnOpen = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_btnOpen.widthHint = 100;
		btnOpen.setLayoutData(gd_btnOpen);
		btnOpen.setText("Open");
		new Label(this, SWT.NONE);
		
		// Base container for save file label. Do not change
		ScrolledComposite scrolledComposite_3 = new ScrolledComposite(this, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		GridData gd_scrolledComposite_3 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_scrolledComposite_3.heightHint = 3;
		gd_scrolledComposite_3.widthHint = 315;
		scrolledComposite_3.setLayoutData(gd_scrolledComposite_3);
		scrolledComposite_3.setExpandHorizontal(true);
		scrolledComposite_3.setExpandVertical(true);
		
		// Label that will contain save filename
		Label lblSaveFilename = new Label(scrolledComposite_3, SWT.NONE);
		lblSaveFilename.setText("Save filename");
		scrolledComposite_3.setContent(lblSaveFilename);
		scrolledComposite_3.setMinSize(lblSaveFilename.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		
		// Save button
		Button btnSave = new Button(this, SWT.NONE);
		GridData gd_btnSave = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_btnSave.widthHint = 100;
		btnSave.setLayoutData(gd_btnSave);
		btnSave.setText("Save");
		new Label(this, SWT.NONE);
		
		// Label for error log
		Label lblErrorLog = new Label(this, SWT.NONE);
		lblErrorLog.setText("Error log:");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		// Base container for error log. This should not be changed and will contain the error log label 
		ScrolledComposite scrolledComposite_1 = new ScrolledComposite(this, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		GridData gd_scrolledComposite_1 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1);
		gd_scrolledComposite_1.heightHint = 50;
		gd_scrolledComposite_1.widthHint = 420;
		scrolledComposite_1.setLayoutData(gd_scrolledComposite_1);
		scrolledComposite_1.setExpandHorizontal(true);
		scrolledComposite_1.setExpandVertical(true);
		
		// Error log label. This will contain all printed errors. Label variable name: lblErrors
		Label lblErrors = new Label(scrolledComposite_1, SWT.NONE);
		lblErrors.setText("Error log here");
		scrolledComposite_1.setContent(lblErrors);
		scrolledComposite_1.setMinSize(lblErrors.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		// Exit button used for closing the program. Button variable name: btnExit
		Button btnExit = new Button(this, SWT.NONE);
		GridData gd_btnExit = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_btnExit.widthHint = 100;
		btnExit.setLayoutData(gd_btnExit);
		btnExit.setText("Exit");
		
		
		//// Action Listeners /////////////////////////////////////////////////////
		
		
		//// Open button Listener ////
		
		btnOpen.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(org.eclipse.swt.widgets.Event arg0) {
				// Actions performed once the open button is clicked
				System.out.println("Testing open button");
			}	
		});
		
		
		//// Save button Listener ////
		
		btnSave.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(org.eclipse.swt.widgets.Event arg0) {
				// Actions performed once the save button is clicked
				System.out.println("Testing save button");
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
		
		
		
	} // Ends GUI class
	
}
