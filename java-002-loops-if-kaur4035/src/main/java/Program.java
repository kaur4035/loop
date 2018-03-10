public class Program {
    public static void main(String[] args)
    {
        int counter = 0;
        int sum = 0;

        // Create a Loop that includes all numbers between 0 to 100
        // You should print one per line only one of the following for each number:
            // if divisible by 5 print "wouf"
            // if divisible by 3 print "meow"
            // if divisible by 3 and 5 print "moo"
            // else print the number
        for (int x = 0; x < 100; x++)

        {
            if (x % 5 == 0)

            {

                System.out.println("WOLF");

            }

            else if (x % 3 == 0 )

            {

                System.out.println(" MEOW ");

            }


            else if (x % 3 == 0 && x % 5 == 0)

            {


                System.out.println(" MOO ");

            }



            else

            {
                System.out.println("" + x + " ");


            }

        }}}


