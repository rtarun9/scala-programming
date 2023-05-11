object check_num_status {
    def main(args: Array[String]): Boolean = {
        printf("Enter X :: ");
        val x = scala.io.StdIn.readInt();

        printf("Enter Y :: ");
        val y = scala.io.StdIn.readInt();

        if (x+y > 30 || x == 30 || y == 30) {
            printf("True.\n");
            return true;
        }
        else {
            printf("False.\n");
            return false;
        }
    }
}