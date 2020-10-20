import java.io.*;
import java.util.Scanner;

public class numColums{
	
	
	public static void main(String[] args){
		getNumColumnas();
	}

	public static void getNumColumnas(){
                int columnes=0;
		try{
		String command = "tput cols";
            	Process proc = Runtime.getRuntime().exec(command);
		BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
		columnes = Integer.parseInt(in.readLine());
		System.out.println("Numero de columnes: " + columnes);

		}catch(IOException e){
			e.printStackTrace();
		}
	}
}





// tput lines
// tput cols

