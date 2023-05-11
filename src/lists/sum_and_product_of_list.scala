object sum_and_product_of_list {
    def main(args: Array[String]) = {
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

        var sum = 0;
        var product = 1;

        for (elem <- lists) {
            sum = sum + elem;
            product = product * elem;
        }

        print("Sum : " + sum + " and Product : " + product);
    }
}