public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  
int start;

void setup(){
	size(500,500);
	start=0;
}


void draw(){
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

boolean isPrime(Long num){
    if(num<=1)
      return false;
    for(int i = (int) (Math.sqrt(num)); i>1; i--)
      if(num%i==0)
        return false;
  return true;
}