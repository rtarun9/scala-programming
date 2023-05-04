import scala.collection.mutable.ListBuffer;

object obj {
    def main(args: Array[String]): Unit = {
        val student_count = scala.io.StdIn.readInt();

        var marks: ListBuffer[Float] = ListBuffer();

        for (i <- 0 to student_count - 1) {
            marks += (scala.io.StdIn.readFloat());
        }

        val markList = marks.toList;

        var average_mark: Float = 0;
        for (i <- 0 to marks.length - 1) {
            average_mark = average_mark + markList(i);
        }

        printf("Average :: %f.", average_mark / student_count);
    }
}