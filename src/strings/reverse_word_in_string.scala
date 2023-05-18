object reverse_word_in_string_obj {
    def main(args: Array[String]): Unit = {
        print("Enter the input string :: ");
        var input_string = scala.io.StdIn.readLine();

        print("The string after reversing all words is :: " + reverse_words_in_string(input_string));
    }

    def reverse_words_in_string(input_string: String) : String = {
        var words_in_string = input_string.split(" ");

        var result = new String();
        for (word <- words_in_string) {
            result = result + reversed_word(word) + " ";
        }

        result;
    }

    def reversed_word(word: String) : String = {
        var result = new String();

        for (i <- word.length - 1 to 0 by -1) {
           result = result + word(i);
        }

        result;
    }
}