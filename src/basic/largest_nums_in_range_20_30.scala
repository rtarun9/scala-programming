package scala.math;

object largest_num_in_range {
    def main(args: Array[String]): Unit = {
        printf("Enter X :: ");
        var x = scala.io.StdIn.readInt();

        printf("Enter Y :: ");
        var y = scala.io.StdIn.readInt();

        if ((x < 20 || x > 30) && (y < 20 || y > 30)) {
            printf("Both X and Y out or range. 0");
            return;
        }
         
        if (x < 20 || x > 30) {
            x = 20;
        }

        if (y < 20 || y > 30) {
            y = 20;
        }

        printf("Maximum of the numbers is :: %d.\n", math.max(x, y));
    }
}