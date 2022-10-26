class Helpers
{
  public static void clearConsole()
  {
    //For ReplIt
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
  
  public static void printArray(int[] arr) {
    for (int n : arr) {
      System.out.print(n + " ");
    }
    System.out.println();
  }
  public static int randBetween(int start, int bound) {
    return (int) (Math.random() * (bound - start) + start);
  }
    public static int indexOf(int[] list, int numToFind) {
    for (int i = 0; i < list.length; i++) {
      if (list[i] == numToFind)
        return i;
    }
    return -1;
  }
}
