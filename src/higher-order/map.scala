 object map_obj {
    def map(func: Int => Int, arr: Array[Int]): Array[Int] = {
        var result = new Array[Int](arr.length);

        for (i <- 0 to arr.length - 1) {
            result(i) = func(arr(i));
        }
        
        return result;
    }
    def main(args: Array[String]): Unit = {
        var arr = new Array[Int](5);
        for (i <- 0 to arr.length - 1) {
            arr(i) = i;
        }

        val result = map((x:Int) => x + 2, arr);

        for (elem <- result) {
            print(elem);
            print(", ");
        }
        print("\n");

    }
 }