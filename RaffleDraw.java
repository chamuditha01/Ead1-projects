import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RaffleDraw {

    public static void main(String[] args) {
        generateRaffleDraw();
    }

    public static void generateRaffleDraw() {
        
        LocalDateTime now = LocalDateTime.now();

       
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        
        int raffleNumber = generateRandomNumber();

       
        System.out.println("[" + formattedDateTime + "] - [" + raffleNumber + "]");
    }

    private static int generateRandomNumber() {
        
        return (int) (Math.random() * 900000) + 100000;
    }
}
