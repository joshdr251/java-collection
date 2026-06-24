
class Battleship
{
    public static void main(String[] args)
    {
        boolean loop = true;
        int y = 0;
        int x = 0;


        int hit = 0;
        int missed_shots = - hit;
        int round = 0;

        int[][] ships =
                {
                        {1,0,0,0,0,0,0},
                        {0,1,0,0,0,0,0},
                        {0,1,0,1,1,1,0},
                        {0,0,0,0,0,0,0}
                };

        System.out.println("Welcome to Battleship...");
        System.out.println("Have fun!");

        while (loop)
        {

            y = Kon.readInt("Input y-value: ");
            x = Kon.readInt("Input x-value: ");

            if (ships [y][x] == 0)
            {
                missed_shots += 1;
                System.out.println("Into the void...");
            }

            if (ships [y][x] == 2)
            {
                System.out.println("You already hit this part!");
            }

            if (ships [y][x] == 1)
            {
                System.out.println("That is a hit!");
                hit += 1;
            }

            if (ships [y][x] == 1 && round >= 0)
            {
                ships [y][x] = 2;
            }

            if (hit == 6)
            {
                System.out.println("You win!");
                System.out.println("Missed shots: " + missed_shots);
                loop = false;
            }

            round += 1;
        }
    }
}
