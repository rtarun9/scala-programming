object seq_pattern {
    def seq_match(value: Any): Unit = {
        value match {
            case List(0, _, _) => println("Starting with 0, size of 3");
            case List(1, 2, _) => println("Starting with 1 and 2, size of 3");
            case _ => println("Wild card");
        }
    }

    def main(args: Array[String]): Unit = {
        seq_match(List(3,3,3,3,3,3,3,3));
        seq_match(List(0,3,3));
        seq_match(List(0,1,1));
        seq_match(List(1,5,5));
        seq_match(List(1,2,9999999));
    }
}