object common_elements_in_array {
    def main(args: Array[String]): Unit = {
        var array1 = Array[String]("Hello", "Byte", "Bye", "ABC");
        var array2 = Array[String]("Byte", "ABC", "XXE", "CLS");

        array1 = array1.sorted;
        array2 = array2.sorted;

        var common_elements = List[String]();

        var i = 0;
        var j = 0;

        while (i < array1.length && j < array2.length) {
            if (array1(i) == array2(j)) {
                common_elements = array1(i) :: common_elements;
                i += 1;
                j += 1;
            }
            else if (array1(i) < array2(j)) {
                i += 1;
            }
            else {
                j += 1;
            }
        }

        println("Common elements :: ");
        for (elem <- common_elements) {
            printf("%s ", elem);
        }
    }
}