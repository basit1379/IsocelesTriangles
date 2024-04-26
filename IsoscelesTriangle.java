public class IsoscelesTriangle {
    public static void main(String[] args) {
        int height = 5; // Height of the triangle
        int width = (2 * height) - 1; // Width of the base
        int midPoint = width / 2; // Midpoint of the base

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j >= midPoint - i && j <= midPoint + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
