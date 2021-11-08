import java.time.LocalDateTime;

public class Task {
    private String taskName;
    private String taskDescription;
    enum TaskCategory{
        cat1,
        cat2,
        cat3
    };

    private LocalDateTime taskDateTimeStart;
    private LocalDateTime taskDateTimeStop; //The deadline


    //Empty constructor
    public Task() {
    }

    //Arguments constructor

    TaskCategory taskCategory;

    public Task(String taskName, String taskDescription, TaskCategory taskCategory, LocalDateTime taskDateTimeStop) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskCategory=taskCategory;
        this.taskDateTimeStart= LocalDateTime.now();
        this.taskDateTimeStop = taskDateTimeStop;
    }

    

}
