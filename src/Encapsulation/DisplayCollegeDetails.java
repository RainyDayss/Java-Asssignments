import java.util.ArrayList;

class CollegeDetails {
    private String collegeName;
    private ArrayList<String> departmentName = new ArrayList<String>();

    public ArrayList<String> getDepartmentName() {
        return departmentName;
    }


    public String getCollegeName() {
        return collegeName;
    }


    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setDepartmentName(ArrayList<String> departmentName) {
        this.departmentName = departmentName;
    }


}

public class DisplayCollegeDetails {

    public static void main(String[] args) {
        CollegeDetails col1 = new CollegeDetails();
        CollegeDetails col2 = new CollegeDetails();
        CollegeDetails col3 = new CollegeDetails();
        CollegeDetails col4 = new CollegeDetails();
        CollegeDetails col5 = new CollegeDetails();
        ArrayList<String> departmentName = new ArrayList<String>();
        departmentName.add("CS");
        departmentName.add("MECH");
        departmentName.add("ECE");
        departmentName.add("EEE");
        departmentName.add("AERO");
        departmentName.add("AUTO");
        departmentName.add("EI");
        col1.setCollegeName("National Engineering College");
        col1.setDepartmentName(departmentName);
        System.out.println("The college name is" + col1.getCollegeName());
        System.out.println("and it contains the following departments" + col1.getDepartmentName());
        col2.setCollegeName("St Xaviers College");
        System.out.println("The college name is" + col2.getCollegeName());
        System.out.println("and it contains the following departments" + col1.getDepartmentName());
        col3.setCollegeName("PET Engineering College");
        System.out.println("The college name is" + col3.getCollegeName());
        System.out.println("and it contains the following departments" + col1.getDepartmentName());
        col4.setCollegeName("SCAD College of Engineering & Technology,");
        System.out.println("The college name is" + col4.getCollegeName());
        System.out.println("and it contains the following departments" + col1.getDepartmentName());
        col5.setCollegeName("Francis Xavier Engineering College");
        System.out.println("The college name is" + col5.getCollegeName());
        System.out.println("and it contains the following departments" + col1.getDepartmentName());

    }
}