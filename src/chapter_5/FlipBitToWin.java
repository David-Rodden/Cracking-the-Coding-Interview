package chapter_5;

/**
 * Problem 5.3
 * You have an integer and you can flip exactly one bit from a 0 to a 1.
 * Write code to find the length of the longest sequence of 1s you could create.
 * EXAMPLE:
 * Input: 1775 (or: 11011101111)
 * Output: 8
 */

class FlipBitToWin {
  private static int INT_BYTE_SIZE = 4;
  static int flip(int input) {
    if(~input == 0) return 8 * INT_BYTE_SIZE;
    int previous = 0, current = 0, maximum = 0;
    while(input != 0){
      if((input & 1) == 0) {
        previous = (input & 2) == 0 ? 0 : current;
        current = 0;
      } else current++;
      maximum = Math.max(previous + current, maximum);
      input >>= 1;
    }
    return maximum + 1;
  }
}
