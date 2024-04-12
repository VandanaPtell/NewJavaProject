package testprogram;

public class Loopexample {

	public static void main(String[] args) {
		System.out.println("***for loop***");
for(int i=0; i<=10; i=i+2) {
	System.out.println(i);
}
for (int i=100; i>10; i--) {
	System.out.println(i);
}
for (int i=1; i<5; i++) {
	for (int j=1; j<5; j++) {
		System.out.println(i*j);
	}
}
System.out.println("***while loop***");
int i=1;
while (i<5) {
	System.out.println(i);
	i++;
}
int j=10;
while (j>2) {
	System.out.println(j);
	j--;
}
System.out.println("***do while loop***");

int k=1;
do {
	System.out.println(k);
	k++;
}while (k<10);
	}
}
