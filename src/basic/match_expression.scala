object match_expr {
    def main(args: Array[String]) = {
        val num = 3;
        val odd = num match {
            case 1 => true;
            case 3 | 5 | 7 | 9 => true;
            case 2 => false;
            case 4 | 6 | 8 => false;
        }

        println(odd);
    }
}