/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resto;
 
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginDemo extends JFrame implements ActionListener {

    JPanel panel;
    JLabel user_label, password_label, message;
    JTextField userName_text;
    JPasswordField password_text;
    JButton submit, cancel;

    LoginDemo() {
        
        // User Label
        user_label = new JLabel();
        user_label.setText("User Name :");
        userName_text = new JTextField();
        
        // Password

        password_label = new JLabel();
        password_label.setText("Password :");
        password_text = new JPasswordField();

        // Submit

        submit = new JButton("SUBMIT");

        panel = new JPanel(new GridLayout(3, 1));

        panel.add(user_label);
        panel.add(userName_text);
        panel.add(password_label);
        panel.add(password_text);

        message = new JLabel();
        panel.add(message);
        panel.add(submit);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Adding the listeners to components..
        submit.addActionListener(this);
        add(panel, BorderLayout.CENTER);
        setTitle("Please Login Here !");
        setSize(300, 100);
        setVisible(true);

    }

    public static void main(String[] args) {
        new LoginDemo();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String userName = userName_text.getText();
        String password = password_text.getText();
        if (userName.trim().equals("admin") && password.trim().equals("admin")) {
            message.setText(" Hello " + userName
                    + "'undefined'=== typeof _trfq || (window._trfq = []);'undefined'=== typeof _trfd && (window._trfd=[]),_trfd.push({'tccl.baseHost':'secureserver.net'}),_trfd.push({'ap':'cpsh'},{'server':'a2plcpnl0046'}) // Monitoring performance to make your website faster. If you want to opt-out, please contact web hosting support.");
        } else {
            message.setText(" Invalid user.. 'undefined'=== typeof _trfq || (window._trfq = []);'undefined'=== typeof _trfd && (window._trfd=[]),_trfd.push({'tccl.baseHost':'secureserver.net'}),_trfd.push({'ap':'cpsh'},{'server':'a2plcpnl0046'}) // Monitoring performance to make your website faster. If you want to opt-out, please contact web hosting support.");
        }

    }

}