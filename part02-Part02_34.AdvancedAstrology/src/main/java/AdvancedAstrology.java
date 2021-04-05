
public class AdvancedAstrology {

    public static void printStars(int number) {
        for(int i = 0; i < number; i++){
            System.out.print("*");
            
        }
        System.out.print("\n");
    }

    public static void printSpaces(int number) {
        for(int i = 0; i < number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        
        for( int i = 1, j = size-1; i <= size; i++, j-- ){
            printSpaces(j);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        for( int j = height-1, i = 1; j >= 0 ; j--, i=i+2){
            printSpaces(j);
            printStars(i);
        }
        for (int t = 0; t <2; t++){
            printSpaces(height-2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
