package workbook;

import java.util.stream.IntStream;
import java.util.stream.Stream;

class Workbook {
  private static class FizzBuzzBox {
    private final int intValue;

    FizzBuzzBox(int n) {
      intValue = n;
    }

    @Override
    public String toString() {
      if (intValue % 15 == 0) {
        return "FizzBuzz";
      } else if (intValue % 5 == 0) {
        return "Buzz";
      } else if (intValue % 3 == 0) {
        return "Fizz";
      } else {
        return String.valueOf(intValue);
      }
    }
  }

  public static Stream<String> fizzbuzz(int n) {
    return IntStream.rangeClosed(1, n)
        .mapToObj(FizzBuzzBox::new)
        .map(FizzBuzzBox::toString);
  }

  public static void main(String... args) {
    fizzbuzz(100).forEach(System.out::println);
  }
}
