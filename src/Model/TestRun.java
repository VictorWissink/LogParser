package Model;

import java.util.ArrayList;
import java.util.List;

public class TestRun {
    private String date;
    private int unlisted;
    private ArrayList<Requirement> requirements;

    public TestRun(String date) {
        this.date = date;
        requirements = new ArrayList<Requirement>();
    }

    public void addUnlisted() {
        unlisted++;
    }

    public ArrayList<Requirement> getRequirements() {
        return requirements;
    }

    public ArrayList<String> getAllRequirementNames() {
        ArrayList<String> allNames = new ArrayList<String>();

        for(Requirement req : requirements) {
            allNames.add(req.getName());
        }

        return allNames;
    }

    public Requirement getRequirementByName(String name) {
        for (Requirement r : requirements) {
            if (r.getName().equals(name)) {
                return r;
            }
        }
        return new Requirement(name);

    }



    public String toString() {

        return "";
    }





}
