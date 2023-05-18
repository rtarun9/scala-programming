object sum_of_numbers_in_string_obj {
    def main(args: Array[String]) : Unit = {
        print("Enter input string :: ");
        var input_string = scala.io.StdIn.readLine();

        print("Sum of numbers that are embedded within this string is :: " + sum_of_numbers_in_string(input_string));
    }
    
    def sum_of_numbers_in_string(input_string: String) : Int = {
        var sum = 0;
        var current_number = 0;

        for (i <- 0 to input_string.length - 1) {
            if (input_string(i) >= '0' && input_string(i) <= '9') {
                current_number = 10 * current_number + (input_string(i).toInt - '0'.toInt);
            }
            else {
                if (current_number != 0) {
                    sum = sum + current_number;
                }
                current_number = 0;
            }
        }

        if (current_number != 0) {
            sum = sum + current_number;
        }

        return sum;
    }
}