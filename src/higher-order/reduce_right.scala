import scala.collection.mutable.ListBuffer;

 object reduce_right_obj {
    def reduce_right(func:  (Int, Int) => Int, arr: Array[Int]): Int = {
        var result = arr(arr.length - 1);

        for (i <- arr.length - 2 to 0 by -1) {
            result = func(arr(i), result);
        }
        
        return result;
    }
    def main(args: Array[String]): Unit = {
        var arr = new Array[Int](5);
        for (i <- 0 to arr.length - 1) {
            arr(i) = i+1;
        }

        val result = reduce_right((x:Int, accum: Int) => x * accum, arr);

        print(result);
        print("\n");

    }
 }