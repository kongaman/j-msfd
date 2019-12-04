package ck.learn.jpmfsd.a11.staticStatement;

public class Main {

	public static void main(String[] args) {
		//** without static getter for numInstance */
		System.out.println("WITHOUT static getter for numInstance\n");
		StaticTest firstInstance = new StaticTest("1st Instance");
		System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstances());
		
		StaticTest secondInstance = new StaticTest("2nd Instance");
		System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumInstances());
		
		StaticTest thirdInstance = new StaticTest("3rd Instance");
		System.out.println(thirdInstance.getName() + " is instance number " + secondInstance.getNumInstances() + " using getter for 2nd Instance");
		System.out.println(thirdInstance.getName() + " is instance number " + thirdInstance.getNumInstances() + " using getter for 3rd Instance");
		//* doesn't matter which getter you use*/
		
		
		//* better style with static getter for numInstance */
		System.out.println("\n\nWITH static getter for numInstance\n");
		StaticTest firstInstanceStatGet = new StaticTest("1st Instance Static Getter");
		System.out.println(firstInstanceStatGet.getName() + " is instance number " + StaticTest.getNumInstances());
		
		StaticTest secondInstanceStatGet = new StaticTest("2nd Instance Static Getter");
		System.out.println(secondInstanceStatGet.getName() + " is instance number " + StaticTest.getNumInstances());
		
		StaticTest thirdInstanceStatGet = new StaticTest("3rd Instance Static Getter");
		System.out.println(thirdInstanceStatGet.getName() + " is instance number " + StaticTest.getNumInstances());

	}

}
