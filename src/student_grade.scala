object student_grade_obj {
    def main(args: Array[String]) : Unit = {
        val average = scala.io.StdIn.readFloat();
        print(calculate_grade(average));
    }

    def calculate_grade(average: Float) : String = {
        val cgpa: Int = average.asInstanceOf[Int] / 10;

        cgpa match  {
            case 10 => {
                "O";
            }

            case 9 => {
                "A+"
            }

            case 8 => {
                "A";
            }

            case 7 => {
                "B+";
            }

            case 6 => {
                "C+"
            }

            case default => {
                "F"
            }
        };
    }
}