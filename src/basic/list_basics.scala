import scala.collection.mutable.ListBuffer;

object list_obj {
    def main(args: Array[String]) = {
        val l1 = List(1,2,3);
        val l2 = List(4,5,6);

        println("List concatonation");
        val l3 = l1 ::: l2;

        for (elem <- l3) {
            printf("%d ", elem);
        }
    
        println("Now, using the cons operator");

        var l4 = 4 :: Nil;
        l4 = 3 :: l4;
        l4 = 2 :: l4;
        l4 = 1 :: l4;
        l4 = 0 :: l4;

        l4.foreach((x:Int) => printf("%d ", x));

        println("List buffer");
        var y = new ListBuffer[Int]();
    }
}