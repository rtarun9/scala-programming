object change_case_obj {
    def main(args: Array[String]) : Unit = {
        var input = scala.io.StdIn.readLine();
        println("Upper case :: "+ input.toUpperCase());
        println("Lower case :: "+ input.toLowerCase());
    }
}