package classwork;

public class FifthClass {
    public void foo() {
        int[][] bigArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int[] innerArray : bigArray) {
            System.out.print("{");
            int counter = 0;
            for (int x : innerArray) {
                if (counter < innerArray.length - 1) {
                    System.out.print(x + ",");
                } else {
                    System.out.print(x);
                }
                counter++;
            }
            System.out.print("}");
            System.out.println();
        }
    }
}

