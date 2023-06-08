import scala.collection.mutable.ListBuffer;

object fold_right_obj {
  def fold_right[T](func: (T, T) => T, arr: Array[T], start_value: T): Any = {
    var result = start_value

    start_value match {
        case list: List[T] => {
            var result = new ListBuffer[T];    
            for (i <- arr.length - 1 to 0 by -1) {
                result.append(arr(i));
            }

            return result.toList
        }

        case default => {
            for (i <- arr.length - 1 to 0 by -1) {
                result = func(arr(i), result)
            }

            result
        }
    }
  }

  def main(args: Array[String]): Unit = {
    val arr = new Array[Int](5);
    for (i <- 0 to arr.length - 1) {
        arr(i) = i + 1;
    }
    val result = fold_right((x: Int, accum: Int) => x * accum, arr, 1)

    println(result)

    print("\nNow, fold right but with starting value and func taking a list.\n");

    val result2 = fold_right((x: Int, accum: List[Int]) => x*3, arr, 1)

  }
}
