
import java.util.Scanner; 
 
public class clark_p1 {

	public static void main(String args[]) {
			
		Scanner scnr = new Scanner(System.in);
		
		int num;
		
		
		System.out.println("Enter a 4 digit number: ");
		num = scnr.nextInt();
		
		//Isolating digits
		int firstDigit = num / 1000;
		int secondDigit = (num % 1000) / 100;
		int thirdDigit = (num % 100) / 10;
		int fourthDigit = num % 10;
		
		//Encrypting the individual digits
		firstDigit = (firstDigit + 7) % 10;	
		secondDigit = (secondDigit + 7) % 10; 	
		thirdDigit = (thirdDigit + 7) % 10;
		fourthDigit = (fourthDigit + 7) % 10;
		
		
		//Rearranging the digits and assigning them to encrypted Num
		int encryptedNum = ((thirdDigit * 1000) + (fourthDigit * 100) + (firstDigit *10) + secondDigit);
		
		if (encryptedNum < 1000)
	    {
	        System.out.printf("Encrypted number is: 0%d\n", encryptedNum);
	    }
	    else
	        System.out.printf("Encrypted number is: %d\n", encryptedNum);

		//Going into the decrypt section now 
		
		System.out.println("Enter a number to decrypt: ");
		int decryptNum = scnr.nextInt();
		
		//Isolating digits again 
		
		firstDigit = decryptNum / 1000;
		secondDigit = (decryptNum % 1000) / 100;
		thirdDigit = (decryptNum % 100) / 10;
		fourthDigit = decryptNum % 10;
		
		//Reversing the encryption scheme
		
		firstDigit = (firstDigit + 3) % 10;	
		secondDigit = (secondDigit + 3) % 10; 	
		thirdDigit = (thirdDigit + 3) % 10;
		fourthDigit = (fourthDigit + 3) % 10;
		
		int finalDecrypt = ((thirdDigit * 1000) + (fourthDigit * 100) + (firstDigit *10) + secondDigit);
		
		if (finalDecrypt < 1000)
	    {
	        System.out.printf("Decrypted number is: 0%d\n", finalDecrypt);
	    }
	    else
	        System.out.printf("Decrypted number is: %d\n", finalDecrypt);
	
		
		scnr.close();
		
		}
		
	}