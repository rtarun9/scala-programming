object typed_pattern {
    def typed_match(value: Any): Unit = {
        value match {
            case l: List[Int] => print("A list o length of ints ", l.length, "\n");
            case x: List[String] => print("A list o length of strings ", x.length, "\n");
            case s: String => print("String whhose uppercase is ", s.toUpperCase, "\n");
            case _ => print("Wild card\n");
        }
    }

    def main(args: Array[String]): Unit = {
        typed_match("helloABFsdfsfksd;kfjEEEE");
        typed_match(List(333,333,333));
        typed_match(323434.0);
        typed_match(List("a", "b", "c", "d"));
    }
}