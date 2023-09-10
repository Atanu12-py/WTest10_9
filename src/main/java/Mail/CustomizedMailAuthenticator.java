package Mail;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class CustomizedMailAuthenticator extends Authenticator {
    @Override
    protected PasswordAuthentication getPasswordAuthentication(){
        return new PasswordAuthentication(MailConstant.SENDER,MailConstant.APP_PASSWORD);
    }
}
