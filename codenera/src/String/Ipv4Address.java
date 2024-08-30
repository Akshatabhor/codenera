/*14. Write a program that takes in a string and checks if it is a valid IPv4 address.*/

package String;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Ipv4Address 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter an IPv4 address: ");
        String ipAddress = scanner.nextLine();
        
        boolean isValid = isValidIPv4(ipAddress);
        
        if (isValid) 
        {
            System.out.println("The IPv4 address is valid.");
        } 
        else
        {
            System.out.println("The IPv4 address is not valid.");
        }
        
        
    }
    
    public static boolean isValidIPv4(String ipAddress)
    {
        if (ipAddress == null || ipAddress.isEmpty()) 
        {
            return false;
        }
        
        String ipv4Regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        
        Pattern pattern = Pattern.compile(ipv4Regex);
        
        Matcher matcher = pattern.matcher(ipAddress);
        
        if (!matcher.matches()) 
        {
            return false;
        }
        
        String[] octets = ipAddress.split("\\.");
        for (String octet : octets) {
            int num = Integer.parseInt(octet);
            if (num < 0 || num > 255) {
                return false;
            }
        }
        
        return true;
    }
}

