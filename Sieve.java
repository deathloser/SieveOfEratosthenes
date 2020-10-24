import java.util.Scanner;

class Sieve {


  public static void sieve(int[] allNumbers) {
    System.out.println("Here is the Eratosthenes! All prime numbers in the array.");
    
    
    int primeNumberCount = 0;
    for (int p = 2; p*p <= allNumbers.length; p++) {
      
      if(allNumbers[p] != 0) 
            { 
                //Sieve! 
                for(int i = p*p; i <= allNumbers.length; i += p) 
                    allNumbers[i] = 0; 
                    
            } 
    }
    

    
    //Print New Array with Zeroes
    for (int i = 2; i < allNumbers.length; i++) {
      
      if (allNumbers[i] != 0) {
        System.out.println(allNumbers[i]);
        
        primeNumberCount++;
      }

    }
    System.out.println("The number of primes is " + primeNumberCount);

    int[] primeNumbers = new int[primeNumberCount];
    

    
  }


  public static void goldbach(int[] allNumbers) {
    
    
    

    
    //Print New Array with Zeroes
    System.out.println("Here are all even numbers in the array!");
    for (int i = 2; i < allNumbers.length; i=i+2) {
      
      if (allNumbers[i] != 0) {
        System.out.println(allNumbers[i]);
        
        
        
      }

    }
    
    

    

    
    

  }

}


public class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int arraySize;
    String input = "";
    System.out.println("Here is the sieve! Please input the array size:");
    arraySize = keyboard.nextInt();

  //create an array and fill it with numbers
  
    int[] allNumbers = new int[101];
    for (int i = 0; i < 101; i++) {
      allNumbers[i] = 0 + i;

    }
    int[] allNumbers2 = new int[101];
    for (int i = 0; i < 101; i++) {
      allNumbers2[i] = 0 + i;

    }
    //create Sieve object with sieve method algorithm
    Sieve sieve = new Sieve();
    //this method will do the sieving

    sieve.sieve(allNumbers);

    Sieve sieve1 = new Sieve();
    sieve1.goldbach(allNumbers2);
    

    
    

  }
}