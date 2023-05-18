object is_palindrome_obj {
    def main(args: Array[String]) : Unit = {
        print("Enter the input string :: ");

        var input_string = scala.io.StdIn.readLine();

        print("Is the string a palindrome ? => " + is_palindrome(input_string));
    }

    def is_palindrome(input_string: String) : Boolean = {
        var status = true;
        for (i <- 0 to input_string.length - 1 by 1) {
            if (input_string(i) != input_string(input_string.length - 1 - i)) {
                status = false;
            }
        }

        return status;
    }
}