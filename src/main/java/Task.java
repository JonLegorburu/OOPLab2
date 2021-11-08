import java.time.LocalDateTime;

public class Task {
    private String taskName;
    private String TaskDescription;
    private enum taskCategory{
        cat1,
        cat2,
        cat3
    };

    private LocalDateTime taskDateTimeStart;
    private LocalDateTime taskDateTimeStop; //The deadline

}
