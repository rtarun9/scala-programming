object list_diff {
    def main(args: Array[String]): Unit = {
        val list1 = List[Int](1,2,3,2,1,3,4,5,3,2);
        val list2 = List[Int](1,2,3,4,3,2,1,2,88,33333);

        var diff = List[Int]();

        var x = 0;
        var y = 0;

        while (x < list1.length && y < list2.length) {
            diff = (list1(x) - list2(y)) :: diff;
            x += 1;
            y += 1;
        }

        while (x < list1.length) {
            diff = list1(x) :: diff;
            x += 1;
        }

        while (y < list2.length) {
            diff = list2(x) :: diff;
            y += 1;
        }

        print("Difference of list is :: ");
        diff = diff.reverse;
        
        for (elem <- diff) {
            printf("%d ", elem);
        }
    }
}