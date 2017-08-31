/*
  Declare an integer array of size 10. Initialize using for loop with 1 to 10,
and print all even numbers from an array.
 */
package arraydemo;

public class Even {

    int[] even = new int[10];
    int index;

    void setEven() throws ArrayIndexOutOfBoundsException {
        try {
            for (index = 1; index < 10; index++) {
                even[index] = index;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {

        }
    }

    void getEven() throws ArrayIndexOutOfBoundsException {
        try {
            System.out.println("Even Numbers :");
            for (index = 1; index < 10; index++) {
                if (even[index] % 2 == 0) {
                    System.out.print(even[index] + "  ");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("execution completed");
        }

    }

}
