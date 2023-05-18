import scala.collection.mutable.ListBuffer;

object intro_to_list_buffer {
    def main(args: Array[String]) : Unit = {
        var x = new ListBuffer[Int]();

        // Insertion
        for (i <- 0 to 10) {
            x.append(i);
        }

        x -= 2
        x -= 3
        x -= 6

        print(x.toList);

        x.remove(0, 3)
        print(x.toList);

        for (i <- 0 to x.length - 1) {
            x.update(i, x(i) * 10);
        }

        print(x.toList);
    }
}