import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.Map;

public class inspire {
    public static void main(String[] args) {
        // Create a map of Bruce Lee quotes for each day of the week
        Map<DayOfWeek, String> dailyQuotes = new HashMap<>();
        
        dailyQuotes.put(DayOfWeek.MONDAY, 
            "Monday Motivation: \"Do not pray for an easy life, pray for the strength to endure a difficult one.\" - Bruce Lee");
        
        dailyQuotes.put(DayOfWeek.TUESDAY, 
            "Tuesday Truth: \"If you always put limits on everything you do, physical or anything else, it will spread into your work and into your life. There are no limits. There are only plateaus, and you must not stay there, you must go beyond them.\" - Bruce Lee");
        
        dailyQuotes.put(DayOfWeek.WEDNESDAY, 
            "Wednesday Wisdom: \"Be like water my friend.\" - Bruce Lee");
        
        dailyQuotes.put(DayOfWeek.THURSDAY, 
            "Thursday Thought: \"The key to immortality is first living a life worth remembering.\" - Bruce Lee");
        
        dailyQuotes.put(DayOfWeek.FRIDAY, 
            "Friday Focus: \"A goal is not always meant to be reached, it often serves simply as something to aim at.\" - Bruce Lee");
        
        dailyQuotes.put(DayOfWeek.SATURDAY, 
            "Saturday Success: \"Do not fear failure. It is the only path to success. Each mistake or failure is a step, and from this we learn.\" - Bruce Lee");
        
        dailyQuotes.put(DayOfWeek.SUNDAY, 
            "Sunday Serenity: \"As you think, so shall you become.\" - Bruce Lee");
        
        // Get today's day of the week
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        
        // Print header
        System.out.println("================================");
        System.out.println("   BRUCE LEE DAILY INSPIRATION   ");
        System.out.println("================================");
        System.out.println("Date: " + today);
        System.out.println("Day: " + dayOfWeek);
        System.out.println("================================\n");
        
        // Print today's quote
        System.out.println(dailyQuotes.get(dayOfWeek));
        
        System.out.println("\n================================");
        System.out.println("   ALL WEEK'S INSPIRATION       ");
        System.out.println("================================\n");
        
        // Print all quotes for the week
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(dailyQuotes.get(day));
            System.out.println();
        }
        
        // Additional inspirational print
        System.out.println("================================");
        System.out.println("BONUS INSPIRATION:");
        System.out.println("================================");
        String[] bonusQuotes = {
            "\"Knowing is not enough, we must apply. Willing is not enough, we must do.\" - Bruce Lee",
            "\"To know oneself, is to study oneself in action with another person.\" - Bruce Lee",
            "\"The successful warrior is the average man, with laser-like focus.\" - Bruce Lee",
            "\"Man, the living creature, the creating individual, is always more important than any established style or system.\" - Bruce Lee",
            "\"In the middle of chaos lies the greatest opportunity.\" - Bruce Lee"
        };
        
        for (String quote : bonusQuotes) {
            System.out.println(quote);
            System.out.println();
        }
    }
}
