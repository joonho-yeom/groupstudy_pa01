import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
	
	private final static String [] DSBOX_OP = {"submit", "get_top", "get_bottom", "view_top", "view_bottom", "size"};
	
	
	private static void printFunc( String op, String elem){
		if(elem == null)
			System.out.println("Box is empty");
		else
			System.out.println(op + elem);
	}
	
	public static void main(String[] args) {
		
		DSBox dSBox = new DSBox();
		
		try {
			String buf;
			BufferedReader bfrd = new BufferedReader(new FileReader("input.txt"));
			//BufferedWriter bfwt = new BufferedWriter(new FileWriter("output.txt"));
			
			/*File read and execution*/
			while( (buf = bfrd.readLine()) != null){
				String elem = null;
				
				if( buf.contains(DSBOX_OP[0])){ //submit
					String document = buf.split(" ")[1];
					dSBox.submit(document);
					System.out.println("SUBMIT : " + document);
				}else if( DSBOX_OP[1].equals(buf)){ //get top
					elem = dSBox.get_top();
					printFunc("GET-TOP : ", elem);	
				}else if( DSBOX_OP[2].equals(buf)){ //get bottom
					elem = dSBox.get_bottom();
					printFunc("GET-BOTTOM : ", elem);
				}else if( DSBOX_OP[3].equals(buf)){ //view top
					elem = dSBox.view_top();
					printFunc("TOP : " , elem);
				}else if( DSBOX_OP[4].equals(buf)){ //view bottom
					elem = dSBox.view_bottom();
					printFunc("BOTTOM : ", elem);
				}else if( DSBOX_OP[5].equals(buf)){ //size
					System.out.println("CURRENT SIZE : " + dSBox.size());
				}else{
					System.out.println("Unknown operation");
				}
					
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
	}
}
