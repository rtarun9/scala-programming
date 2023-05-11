object array_scala_obj {
    def main(args: Array[String]) = {
        var address: Array[String] = new Array[String](3);
        address(0) ="16/9";
        address(2) = "India";
        address(1) = "Unknown";
        printf("Hello~\n");

        for (i  <- 0 to 2) {
            println(address(i));
        }

        printf("END\n")

        for (i  <- address) {
            println(i);
        }

        printf("END\n");

        var names: Array[Int] = new Array[Int](10);

        for (i <- 0 to 9) {
            names.update(i, i * 2);
        }

        for (elem <- names) {
            printf("%d ", elem);
        }
        printf("\n");
    }
};