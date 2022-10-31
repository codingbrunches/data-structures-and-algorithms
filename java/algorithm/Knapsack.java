class Knap {
  static int[][] cost = new int[4+1][5+1];

  public static int knapsack(int n, int W, int wm[], int vm[]) {
    for(int w=0; w<=W; w++) {
      cost[0][w] = 0;
    }

    for(int i=0; i<=n; i++) {
      cost[i][0] = 0;
    }

    for(int i=1; i<=n; i++) {
      for(int w=1; w<=W; w++) {
        if(wm[i] > w) {
          cost[i][w] = cost[i-1][w];
        }
        else {
          if (vm[i]+cost[i-1][w-wm[i]] > cost[i-1][w]) {
            cost[i][w] = vm[i] + cost[i-1][w-wm[i]];
          }
          else {
            cost[i][w] = cost[i-1][w];
          }
        }
      }
    }
    return cost[n][W];
  }

  public static void main(String[] args) {
    // element at index 0 is fake. matrix starting from 1.
    int wm[] = {0, 3, 2, 4, 1};
    int vm[] = {0, 8, 3, 9, 6};
    System.out.println(knapsack(4, 5, wm, vm));
  }
}
