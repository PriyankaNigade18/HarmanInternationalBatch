package com.Basics;

public class JavaOperators {

	public static void main(String[] args)
	{
		// Arithmetic operator
		int a=20,b=10;
		System.out.println("Addition is: "+(a+b));
		System.out.println("Subtraction is: "+(a-b));
		System.out.println("Multiplication is: "+(a*b));
		System.out.println("Division is: "+(a/b));
		System.out.println("Modulus is: "+(a%b));

	//unary operator ++(increment) --(decrement)
		/*
		 * post increment 
		 * a++
		 * 
		 * pre increment
		 * ++a
		 * 
		 * a=a+1
		 */
		
		
		
		int x=100;
		System.out.println(x);//100
		System.out.println(x++);//100
		System.out.println(x);//101
		
		int y=200;
		System.out.println(y);//200
		System.out.println(++y);//201
		
		
		int c=67;
		int d=c++;
		System.out.println(c);//68
		System.out.println(d);//67
		
		int l=90;
		int m=++l;
		System.out.println(l);//91
		System.out.println(m);//91
		
		
		//decrement a-- = a=a-1
		
		int u=687;
		System.out.println(u);//687
		System.out.println(u--);//687
		System.out.println(u);//676;
		
		
		int i=978;
		System.out.println(i);//978
		System.out.println(--i);//977
		
		
		//Relation
		//l=m=91  i=977  c=68 d=67
		
		System.out.println(c>d);//true
		System.out.println(l>d);//true
		System.out.println(l>m);//false
		System.out.println(m<i);//true
		System.out.println(l==m);//true
		System.out.println(m==c);//false
		System.out.println(m!=c);//true
		
		System.out.println(m>=l);//true
		System.out.println(c<=d);//false
		
		//Logical operator
		/*
		 * a b     a&&b        a||b     !a
		 * t t      t			t		f
		 * t f      f			t		f
		 * f t      f			t		t	
		 * f f      f			f		t
		 * 
		 * 
		 */
		
		System.out.println(m>=l && m<i);//true
		System.out.println(m<i && c<d);//false
		System.out.println(l==c && l==m);//false
		System.out.println(d>c && c>m); //false
		
		System.out.println("********************");
		
		System.out.println(m>=l || m<i);//true
		System.out.println(m<i ||c<d);//true
		System.out.println(l==c || l==m);//true
		System.out.println(d>c && c>m); //false
		
		
		//Not operator (!)
		System.out.println(c>d);//true
		System.out.println(!(c>d));//false
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
