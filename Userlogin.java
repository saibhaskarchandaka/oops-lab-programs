import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AWT extends Frame
{
    Label username;
    Label password;
    TextField userTextField;
    TextField passwordTextField;
    Button submit;
    Button reset;
    AWT()
    {
        username=new Label("Username : ");
        password=new Label("Password : ");
        userTextField=new TextField();
        passwordTextField=new TextField();
        submit=new Button("Submit");
        reset=new Button("Reset");
        // Set layout
        setLayout(new GridLayout(3,3));
        // Add components to the frame
        this.add(username);
        add(userTextField);
        add(password);
        add(passwordTextField);
        add(submit);
        add(reset);
        // Set frame properties
        setTitle("Event registration form");
        setSize(300,300);
        setVisible(true);
        // Add action listeners to buttons
        submit.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {       
            System.out.println("Successfully registered with username "+userTextField.getText()+" and password "+ passTextField.getText()+".");
            dispose();
        }
        });
    reset.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e)
    {
        userTextField.setText("");
        passwordTextField.setText("");
    }
   });
}
    public static void main(String[] args)
    {
        new AWT();
    }
}
