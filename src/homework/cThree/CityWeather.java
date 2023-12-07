package homework.cThree;
import java.util.HashMap;
public class CityWeather {
    // 封装城市天气数据实体类
    String cityName;   // 城市名称
    double temperature; // 温度
    double humidity;    // 湿度
    double windSpeed;   // 风速
    String description; // 天气描述（如晴、阴、雨等）
    // get/set
    public String getCityName() {return cityName;}
    public void setCityName(String cityName) {this.cityName = cityName;}
    public double getTemperature() {return temperature;}
    public void setTemperature(double temperature) {this.temperature = temperature;}
    public double getHumidity() {return humidity;}
    public void setHumidity(double humidity) {this.humidity = humidity;}
    public double getWindSpeed() {return windSpeed;}
    public void setWindSpeed(double windSpeed) {this.windSpeed = windSpeed;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    // 构造函数：初始化城市天气对象
    public CityWeather(String cityName, double temperature, double humidity, double windSpeed, String description) {
        this.cityName = cityName; // 城市名称
        this.temperature = temperature;// 温度
        this.humidity = humidity;// 湿度
        this.windSpeed = windSpeed; // 风速
        this.description = description;// 天气描述（如晴、阴、雨等）
    }
        public static void main(String[] args) {
        // 使用HashMap存储城市天气数据
        HashMap<String, CityWeather> weatherMap = new HashMap<>();
        // 添加五个主要城市的天气数据
        // 使用城市名称作为键，CityWeather对象作为值
        weatherMap.put("昆明", new CityWeather("昆明", 18.0, 65.0, 3.0, "多云"));
        weatherMap.put("上海", new CityWeather("上海", 22.0, 50.0, 3.5, "多云"));
        weatherMap.put("广州", new CityWeather("广州", 30.0, 70.0, 2.0, "小雨"));
        weatherMap.put("深圳", new CityWeather("深圳", 28.0, 65.0, 4.0, "阴"));
        weatherMap.put("成都", new CityWeather("成都", 24.0, 55.0, 3.0, "霾"));
            // 遍历HashMap中的所有城市名称（键）
        for (String cityName : weatherMap.keySet()) {
            // 通过城市名称获取对应的城市天气数据
            CityWeather weatherInfo = weatherMap.get(cityName);
            // 输出城市及其天气信息
            System.out.println(weatherInfo.getCityName()+ "的天气情况: " +
                    "温度=" + weatherInfo.getTemperature() +
                    ", 湿度=" + weatherInfo.getHumidity() +
                    ", 风速=" + weatherInfo.getWindSpeed()+
                    ", 天气=" + weatherInfo.getDescription());
        }//结束for循环
    }
}
//2023.12.1
//打开手机QQ天气数据，1.封装城市天气数据实体类，2.使用HashMap集合类实现国内主要城市（自行选择5个主要城市）天气数据的存储及遍历输出。