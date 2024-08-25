import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String s = br.readLine();
    	int t = Integer.parseInt(s);
    	int a, b;
    	
    	for (int i = 0; i < t; i++) {
    		s = br.readLine();
    		String arr[] = s.split(" ");
    		a = Integer.parseInt(arr[0]);
    		b = Integer.parseInt(arr[1]);
    		s = String.valueOf(a+b);
    		bw.write(s);
    		bw.newLine();
    	}
        bw.flush();
    	bw.close();
    	br.close();
    }  
}