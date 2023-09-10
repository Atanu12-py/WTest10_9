package Mail;

import org.springframework.stereotype.Component;
import org.wtest.GetMap;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Component
public class MailhandlerBase {

    public void sendmail(){
        Properties sysPropertiesmap=System.getProperties();
        sysPropertiesmap.put("mail.smtp.host","smtp.gmail.com");
        sysPropertiesmap.put("mail..smtp.port","465");
        sysPropertiesmap.put("mail.smtp.ssl.enable","true");
        sysPropertiesmap.put("mail.smtp.auth","true");

        Authenticator mailauthenticator=new CustomizedMailAuthenticator();

        Session mailsession=Session.getInstance(sysPropertiesmap,mailauthenticator);

        MimeMessage mailmsg=new MimeMessage(mailsession);
        try {
            mailmsg.setFrom(MailConstant.SENDER);

            mailmsg.setSubject("Weekly test");

            mailmsg.setRecipient(Message.RecipientType.TO, new InternetAddress("atanu@gmail.com"));


            mailmsg.setText("Weekly test of springboot ");

            Transport.send(mailmsg);
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}
