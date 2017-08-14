package tmp;

import java.util.Comparator;

public class ErasureTest implements Comparator<Child>{


	public int compare(Parent o1, Parent o2) {
		System.out.println(o1.getClass());
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int compare(Child o1, Child o2) {
		System.out.println(o2.getClass());
		// TODO Auto-generated method stub
		return 0;
	}

	
	
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	public static void main(String[] args) {
		ErasureTest testObj = new ErasureTest();
		System.out.println(testObj.compare(new Child(), new Child()));
	}
	

	

}

class Parent {
	
}

class Child extends Parent {
	
}

class GrandChild extends Child {
	
}
