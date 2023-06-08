object array_obj {
    def main(args: Array[String]) = {
        val arr: Array[Int] = new Array[Int](5);
        for (i <- 0 to 4) {
            arr(i) = i;
        }

        arr.foreach((x:Int) => println(x));

        val arr2 = Array(1,2,3,4,5);
        arr2.foreach((x:Int) => {println(x)});
    }
}