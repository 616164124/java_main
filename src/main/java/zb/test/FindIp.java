package zb.test;


import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.model.CityResponse;
import com.maxmind.geoip2.record.*;

import java.io.File;
import java.net.InetAddress;

public class FindIp {
    public static void main(String[] args) throws Exception {
        File database = new File("src/main/java/zb/test/GeoLite2-City.mmdb");
        DatabaseReader reader = new DatabaseReader.Builder(database).build();
        // 指定获取到的IP地址
        InetAddress ipAddress = InetAddress.getByName("223.167.152.77");
        // 根据ip获取请求
        CityResponse response = reader.city(ipAddress);
        // 获取国家
        Country country = response.getCountry();
        // 获取编码
        System.out.println(country.getIsoCode());
        System.out.println(country.getName());
        System.out.println();
        System.out.println(country.getNames().get("zh-CN"));

        Subdivision subdivision = response.getMostSpecificSubdivision();
        System.out.println(subdivision.getName());
        System.out.println(subdivision.getIsoCode());

        City city = response.getCity();
        System.out.println(city.getName());

        Postal postal = response.getPostal();
        System.out.println(postal.getCode());
        Location location = response.getLocation();
        System.out.println(location.getLatitude());
        System.out.println(location.getLongitude());
    }
}
