//package bank.management.system;
//
//import com.toedter.calendar.JDateChooser;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.Random;
//
//public class Signup extends JFrame implements ActionListener {
//    JRadioButton r1,r2,r3,m1,m2,m3;
//    JButton next;
//
//    JTextField textName , textFname , textEmail, textAdd,textcity,textpin,textState ;
//    JDateChooser dataChooser;
//
//    Random ran = new Random();
//    long first4 = (ran.nextLong() % 9000L) +1000L;
//    String first = " " + Math.abs(first4);
//    Signup(){
//        super("APPLICAION FORM");
//
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
//        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(25,10,100,100);
//        add(image);
//
//        JLabel label1= new JLabel("APPLICATION FORM NO." + first);
//        label1.setBounds(160,20,600,40);
//        label1.setFont(new Font("Raleway",Font.BOLD,38));
//        add(label1);
//
//        JLabel label2 = new JLabel("Page 1");
//        label2.setFont(new Font("Ralway",Font.BOLD,22));
//        label2.setBounds(330,70,600,30);
//        add(label2);
//
//        JLabel label3 =new JLabel("Personal Details");
//        label3.setFont(new Font("Raleway",Font.BOLD,22));
//        label3.setBounds(290,90,600,30);
//        add(label3);
//
//        JLabel labelName = new JLabel("Name :");
//        labelName.setFont(new Font("Raleway",Font.BOLD,20));
//        labelName.setBounds(100,190,100,30);
//        add(labelName);
//
//        textName = new JTextField();
//        textName.setFont(new Font("Raleway",Font.BOLD,14));
//        textName.setBounds(300,190,400,30);
//        add(textName);
//
//        JLabel labelfName = new JLabel("Father's Name :");
//        labelfName.setFont(new Font("Raleway",Font.BOLD,20));
//        labelfName.setBounds(100,240,200,30);
//        add(labelfName);
//
//        textFname = new JTextField();
//        textFname.setFont(new Font("Raleway",Font.BOLD,14));
//        textFname.setBounds(300,240,400,30);
//        add(textFname);
//
//        JLabel DOB = new JLabel("Date of Birth");
//        DOB.setFont(new Font("Raleway",Font.BOLD,20));
//        DOB.setBounds(100,340,200,30);
//        add(DOB);
//
//        dataChooser = new JDateChooser();
//        dataChooser.setForeground(new Color(105,105,105));
//        dataChooser.setBounds(300,340,400,30);
//        add(dataChooser);
//
//
//        JLabel labelG = new JLabel("Gender");
//        labelG.setFont(new Font("Raleway",Font.BOLD,20));
//        labelG.setBounds(100,290,200,30);
//        add(labelG);
//
//        r1 = new JRadioButton("Male");
//        r1.setFont(new Font("Raleway",Font.BOLD,14));
//        r1.setBounds(300,290,60,30);
//        r1.setBackground(new Color(222,255,228));
//        add(r1);
//
//        r2 = new JRadioButton("Female");
//        r2.setFont(new Font("Raleway",Font.BOLD,14));
//        r2.setBackground(new Color(222,255,228));
//        r2.setBounds(450,290,90,30);
//        add(r2);
//
//        r3 = new JRadioButton("Transgender");
//        r3.setFont(new Font("Raleway",Font.BOLD,14));
//        r3.setBounds(600,290,120,30);
//        r3.setBackground(new Color(222,255,228));
//        add(r3);
//
//        ButtonGroup buttonGroup = new ButtonGroup();
//        buttonGroup.add(r1);
//        buttonGroup.add(r2);
//        buttonGroup.add(r3);
//
//        JLabel labelEmail = new JLabel("Email address :");
//        labelEmail.setFont(new Font("Raleway", Font.BOLD,20));
//        labelEmail.setBounds(100,390,200,30);
//        add(labelEmail);
//
//        textEmail = new JTextField();
//        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
//        textEmail.setBounds(300,390,400,30);
//        add(textEmail);
//
//
//        JLabel labelMs = new JLabel("Marital Status :");
//        labelMs.setFont(new Font("Raleway", Font.BOLD,20));
//        labelMs.setBounds(100,440,200,30);
//        add(labelMs);
//
//        m1 = new JRadioButton("Married");
//        m1.setBounds(300,440,100,30);
//        m1.setBackground(new Color(222,255,228));
//        m1.setFont(new Font("Raleway",Font.BOLD,14));
//        add(m1);
//
//        m2 = new JRadioButton("Unmarried");
//        m2.setBounds(450,440,100,30);
//        m2.setBackground(new Color(222,255,228));
//        m2.setFont(new Font("Raleway",Font.BOLD,14));
//        add(m2);
//
//        m3 = new JRadioButton("Other");
//        m3.setBounds(635,440,100,30);
//        m3.setBackground(new Color(222,255,228));
//        m3.setFont(new Font("Raleway",Font.BOLD,14));
//        add(m3);
//
//        ButtonGroup buttonGroup1 = new ButtonGroup();
//        buttonGroup1.add(m1);
//        buttonGroup1.add(m2);
//        buttonGroup1.add(m3);
//
////        textMs = new JTextField();
////        textMs.setFont(new Font("Raleway",Font.BOLD,14));
////        textMs.setBounds(300,440,400,30);
////        add(textMs);
//
//        JLabel labelAdd = new JLabel("Address :");
//        labelAdd.setFont(new Font("Raleway", Font.BOLD,20));
//        labelAdd.setBounds(100,490,200,30);
//        add(labelAdd);
//
//        textAdd = new JTextField();
//        textAdd.setFont(new Font("Raleway",Font.BOLD,14));
//        textAdd.setBounds(300,490,400,30);
//        add(textAdd);
//
//        JLabel labelCity = new JLabel("City :");
//        labelCity.setFont(new Font("Raleway", Font.BOLD,20));
//        labelCity.setBounds(100,540,200,30);
//        add(labelCity);
//
//        textcity = new JTextField();
//        textcity.setFont(new Font("Raleway",Font.BOLD,14));
//        textcity.setBounds(300,540,400,30);
//        add(textcity);
//
//        JLabel labelPin = new JLabel("Pin Code :");
//        labelPin.setFont(new Font("Raleway", Font.BOLD,20));
//        labelPin.setBounds(100,590,200,30);
//        add(labelPin);
//
//        textpin = new JTextField();
//        textpin.setFont(new Font("Raleway",Font.BOLD,14));
//        textpin.setBounds(300,590,400,30);
//        add(textpin);
//
//        JLabel labelstate = new JLabel("State :");
//        labelstate.setFont(new Font("Raleway", Font.BOLD,20));
//        labelstate.setBounds(100,640,200,30);
//        add(labelstate);
//
//        textState = new JTextField();
//        textState.setFont(new Font("Raleway",Font.BOLD,14));
//        textState.setBounds(300,640,400,30);
//        add(textState);
//
//        next = new JButton("Next");
//        next.setFont(new Font("Raleway",Font.BOLD,14));
//        next.setBackground(Color.BLACK);
//        next.setForeground(Color.WHITE);
//        next.setBounds(620,710,80,30);
//        next.addActionListener(this);
//        add(next);
//
//
//
//
//        getContentPane().setBackground(new Color(222,255,228));
//        setLayout(null);
//        setSize(850,800);
//        setLocation(360,40);
//        setVisible(true);
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//    }
//
//    public static void main(String[] args) {
//    new Signup();
//    }
//}

package bank.management.system;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1, r2, r3, m1, m2, m3;
    JButton next;
    JTextField textName, textFname, textEmail, textAdd, textCity, textPin, textState;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000L) + 1000L);
    String first = " " + first4;

    Signup() {
        super("APPLICATION FORM");

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(850, 900)); // Adjust the size as needed

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        panel.add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        panel.add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        panel.add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290, 90, 600, 30);
        panel.add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 190, 100, 30);
        panel.add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        panel.add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelfName.setBounds(100, 240, 200, 30);
        panel.add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway", Font.BOLD, 14));
        textFname.setBounds(300, 240, 400, 30);
        panel.add(textFname);

        JLabel labelG = new JLabel("Gender");
        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        labelG.setBounds(100, 290, 200, 30);
        panel.add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBounds(300, 290, 60, 30);
        r1.setBackground(new Color(222, 255, 228));
        panel.add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(222, 255, 228));
        r2.setBounds(450, 290, 90, 30);
        panel.add(r2);

        r3 = new JRadioButton("Transgender");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBounds(600, 290, 120, 30);
        r3.setBackground(new Color(222, 255, 228));
        panel.add(r3);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(r1);
        genderGroup.add(r2);
        genderGroup.add(r3);

        JLabel DOB = new JLabel("Date of Birth");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 340, 200, 30);
        panel.add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 340, 400, 30);
        panel.add(dateChooser);

        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(100, 390, 200, 30);
        panel.add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 390, 400, 30);
        panel.add(textEmail);

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMs.setBounds(100, 440, 200, 30);
        panel.add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setBounds(300, 440, 100, 30);
        m1.setBackground(new Color(222, 255, 228));
        m1.setFont(new Font("Raleway", Font.BOLD, 14));
        panel.add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBounds(450, 440, 100, 30);
        m2.setBackground(new Color(222, 255, 228));
        m2.setFont(new Font("Raleway", Font.BOLD, 14));
        panel.add(m2);

        m3 = new JRadioButton("Other");
        m3.setBounds(635, 440, 100, 30);
        m3.setBackground(new Color(222, 255, 228));
        m3.setFont(new Font("Raleway", Font.BOLD, 14));
        panel.add(m3);

        ButtonGroup maritalStatusGroup = new ButtonGroup();
        maritalStatusGroup.add(m1);
        maritalStatusGroup.add(m2);
        maritalStatusGroup.add(m3);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        labelAdd.setBounds(100, 490, 200, 30);
        panel.add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
        textAdd.setBounds(300, 490, 400, 30);
        panel.add(textAdd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCity.setBounds(100, 540, 200, 30);
        panel.add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        textCity.setBounds(300, 540, 400, 30);
        panel.add(textCity);

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPin.setBounds(100, 590, 200, 30);
        panel.add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        textPin.setBounds(300, 590, 400, 30);
        panel.add(textPin);

        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Raleway", Font.BOLD, 20));
        labelState.setBounds(100, 640, 200, 30);
        panel.add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        textState.setBounds(300, 640, 400, 30);
        panel.add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 710, 80, 30);
        next.addActionListener(this);
        panel.add(next);

        panel.setBackground(new Color(222, 255, 228));

        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(0, 0, 850, 800);

        add(scrollPane);

        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle form submission logic here
        System.out.println("Form submitted!");

        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if(r2.isSelected()){
            gender = "Female";
        }else if(r3.isSelected()){
            gender = "Transgender";
        }
        String email = textEmail.getText();
        String marital = null;
        if(m1.isSelected()){
            marital = "Married";
        }else if(m2.isSelected()){
            marital = "Unmarried";
        }else if(m3.isSelected()){
            marital = "Other";
        }
        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try {
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"fill all the fields");
            }else {
                Con con1 = new Con();
                String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new  Signup2(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
