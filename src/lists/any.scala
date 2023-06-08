import scala.collection.mutable.ListBuffer

object any_obj {
    def main(args: Array[String]): Unit = {
        var x = false
        val list = new ListBuffer[Any]()
        while (!x)
        {
            val input = scala.io.StdIn.readLine("input\n").stripLineEnd
            if (input != "end") list += input
            else {
                x = true;
                println(list);
            }
        }
    }
}