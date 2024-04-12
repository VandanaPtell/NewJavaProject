package testprogram;

public class Continuebreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i=0;i<10;i++){
	System.out.println(i);
	if (i==5) {
		break;
	}
}
System.out.println("*** continue ***");
for(int i=0; i<10; i++) {
	if (i==2) {
		continue;
	}
	System.out.println(i);
	System.out.println("Good Morning");
}
	}

}
