object loops_and_args_obj {
    def main(args: Array[String]) = {
        for (i <- 0 to args.length - 1) {
            println(args(i));
        }

        println("\nUsing foreach now :)")

        args.foreach((x: String) => { println(x); print("------\n")});

        // Using for now.
        println("Using for")
        for (elem <- args) {
            println(elem)
            println("XXXXXXXX")
        }
    }
}