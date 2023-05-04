object to_ascii_obj {
    def main(args: Array[String]) : Unit = {
        val x = scala.io.StdIn.readChar();
        printf("char of x is :: %c, while ascii is :: %d.", x, x.asInstanceOf[Int]);
    }
}