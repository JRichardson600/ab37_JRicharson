/* J_Richardson_AB_37
 * Assignment -71
WAP to display system time and date.
Store day,date,month year values in String
*/

package Assignment24122023;

import java.util.Date;

public class Assignment71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();

		System.out.println("Epoch time = " + d1.getTime());// epoch time

		Date d2 = new Date(d1.getTime()+(1000*60*60*24*4));// epoch time, need to convert ...adding 4 days to todays date
		/*1000= milliseconds....60=secs...60= mins....24=hours....4 days*/

		System.out.println(d2);

		String myDate = d2.toString();

		String Day = myDate.substring(0, 3);

		System.out.println("Day = " + Day);

		String Month = myDate.substring(4, 7);

		System.out.println("Month = " + Month);

		String Date = myDate.substring(8, 10);

		System.out.println("Date = " + Date);

		String Time = myDate.substring(11, 20);

		System.out.println("Time = " + Time);

		String Year = myDate.substring(24);

		System.out.println("Year = " + Year);

	}
}
