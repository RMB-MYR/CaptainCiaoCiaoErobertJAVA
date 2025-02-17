import java.util.ArrayList;
import java.util.List;

public class WeatherOccuranceA15_2_6 {
    //public String weather;
    //public int occurrences;
    //public int startIndex;

    public static void main(String[] args) {

        List<String> weatherData = new ArrayList<String>();
        weatherData.add("rain");
        weatherData.add("sun");
        weatherData.add("rain");
        weatherData.add("rain");
        weatherData.add("hail");
        weatherData.add("snow");
        weatherData.add("storm");
        weatherData.add("sun");
        weatherData.add("sun");
        weatherData.add("sun");
        weatherData.add("rain");
        weatherData.add("rain");
        weatherData.add("sun");

        longestSequenceOfSameWeather(weatherData);

    }

    public static void longestSequenceOfSameWeather(List<String> weather){
        String currentWeather = weather.get(0);
        String longestWeather= weather.get(0);
        int maxOccurance = 0;
        int occurance = 0;
        int longestStartIndex = 0;
        int startIndex = 0;


        for (int i = 1; i < weather.size();i++) {
            if (currentWeather.equals(weather.get(i))) {
                occurance++;
                startIndex = i - 1;
            }
            else{
                if (occurance > maxOccurance){
                    maxOccurance = occurance;
                    longestStartIndex = i;
                    longestWeather = currentWeather;
                }
                currentWeather = weather.get(i);
                occurance= 1;
                //System.out.println(maxOccurance);

                }
            }
        System.out.println("Longest weather event was " + longestWeather);
        System.out.println("The event lastet for " + maxOccurance + " Days");
        System.out.println("The event started on Day: " + startIndex);


        }
}

