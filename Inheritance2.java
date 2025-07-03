//
//in java hybrid inheritace is not being supported and this problem is known as diamond problem.

class A{
	int i,j;
	void showij(){
		System.out.println("i and j\n"+i+" " +j); 
		//\nSystem.out.println("and j" + j);

	}
}

class B extends A{
	int k;
	void showk(){
		System.out.println("k ="+k);
	}
	void sum(){
		System.out.println("i+j+k: \n"+(i+j+k));
	}
}

class simpleinheritance{
	public static void main(String args[]){
		A shrey = new A();
		B hero = new B();
		shrey.i = 10;
		shrey.j = 200;
                 System.out.println("contents of shrey: ");
		shrey.showij();
		System.out.println();
		hero.i=9;
		hero.j=8;
		hero.k=7;
		System.out.println("contents of hero: \n");
		hero.showij();
		hero.showk();
		System.out.println();
		System.out.println("sum of i, j , k in hero:");
		hero.sum();
		
	}
}
