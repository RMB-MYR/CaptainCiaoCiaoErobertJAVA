import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class WeatherOccuranceA15_2_6Test {
    @Test
    public void JTest(){
        List<String> weatherDataTest = new ArrayList<String>();
        weatherDataTest.add("rain");
        weatherDataTest.add("sun");
        weatherDataTest.add("rain");
        weatherDataTest.add("rain");
        weatherDataTest.add("hail");
        weatherDataTest.add("snow");
        weatherDataTest.add("storm");
        weatherDataTest.add("sun");
        weatherDataTest.add("sun");
        weatherDataTest.add("sun");
        weatherDataTest.add("rain");
        weatherDataTest.add("rain");
        weatherDataTest.add("sun");
        weatherDataTest.add("snow");
        weatherDataTest.add("storm");
        weatherDataTest.add("sun");
        weatherDataTest.add("sun");
        weatherDataTest.add("sun");
        weatherDataTest.add("rain");
        weatherDataTest.add("rain");
        weatherDataTest.add("sun");

        Collections.shuffle(weatherDataTest);
        System.out.println(weatherDataTest);

        WeatherOccuranceA15_2_6.longestSequenceOfSameWeather(weatherDataTest);


    }


}
