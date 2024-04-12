package testprogram;

public class Controlstatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 7;
		String dayname;
		switch (day) {
		case 1:
			dayname = "Monday";
			break;
		case 2:
			dayname = "Tuesday";
			break;
		case 3:
			dayname = "Wednesday";
			break;
		case 4:
			dayname = "Thursday";
			break;
		case 5:
			dayname = "Friday";
			break;
		case 6:
			dayname = "Saturday";
			break;
		case 7:
			dayname = "Sunday";
			break;
		default:
			dayname = "invalid day";
			break;

		}
		System.out.println("This day is" + dayname);

		int number = 2;
		String num;
		switch (number) {
		case 1:
			num = "1";
			break;
		case 2:
			num = "2";
			break;

		case 3:
			num = "3";
			break;

		case 4:
			num = "4";
			break;

		case 5:
			num = "5";
			break;

		default:
			num = "Invalid";
			break;
		}
		System.out.println("This number is" + num);
	}
}
