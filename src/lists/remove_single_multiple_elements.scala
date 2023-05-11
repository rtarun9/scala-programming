object remove_single_multiple_elements {

    def main(args: Array[String]): Unit = {
    
    var list = List[Int]();
    list = 1 :: 2 :: 3 :: 4 :: 5 :: 6 :: list;
    println(list);

    println("Removing single element from list (5).");
    println(list.diff(List[Int](5)));

    println("Removing multiple elements from list(1,2,3,4,5)");
    println((list.diff(List(1,2,3,4,5))));
    }
}
