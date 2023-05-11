object sum_of_integers_obj {
    def main(args: Array[String]) = {
        printf("Enter the value of X :: ");
        val x = scala.io.StdIn.readInt();

        printf("Enter the value of Y :: ");
        val y = scala.io.StdIn.readInt();

        if (x == y) {
            printf("As X == Y, the sum is (x+y)*3 :: %d.\n", (x+y)*3);
        }
        else {
            printf("The sum of X and Y is :: %d.\n", x+y);
        }
    }
};