object palindrome {
    def main(args: Array[String]): Unit = {
        var lists = List[Int]();

        printf("Enter elements to add to the list (integers), and press X to quit.\n");

        var quit = false;
        while (!quit) {
            val c = scala.io.StdIn.readLine();
            if (c(0) == 'X') {
                quit = true;
            }
            else {
                lists = c.toInt :: lists;
            }
        }

        var left = 0;
        var right = lists.length - 1;

        while (left < right) {
            if (lists(left) != lists(right)) {
                print("Not a palindrome.")
                return;
            }

            left = left + 1;
            right = right - 1;
        }

        print("List is a palindrome.");
    }
}