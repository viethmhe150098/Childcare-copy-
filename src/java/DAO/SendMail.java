/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Customer;
import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author DO THANH TRUNG
 */
public class SendMail {

    public String getRandom() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);

        return String.format("%06d", number);
    }

    public boolean sendEmail(Customer cus) {
        boolean test = false;
        String toEmail = cus.getEmail();
        String fromEmail = "";
        String password = "";

        try {
            Properties pr = new Properties();
            pr.setProperty("mail.smtp.host", "smtp.mail.com");
            pr.setProperty("mail.smtp.port", "587");
            pr.setProperty("mail.smtp.auth", "true");
            pr.setProperty("mail.smtp.starttls.enable", "true");
            pr.put("mail.smtp.socketFactory.port", "587");
            pr.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

            //get session
            Session session = Session.getInstance(pr, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication(fromEmail, password);
                }
            });
            
            Message mes = new MimeMessage(session);
            
            mes.setFrom(new InternetAddress(fromEmail));
            mes.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            
            mes.setSubject("User Email Verification");
            mes.setText("Registerd successfully. Please verify your account using this code: " + cus.getCode());
            
            Transport.send(mes);
            
            test = true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return test;
    }
}
