public class ProjectAllocation {
    private int[][] hours;

    public ProjectAllocation(int[][] initialData) {
        this.hours = new int[initialData.length][initialData[0].length];
        for (int i = 0; i < initialData.length; i++) {
            for (int j = 0; j < initialData[i].length; j++) {
                this.hours[i][j] = initialData[i][j];
            }
        }
    }

    public void displayEmployeeReport() {
        System.out.println("Employee-wise Working Hours Report:");
        System.out.println("\tP1\tP2\tP3");
        for (int i = 0; i < hours.length; i++) {
            System.out.print("Employee E" + (i + 1) + "\t");
            for (int j = 0; j < hours[i].length; j++) {
                System.out.print(hours[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void calculateEmployeeTotal() {
        System.out.println("Expected Calculations:");
        for (int i = 0; i < hours.length; i++) {
            int total = 0;
            for (int j = 0; j < hours[i].length; j++) {
                total += hours[i][j];
            }
            System.out.println("• Employee E" + (i + 1) + " Total: " + total + " hours");
        }
    }

    public void generateProjectReport() {
        int rows = hours.length;
        int cols = hours[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = hours[i][j];
            }
        }

        System.out.println("Expected Project-wise Report (Transpose):");
        System.out.println("\tE1\tE2\tE3\tE4");
        for (int i = 0; i < transpose.length; i++) {
            System.out.print("Project P" + (i + 1) + "\t");
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void calculateProjectTotal() {
        int cols = hours[0].length;
        for (int j = 0; j < cols; j++) {
            int total = 0;
            for (int i = 0; i < hours.length; i++) {
                total += hours[i][j];
            }
            System.out.println("• Project P" + (j + 1) + " Total: " + total + " hours");
        }
    }

    public void findMostWorkedProject() {
        int cols = hours[0].length;
        int maxHours = -1;
        int mostWorkedProjectIndex = -1;

        for (int j = 0; j < cols; j++) {
            int total = 0;
            for (int i = 0; i < hours.length; i++) {
                total += hours[i][j];
            }
            if (total > maxHours) {
                maxHours = total;
                mostWorkedProjectIndex = j;
            }
        }
        System.out.println("• Most Worked Project: P" + (mostWorkedProjectIndex + 1));
    }

    public static void main(String[] args) {
        int[][] sampleData = {
                { 20, 15, 10 },
                { 12, 18, 14 },
                { 25, 10, 20 },
                { 15, 22, 12 }
        };

        ProjectAllocation system = new ProjectAllocation(sampleData);

        system.displayEmployeeReport();
        system.generateProjectReport();
        system.calculateEmployeeTotal();
        system.calculateProjectTotal();
        system.findMostWorkedProject();
    }
}