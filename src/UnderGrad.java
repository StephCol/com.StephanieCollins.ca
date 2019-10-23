import javax.swing.*;

public class UnderGrad extends Student {

    private String[] subjects = new String[10];
    private String category;

    public UnderGrad(){ this("Unknown", 0); }

    public UnderGrad(String name, int age){
        super(name, age);
        setSubjects();
        setCategory("Full-time");
    }

    public void setSubjects(){

        String subject=" ";
        int i =0;

        while (!subject.equals("") && i<=9){

            if(i==10){
                JOptionPane.showMessageDialog(null,"You have entered the max amount of subjects");
            }
            else
            subject = JOptionPane.showInputDialog("Please enter a subject: ");

            if(!subject.equals(""))
            subjects[i] = subject;
            i++;

        }
    }

    public String getSubjects(){

        String listSubjects = "";

        for(int i = 0; i<subjects.length;i++){

            String subject = subjects[i];

            if(subject != (null))
            listSubjects += subjects[i] + ", ";

        }

        return listSubjects;
    }



    public void setCategory(String category){ this.category = category;}
    public String getCategory() { return category;}

    public String toString(){

        return super.toString() + String.format("Subjects: %s\nCategory %s\n\n", getSubjects(), getCategory());

    }








}
