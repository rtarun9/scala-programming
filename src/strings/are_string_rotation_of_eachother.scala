object are_strings_rotations_obj {
    def main(args: Array[String]) = {
        printf("Enter first string :: ");
        val first_string = scala.io.StdIn.readLine();

        printf("Enter second string :: ");
        val second_string = scala.io.StdIn.readLine();

        val sum_of_strings = first_string + second_string;
        if (sum_of_strings.contains(second_string)) {
            printf("Yes, they are rotations.\n");
        }
        else {
            printf("No, they are not rotations.");
        }
    }
}