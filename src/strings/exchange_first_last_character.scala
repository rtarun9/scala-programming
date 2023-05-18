object exchange_first_last_character_obj {
    def main(args: Array[String]) : Unit = {
        print("Enter the input string :: ");
        var input_string: String = scala.io.StdIn.readLine();

        print("After exchanging the first and last character, the new string is :: \n" + exchange_first_last_char(input_string));
    }

    def exchange_first_last_char(input_string: String) : String = {
        var words: Array[String] = input_string.split(" ");

        var result: String = new String();
        for (word <- words) {
            if (word.length > 1) {
                var new_word = word(word.length - 1).toString + word.slice(1,word.length-1) + word(0).toString;
                result = result + new_word + " ";
            } else {
                result = result + word + " ";
            }
        }

        return result;
    }
}