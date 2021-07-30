import java.util.Scanner;

public class CalculatorAppSwitch {

	public static void main(String[] args) {
		
	
		boolean exit = false;
		
		while(!exit){
        Scanner sc = new Scanner(System. in );
        System.out.print("would you like to proceed?(y, n)  ");
        char response = sc.next().charAt(0);
        
        if(response=='y') {
            
		UI.renderMenu();
    	int a = UI.scanInt();
    	int b = UI.scanInt();
    	char Op=UI.scanOp();
    	int r = 0;
    	double rd=0;
    	 
//    	if(Op=='+') {
//    		r = Arithmetics.add(a, b);
//    	}
//    	if(Op=='-') {
//    		r = Arithmetics.sub(a, b);
//    	}
//    	if(Op=='*') {
//    		r = Arithmetics.mul(a, b);
//    	} 
//    	if(Op=='/') {
//    		rd = Arithmetics.div(a, b);
//    	}
    	switch(Op) {
    	case '+': r = Arithmetics.add(a, b); break;
    	case '-': r = Arithmetics.sub(a, b); break;
    	case '*': r = Arithmetics.mul(a, b); break;
    	case '/': rd = Arithmetics.div(a, b); break;
    	}
    
    	UI.renderResult(a,b,Op,r,rd);
      
    
          }else if(response=='n'){
             break;
          }
        }
	}
    
	
}

class Arithmetics{
	static int add(int a,int b) {
		return a+b;
	}static int sub(int a,int b) {
		return a-b;
	}static int mul(int a, int b) {
		return a*b;
	}static double div(int a, int b) {
		return (double)a/(double)b;
	}
}

class UI {
	static void renderMenu() {
		System.out.println("----------------------------------");
		System.out.println("-----------Calculator-------------");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		System.out.println("---------Insert-Numbers-----------");
		System.out.println("-------And-choose-options:--------");
		System.out.println("-----------|+,-,/,*|--------------");
		System.out.println("----------------------------------");
	}
	static int scanInt() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter value: ");
		int value = in.nextInt();
		return value;
	}
	static char scanOp() {
		Scanner in = new Scanner(System.in);
		System.out.print("Choose operation(+,-,/,*): ");
		char Op = in.next().charAt(0);
		return Op;
	}
	static void renderResult(int a, int b,char Op, int r, double rd) {
		
		if(Op=='/') {
			System.out.println(a + " " + Op + " " + b + "  =  " + rd);
		}else {
			System.out.println(a + " " + Op + " " + b + "  =  " + r);
		}
	}
}	

