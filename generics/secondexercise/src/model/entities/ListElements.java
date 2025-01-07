package generics.secondexercise.src.model.entities;

public class ListElements {

    private Integer taskId;

    private String task;

    private Boolean isTaskConcluded;

    public ListElements() {}

    public ListElements ( Integer taskId, String task, Boolean isTaskConcluded ) {

        this.taskId = taskId;

        this.task = task;

        this.isTaskConcluded = isTaskConcluded;

    }

    public Integer getTaskId () {

        return taskId;

    }

    public String getTask () {

        return task;

    }

    public Boolean getIsTaskConcluded () {

        return isTaskConcluded;

    }

    @Override
    public String toString () {

        StringBuilder stringBuilder;

        stringBuilder = new StringBuilder();

        stringBuilder.append( "Id: " ).append( getTaskId() )
                .append( " Task: " ).append( getTask() )
                .append( " Concluded: " ).append( getIsTaskConcluded() );

        return stringBuilder.toString();

    }

}
