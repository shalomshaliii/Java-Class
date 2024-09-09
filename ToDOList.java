import java.util.Scanner;
import java.util.ArrayList;

public class ToDOList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<Boolean> taskstatus = new ArrayList<>();
        Scanner obj = new Scanner(System.in);
        while (true) {
            System.out.println("1.Add Tasks");
            System.out.println("2. view Tasks");
            System.out.println("3. Mark as Done");
            System.out.println("4. Quit");
            System.out.println("Enter your choice");
            int choice = obj.nextInt();
            if (choice == 1) {
                System.out.println("Add your tasks");
                String task = obj.next();
                tasks.add(task);
            } else if (choice == 2) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks available");

                } else {
                    for (String task : tasks) {
                        System.out.println(task);
                    }
                }

            } else if (choice == 3) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks available.");
                    break;
                }
                System.out.println("Tasks:");
                ArrayList<String> taskStatus;
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println(
                            (i + 1) + ". " + tasks.get(i) + " - " + (taskStatus.get(i) != null ? "Done" : "Not Done"));
                }
                System.out.print("Enter the task number to mark as done: ");
                int doneTaskNumber = obj.nextInt();
                if (doneTaskNumber > 0 && doneTaskNumber <= tasks.size()) {
                    // taskStatus.set(doneTaskNumber - 1, true);
                    System.out.println("Task marked as done.");
                } else {
                    System.out.println("Invalid task number.");
                }
                break;
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("invalid choice");
            }
        }

    }
}
