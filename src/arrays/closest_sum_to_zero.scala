object closest_sum_to_zero {
  def main(args: Array[String]): Unit = {
    var arr = Array(-3, -2, -1, 333, 444, 555, 333, -100, -22);
    arr = arr.sorted;
    
    println("Original array:");
    for (x <- arr) {
      printf("%d ", x);
    }


    var closestSum = 0;
    var minDiff = Int.MaxValue;
    var left = 0;
    var right = arr.length - 1;

    var i = 0;
    var j = 0;

    while (left < right) {
        val sum = arr(right) - arr(left);

        if (sum < minDiff) {
            minDiff = sum
            closestSum = sum
            i = left;
            j = right;
        }

        if (sum > 0) {
            right -= 1
        } else {
            left += 1
        }
    }

    println("Closest sum to zero :: " + closestSum + " with element at indices :: " + i + " " + j);
  }
} 