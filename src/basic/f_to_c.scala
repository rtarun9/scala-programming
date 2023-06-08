object f_to_c_obj {
    def main(args: Array[String]) = {
        val f = scala.io.StdIn.readLine("Enter the temp in F").toDouble;

        val c = (f - 32) * 5.0 / 9.0;
        println(c);
    }
}