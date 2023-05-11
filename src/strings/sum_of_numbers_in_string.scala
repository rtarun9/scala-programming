object sum_of_numbers_in_string_obj {
    def main(args: Array[String]): Unit = {
        printf("Enter the string :: ");
        val input_string = scala.io.StdIn.readLine();

        var current_number_start_idx = -1;
        var current_number_end_idx = 0;
        
        var sum = 0;

        for (i <- (0 to input_string.length-1)) {
            println("!!" + input_string(i));
            if (input_string(i) >= '0' && input_string(i) <= '9') {
                if (current_number_start_idx == -1) {
                    current_number_start_idx = i;
                    current_number_end_idx = i;
                    printf("--> %d.\n", current_number_end_idx);

                }
                else {
                    current_number_end_idx = current_number_end_idx + 1;
                    printf("-> %d.\n", current_number_end_idx);
                }
            } 
            else {
                if (current_number_start_idx != -1) {
                    printf("<- %d.\n", current_number_end_idx);

                    sum = sum + input_string.slice(current_number_start_idx, current_number_end_idx).toInt;
                }
                current_number_start_idx = -1;
                current_number_end_idx = -1;
            }
        }

        if (current_number_start_idx != -1 && current_number_end_idx != -1) {
            sum  = sum + input_string.slice(current_number_start_idx, current_number_end_idx).toInt;
        }

        printf("Sum of numbers in string is :: %d.\n", sum);
    }
}