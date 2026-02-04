package operators;

public class Operators {

	public static void main(String[] args) {
		
		//Arithmetic Operators
		int a=10;
		int b=20; 
		
		int sum = a+b;
		int sub = b-a;
		int mul = a*b;
		int div = b/a;
		int mod = b%a;
		int incr = a++;
		int decr = a--;
		
		//Assignment Operators
		int c=10;
		c += 3;  //c=c+3;
		c -= 4;  //c=c-4;
		c /= 5;  //c=c/5;
		c *= 3;  //c=c*3;
		c %= 6;  //c=c%6;
		
		//Relational Operators
		boolean eql = a==b;
		boolean notEql = a!=b;
		boolean grtr = a>b;
		boolean less = a<b;
		boolean grtrEql = a>=b;
		boolean lesEql = a<=b;

		//Logical Operators
		boolean isLoggedIn = true;
		boolean isAdmin = false;
		System.out.println("Logical Operators:-");
		System.out.println("A&&B:-" + (isLoggedIn && isAdmin));
		System.out.println("A||B:-"+(isLoggedIn || isAdmin));
		System.out.println("!A:-"+!isAdmin);
		System.out.println();
		
		//Bitwise Operators
		int A = 60; // 0011 1100
        int B = 13; // 0000 1101
        
        System.out.println("A & B: " + (A & B)); // 12  (0000 1100)
        System.out.println("A | B: " + (A | B)); // 61  (0011 1101)
        System.out.println("A ^ B: " + (A ^ B)); // 49  (0011 0001)
        System.out.println("~A: " + (~A)); // -61  (1100 0011 in 2's complement)
        System.out.println("A << 2: " + (A << 2)); // 240 (1111 0000)
        System.out.println("A >> 2: " + (A >> 2)); // 15  (0000 1111)
        System.out.println("A >>> 2: " + (A >>> 2)); // 15  (0000 1111)
        System.out.println();

        //Ternary Operators
        int result;

        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("Max of three numbers = "+ result);
        
        //Unary Operators  a=10, b=20

        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));
	}

}
