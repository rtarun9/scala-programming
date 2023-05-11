object substr_between_positions  {
    def main(args: Array[String]) = {
        printf("Enter input string :: ");
        val input_string = scala.io.StdIn.readLine();

        printf("Enter start and end indices.\n");
        val first_idx = scala.io.StdIn.readInt();
        val second_idx = scala.io.StdIn.readInt();

        print("Result :: " + input_string.slice(first_idx, second_idx));
    }
}