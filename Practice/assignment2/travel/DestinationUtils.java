package assignment2.travel;

public class DestinationUtils {
    
    public static Destination getDestination(String duration){
        switch(duration){
            case "01:34":
                return Destination.BERLIN;
            case "01:45":
                return Destination.ROME;
            case "02:05":
                return Destination.AMSTERDAM;
            case "02:20":
                return Destination.PARIS;
            case "02:43":
                return Destination.HELSINKI;
            default:
                return Destination.INVAILD;
        }
    }

    public static String getDestinationDuration(Destination destination){
        switch(destination){
            case BERLIN:
                return "01:34";
            case ROME:
                return "01:45";
            case AMSTERDAM:
                return "02:05";
            case PARIS:
                return "02:20";
            case HELSINKI:
                return "02:43";
            default:
                return "Invalid";
        }
    }

    public static int getRoundedHours(Destination destination){
        String time = getDestinationDuration(destination);
        String[] parts = time.split(":");
        int[] numTime = new int[parts.length];
        for(int i = 0; i < parts.length; i++){
            numTime[i] = Integer.parseInt(parts[i]);
        }
        int hour, minute;
        hour = numTime[0];
        minute = numTime[1];
        if(minute > 30){
            return hour+1;
        }else{
            return hour;
        }
    }

}
