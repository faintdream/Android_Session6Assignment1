/*
 Declare and initialize an integer array of size 10.
Fill it with only prime numbers. (step-1) Create another integer array of size
10 and copy the values of first array into second array in the reverse order
    and print them. (step-2)
 */
package arraydemo;

public class Prime {

    int[] prime = new int[10];
    int[] revPrime = new int[10];
    int i;
    int j;
    int index;
    int revindex = 9;
    boolean isPrime;
//    int temp;
//    int k;

    void setPrime() throws ArrayIndexOutOfBoundsException {
        try {
            for (i = 2; i < 100; i++) {     // knowing that our prime number array is just 10 positions
                // long, let's look for prime numbers upto 100
                isPrime = true;             // setting isPrime boolean variable to true

                for (j = 2; j < i; j++) {  // since we want to ignore 0 and 1 we start 
                    // loop j with 2 and we go upto i-1 

                    if (i % j == 0) {          // if i modulus j is equal to 0 we know that given number 
                        // is not prime
                        isPrime = false;       // mark isPrime false and break out of current instance of
                        //loop
                        break;
                    }
                }
                if (isPrime) {                   // once j loop is over we check if isPrime is true
                    if (index == prime.length) { // if so we check if index variable 
                        break;                   // is same as prime array length, if true break out of loop i
                    } else {                     //else set prime array at index position
                        prime[index] = i;
                        revPrime[revindex] = i;
//                      temp = prime[index];
                    }

                    index++;
                    revindex--;
                }
            }

        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }

    void getPrime() throws ArrayIndexOutOfBoundsException {
        try {
            System.out.println("Prime numbers in ascending and descending order");
            for (index = 0; index < prime.length; index++) {
                System.out.println("Prime " + prime[index] + " , Reverse " + revPrime[index]);
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {

        }
    }

}
