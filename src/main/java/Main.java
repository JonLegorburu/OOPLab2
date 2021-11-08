import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        System.out.println("HELLO WORLD");
        Task task1,task2,task3;
        task1= new Task("name1","description1", Task.TaskCategory.cat1, LocalDateTime.of(2021,11,15,0000,0));
        task2= new Task("name2","description2", Task.TaskCategory.cat2, LocalDateTime.of(2021,11,15,0000,0));
        task3= new Task("name3","description3", Task.TaskCategory.cat3, LocalDateTime.of(2021,11,15,0000,0));

        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);
    }

}
