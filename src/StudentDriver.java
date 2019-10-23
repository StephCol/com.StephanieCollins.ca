import javax.swing.*;
import java.util.ArrayList;

public class StudentDriver {
    public static void main(String[] args) {

        String name;
        int age, i =0;
        JTextArea jta = new JTextArea();

        ArrayList<UnderGrad> students = new ArrayList<>(10);

        while (JOptionPane.showConfirmDialog(null, "Would you like to add a student?") == JOptionPane.YES_OPTION){


            name = JOptionPane.showInputDialog("Enter name: ");
            age = Integer.parseInt(JOptionPane.showInputDialog("Enter age: "));
            students.add(new UnderGrad(name, age));
        }

        for(UnderGrad underGrad : students ){
            jta.append(underGrad.toString());
        }

        //String oldest = selectOldestUnderGrad(students);

        JOptionPane.showMessageDialog(null, jta , "Message", JOptionPane.INFORMATION_MESSAGE);

    }


    public String selectOldestUnderGrad(UnderGrad[] underGrads){

        UnderGrad oldest = underGrads[0];

        for(int i = 0; i>underGrads.length; i++){

            if(underGrads[i].getAge()>oldest.getAge()){
                oldest = underGrads[i];
            }
        }

        return oldest.toString();

    }



}
