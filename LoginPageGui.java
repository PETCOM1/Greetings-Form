
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Munzhedzi Munyadziwa Petrus
 */
public class LoginPageGui extends JFrame implements ActionListener{

    
    //Panels
    JPanel headingPnl;
    JPanel midHeaderPanel;
    JPanel userNamePanel;
    JPanel passwordPanel;
    JPanel submitButtonPanel;
    JPanel mainPanel;
    
    //labels
    JLabel headLbl;
    JLabel midLbl;
    JLabel usernameLbl;
    JLabel passLbl;
    JPanel centerPnl;
    
    //TextFeild
    JTextField userNameTxt;
    
    //password feild
    JPasswordField passFld;
    
    //Buttons
    JButton submitBtn;
    
    
    
    public LoginPageGui() {
        
        //WorkArea/Jframe
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        setTitle("Login Page");
        setSize(500, 500);
        setBackground(Color.yellow);
        
        //Setup the panels
        headingPnl = new JPanel(new FlowLayout());
        headingPnl.setBorder(new LineBorder(Color.BLACK, 2));
        
        //settingUp all in the panels all at once
        midHeaderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        userNamePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        passwordPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        submitButtonPanel = new JPanel();
        submitButtonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        mainPanel = new JPanel(new BorderLayout());
        
        centerPnl = new JPanel(new BorderLayout());
        
        //settingup the labels
        headLbl = new JLabel("User login page");
        midLbl = new JLabel("Login details") ;
        usernameLbl = new JLabel("Username");
        passLbl = new JLabel("Password");
        
        //Setting up textField
        userNameTxt = new JTextField(15);
        
        //Settingup a passwordfield
        passFld = new JPasswordField(15);
        
        //SettingUp a Button
        submitBtn = new JButton("Submit");
        
        //Putting everything into their own Panels
        headingPnl.add(headLbl);
        midHeaderPanel.add(midLbl);
        
        userNamePanel.add(usernameLbl);
        userNamePanel.add(userNameTxt);
        
        passwordPanel.add(passLbl);
        passwordPanel.add(passFld);
        
        //Settingup submit button
        submitButtonPanel = new JPanel(new FlowLayout());
        submitButtonPanel.add(submitBtn);
        
        //Adding each n every component into the main Panel
        mainPanel.add(headLbl,BorderLayout.NORTH);
        centerPnl.add(midHeaderPanel,BorderLayout.NORTH);
        centerPnl.add(userNamePanel,BorderLayout.CENTER);
        centerPnl.add(passwordPanel,BorderLayout.SOUTH);
        /*mainPanel.add(midHeaderPanel);
        mainPanel.add(userNamePanel);
        mainPanel.add(passwordPanel);*/
        mainPanel.add(centerPnl,BorderLayout.CENTER);
        mainPanel.add(submitButtonPanel,BorderLayout.SOUTH);
        mainPanel.setBorder(new LineBorder(Color.BLACK, 2));
        
        
        add(mainPanel);
        setVisible(true);
        
        
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
