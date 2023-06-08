object factorial_obj {
    def main(args: Array[String]) = {
        print("factorial of 5 is", factorial_of_n(5));
    }

    def factorial_of_n(n: Int) : Int = {
        if (n <= 1) {
            return 1;
        }
        else {
            return n * factorial_of_n(n-1);
        }
    }
}