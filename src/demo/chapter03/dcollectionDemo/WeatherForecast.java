package demo.chapter03.dcollectionDemo;

import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    String city;
    String Weather;
    double temper;
    String Wind;//
    String air;

    public WeatherForecast(String Weather, double temper, String Wind, String air){
        //this.city=city;//城市
        this.Weather=Weather;//天气
        this.temper=temper;//气温
        this.Wind=Wind;//风力
        this.air=air;//空气质量
    }


    public static void main(String[] args) {
        //创建天气对象
        WeatherForecast Kuming =new WeatherForecast("阴",13.0,"西南风2级","优");
        WeatherForecast Beijin =new WeatherForecast("晴",9.0,"北风1级","良");
        WeatherForecast Shanhai =new WeatherForecast("多云",14.0,"西北风2级","良");
                //创建Map泛型集合对象
        Map<String,WeatherForecast> map=new HashMap<String,WeatherForecast>();
       /* List<WeatherForecast>list =new LinkedList<WeatherForecast>();*/

        //添加天气数据到集合中
        map.put("昆明",Kuming);
        map.put("北京",Beijin);
        map.put("上海",Shanhai);

        //操作List集合数据
        System.out.println("今日播报天气的城市有"+map.size()+"个");

        //遍历输出各城市天气数据（增强型for循环）
            //遍历键集
        for (String cityes : map.keySet()) {
            System.out.println(cityes+":");

            //遍历值集
          /*  List<WeatherForecast>weatherInfo =map.get(cityes);
            for (WeatherForecast Wea:map.get(cityes))*/
        }


    }


 /*   public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }*/

    public String getWeather() {
        return Weather;
    }

    public void setWeather(String weather) {
        Weather = weather;
    }

    public double getTemper() {
        return temper;
    }

    public void setTemper(double temper) {
        this.temper = temper;
    }

    public String getWind() {
        return Wind;
    }

    public void setWind(String wind) {
        Wind = wind;
    }

    public String getAir() {
        return air;
    }

    public void setAir(String air) {
        this.air = air;
    }
}
