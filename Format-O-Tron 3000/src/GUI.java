import org.eclipse.swt.*;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Button;

public class GUI extends Composite {

	
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
		super(parent, style);
		setLayout(new GridLayout(3, false));
		new Label(this, SWT.NONE);
		
		Label lblSourceFile = new Label(this, SWT.NONE);
		lblSourceFile.setText("Source File:");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		ScrolledComposite scrolledComposite = new ScrolledComposite(this, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		GridData gd_scrolledComposite = new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1);
		gd_scrolledComposite.heightHint = 162;
		gd_scrolledComposite.widthHint = 415;
		scrolledComposite.setLayoutData(gd_scrolledComposite);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		new Label(this, SWT.NONE);
		
		Composite composite = new Composite(this, SWT.NONE);
		GridData gd_composite = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_composite.widthHint = 335;
		gd_composite.heightHint = 24;
		composite.setLayoutData(gd_composite);
		
		Button btnOpen = new Button(this, SWT.NONE);
		GridData gd_btnOpen = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_btnOpen.widthHint = 100;
		btnOpen.setLayoutData(gd_btnOpen);
		btnOpen.setText("Open");
		new Label(this, SWT.NONE);
		
		Composite composite_1 = new Composite(this, SWT.NONE);
		GridData gd_composite_1 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_composite_1.widthHint = 335;
		gd_composite_1.heightHint = 25;
		composite_1.setLayoutData(gd_composite_1);
		
		Button btnSave = new Button(this, SWT.NONE);
		GridData gd_btnSave = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_btnSave.widthHint = 100;
		btnSave.setLayoutData(gd_btnSave);
		btnSave.setText("Save");
		new Label(this, SWT.NONE);
		
		Label lblErrorLog = new Label(this, SWT.NONE);
		lblErrorLog.setText("Error log:");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		ScrolledComposite scrolledComposite_1 = new ScrolledComposite(this, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		GridData gd_scrolledComposite_1 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1);
		gd_scrolledComposite_1.heightHint = 50;
		gd_scrolledComposite_1.widthHint = 415;
		scrolledComposite_1.setLayoutData(gd_scrolledComposite_1);
		scrolledComposite_1.setExpandHorizontal(true);
		scrolledComposite_1.setExpandVertical(true);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button btnExit = new Button(this, SWT.NONE);
		GridData gd_btnExit = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_btnExit.widthHint = 100;
		btnExit.setLayoutData(gd_btnExit);
		btnExit.setText("Exit");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
