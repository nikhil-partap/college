public class Warehouse {

    private int[][] inventory;

    public Warehouse(int[][] inventory) {
        this.inventory = inventory;
    }

    public void displayInventory() {
        System.out.println("Warehouse Inventory Layout:");
        for (int[] row : inventory) {
            for (int section : row) {
                System.out.print(section + "\t");
            }
            System.out.println();
        }
    }

    public void getRobotVisitOrder() {
        System.out.println("Robot Visit Order:");
        if (inventory == null || inventory.length == 0) {
            return;
        }

        int top = 0;
        int bottom = inventory.length - 1;
        int left = 0;
        int right = inventory[0].length - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                System.out.print(inventory[top][i] + " ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(inventory[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(inventory[bottom][i] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(inventory[i][left] + " ");
                }
                left++;
            }
        }
        System.out.println();
    }

    public int calculateBoundaryStock() {
        if (inventory == null || inventory.length == 0) {
            return 0;
        }

        int totalBoundaryStock = 0;
        int rows = inventory.length;
        int cols = inventory[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    totalBoundaryStock += inventory[i][j];
                }
            }
        }
        return totalBoundaryStock;
    }

    public void findMaximumSection() {
        if (inventory == null || inventory.length == 0) {
            System.out.println("Inventory is empty.");
            return;
        }

        int maxStock = inventory[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < inventory.length; i++) {
            for (int j = 0; j < inventory[i].length; j++) {
                if (inventory[i][j] > maxStock) {
                    maxStock = inventory[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("Maximum stock value found: " + maxStock + " at section (" + maxRow + ", " + maxCol + ")");
    }

    public static void main(String[] args) {

        int[][] sampleGrid = {
                { 10, 20, 30, 40 },
                { 50, 60, 70, 80 },
                { 90, 100, 110, 120 },
                { 130, 140, 150, 160 }
        };

        Warehouse myWarehouse = new Warehouse(sampleGrid);

        myWarehouse.displayInventory();
        System.out.println();

        myWarehouse.getRobotVisitOrder();
        System.out.println();

        int boundaryStock = myWarehouse.calculateBoundaryStock();
        System.out.println("Total Boundary Stock: " + boundaryStock);
        System.out.println();

        myWarehouse.findMaximumSection();
    }
}