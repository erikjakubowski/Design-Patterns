package composite.pattern;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ITeacher {

    private String teacherName;
    private String deptName;
    private List<ITeacher> controls;


    public Teacher(String teacherName, String deptName) {
        this.teacherName = teacherName;
        this.deptName = deptName;
        controls = new ArrayList<ITeacher>();
    }

    public void Add(ITeacher iTeacher){
        controls.add(iTeacher);
    }

    public void Remove(ITeacher iTeacher){
        controls.remove(iTeacher);
    }

    public List<ITeacher> getControlsDept(){
        return controls;
    }


    @Override
    public String getDetails() {
        return (teacherName + " is the  " + deptName);
    }

}
