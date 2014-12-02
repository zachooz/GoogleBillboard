import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GoogleBillboard extends PApplet {

public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  
int start;

public void setup(){
	size(500,500);
	start=0;
}


public void draw(){
	String sDig = e.replace(".", "").substring(start, start+10);
	Long primeNum = Long.parseLong(sDig);
	if(isPrime(primeNum)){
		noLoop();
		System.out.println("Found prime! " + primeNum);
	} else {
		System.out.println(sDig);
		start++;
	}
}

public boolean isPrime(Long num){
    if(num<=1)
      return false;
    for(int i = (int) (Math.sqrt(num)); i>1; i--)
      if(num%i==0)
        return false;
  return true;
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GoogleBillboard" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
