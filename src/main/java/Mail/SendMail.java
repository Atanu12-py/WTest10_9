package Mail;

import com.sun.mail.util.logging.MailHandler;

public class SendMail {
    public static void main(String[] args) {
        MailhandlerBase mailhandlerBase=new MailhandlerBase();
        mailhandlerBase.sendmail();
    }
}
