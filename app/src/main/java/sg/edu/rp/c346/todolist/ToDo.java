package sg.edu.rp.c346.todolist;

public class ToDo {

    private String name;
    private String date;

    public ToDo(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public void setName(String x) {
        name = x;
    }

    public void setDate(String x) {
        date = x;
    }

    @Override
    public String toString() {
        return name + date;
    }
}
