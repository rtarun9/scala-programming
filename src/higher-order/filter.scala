import scala.collection.mutable.ListBuffer;

 object filter_obj {
    def filter(func: Int => Boolean, arr: Array[Int]): Array[Int] = {
        var result = new ListBuffer[Int]();

        for (i <- 0 to arr.length - 1) {
            if (func(arr(i)) == true) {
                result.append(arr(i));
            }
        }
        
        return result.toArray;
    }
    def main(args: Array[String]): Unit = {
        var arr = new Array[Int](50);
        for (i <- 0 to arr.length - 1) {
            arr(i) = i;
        }

        val result = filter((x:Int) => x % 2 == 0, arr);

        for (elem <- result) {
            print(elem);
            print(", ");
        }
        print("\n");

    }
 }