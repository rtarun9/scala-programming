package scala.math;

object abs_difference_with_51 {
    def main(args: Array[String]) = {
        printf("Enter the value of n :: ");
        val n = scala.io.StdIn.readInt();

        if (n > 51) {
            printf("Triple the absolute difference is :: %d.\n", math.abs(n - 51) * 3);
        }
        else {
            printf("The absolute difference of n and 51 is :: %d.\n", math.abs(n - 51));
        }
    }
}