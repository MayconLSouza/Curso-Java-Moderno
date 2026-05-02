import java.security.SecureRandom;
import java.util.Scanner;

public class GeradorDeSenhasSeguras
{
	private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*()_+-=[]|,./?><";

	public static String generatePassword(int length)
	{
		var randomNumberGenerator = new SecureRandom();
		var password = new StringBuilder(length);

		for(int i = 0; i < length; i++)
		{
			int index = randomNumberGenerator.nextInt(CHARACTERS.length());
			password.append(CHARACTERS.charAt(index));
		}

		return password.toString();
	}

	public static void main(String[] args)
	{
		var scanner = new Scanner(System.in);
		System.out.print("Enter the desired password length: ");
		int passwordLength = scanner.nextInt();
		String password = generatePassword(passwordLength);
		System.out.println("Password generated: " + password);
	}
}