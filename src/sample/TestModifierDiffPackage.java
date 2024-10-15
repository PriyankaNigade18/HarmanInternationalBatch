package sample;

import com.OOP.Inheritance.AccessModifierTest;

public class TestModifierDiffPackage extends AccessModifierTest
{

	public static void main(String[] args)
	{
		AccessModifierTest a1=new AccessModifierTest();
		System.out.println(a1.name);
		
		TestModifierDiffPackage t1=new TestModifierDiffPackage();
		System.out.println(t1.acno);
		System.out.println(t1.name);
				

	}

}
