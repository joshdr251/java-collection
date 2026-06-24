
class Cash_Dispenser
{
    public static void main(String[] args)
    {
        int password = 1874;
        int balance = 1000;
        boolean check = true;

        while (check)
        {
            int user_input = Kon.readInt("Please enter your PIN: ");

            if (user_input != password)
            {
                System.out.println("This is not your PIN.");
                continue;
            }
            else
            {
                System.out.println("Your PIN is right.");
                check = false;
            }
        }

        while (balance >= 0)
        {
            int user_subtraction = Kon.readInt("Please enter how much money you want: ");
            balance -= user_subtraction;


            if (balance < 0)
            {
                System.out.println("You don't have that much money");
                balance += user_subtraction;
                continue;
            }

            System.out.println("Balance left: " + balance);
            int end = Kon.readInt("If you want to end write 1, else write 0: ");

            if (end == 1)
            {
                System.out.println("Thank you for using our Service. Goodbye!");
                break;
            }
            if (end == 0)
            {
                continue;
            }
        }

    }
}
