object max_occuring_char_in_string_obj {
    def get_max_occuring_char(input_string: String): Char = {
        // Personal note : Size of array cannot come on the LHS.
        var frequency_map: Array[Int] = new Array[Int](256);

        for (elem <- input_string) {
            frequency_map(elem) = frequency_map(elem) + 1;
        }

        var max_frequency = 0;
        var result = 'a';

        for (i <- 0 to frequency_map.length - 1) {
            if (frequency_map(i) >= max_frequency) {
                max_frequency = frequency_map(i);
                result = i.toChar;
            }
        }

        return result;
    }

    def main(args: Array[String]): Unit = {
        printf("Enter the input string : ");
        val input_string = scala.io.StdIn.readLine();

        print("Most occuring char is :: " + get_max_occuring_char(input_string));
    }
}