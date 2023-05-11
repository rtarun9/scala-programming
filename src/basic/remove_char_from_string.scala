object remove_char_from_string {
    def main(args: Array[String]): Unit = {
        
        printf("Enter the input string :: ");
        var input_string = scala.io.StdIn.readLine();

        printf("Enter the index of the char you want to remove :: ");
        val pos = scala.io.StdIn.readInt();

        if (pos > input_string.length) {
            printf("Invalid, index > string.length");
            return;
        }

        val first_half = input_string.slice(0, pos);
        var second_half = input_string.slice(pos+1, input_string.length);

        printf("Result :: %s.\n", first_half + second_half);
        return;
    }
}