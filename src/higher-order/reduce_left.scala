import scala.collection.mutable.ListBuffer;

 object reduce_left_obj {
    def reduce_left(func:  (Int, Int) => Int, arr: Array[Int]): Int = {
        var result = arr(0);

        for (i <- 1 to arr.length - 1) {
            result = func(arr(i), result);
        }
        
        return result;
    }
    def main(args: Array[String]): Unit = {
        var arr = new Array[Int](5);
        for (i <- 0 to arr.length - 1) {
            arr(i) = i+1;
        }

        val result = reduce_left((x:Int, accum: Int) => x * accum, arr);

        print(result);
        print("\n");

    }
 }