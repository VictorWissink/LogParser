package Model;

public class Testcase {
    private String name, stacktrace;

    public Testcase(String name) {
        this.name = name;

    }

    public void addStacktrace(String stacktrace) {
        this.stacktrace = stacktrace;
    }


    public String toString() {
        String json = " \"name\" : \"" + name + "\"";

        if(stacktrace != null) {
          String stacktrace =  " \"exception\" : \"" + stacktrace + "\"";
        }

        return "";
    }

}
