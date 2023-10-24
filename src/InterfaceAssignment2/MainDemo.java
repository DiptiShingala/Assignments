package InterfaceAssignment2;

public class MainDemo {
    public static void main(String[] args) {
        //email
        EmailNotificationSender emailnotification = new EmailNotificationSender();
        emailnotification.setRecipients(new String[]{"admin@example.com","abcd@web.com"});
        emailnotification.sendNotification("Job email");

        //sms
       SMSNotificationSender smsNotification = new SMSNotificationSender();
       smsNotification.setPhoneNumbers(new String[]{"1234567890","8401276890"});
       smsNotification.sendNotification("job message via sms");

       //push
       PushNotificationSender pushNotification = new PushNotificationSender();
       pushNotification.sendNotification("push");
       pushNotification.pushNotification();


    }
}
