package ua.org.oa.kostitcina;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmail {

	public static String readMail() {
		System.out.println("¬ведите E-mail");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		return str;
	}

	public static String isValidEmail(String email) {
		Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
		Matcher m = p.matcher(email);
		if (m.matches()) {
			return "Email is valid";

		} else {
			return "Email is not valid";
		}

	}

	public static void main(String[] args) {
		System.out.println(isValidEmail(readMail()));

	}

}
