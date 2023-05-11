object remove_duplicates {
    def main(args: Array[String]): Unit = {
        var list = List[Int]();

        printf("Enter elements to add to the list (integers), and press X to quit.\n");
    
        var quit = false;
        while (!quit) {
            val c = scala.io.StdIn.readLine();
            if (c(0) == 'X') {
                quit = true;
            }
            else {
                list = c.toInt :: list;
            }
        }

        println("Unique elements :: ");
        list = list.distinct;

        for (elem <- list) {
            printf("%d ", elem);
        }

    }
}