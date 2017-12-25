package Model;

import java.util.ArrayList;

public class Requirement {
    private String name;
    private ArrayList<Testcase> tests;

    public Requirement(String name) {
        this.name = name;

        tests = new ArrayList<Testcase>();
    }


    public void addTestcase(Testcase testcase) {
        tests.add(testcase);
        }

    public ArrayList<Testcase> getTests() {
        return tests;
    }

    public String getName() {
        return name;
    }


    public String toString(){
        String json = " \"name\" : \"" + name + "\"";


        return "";
    }

}
