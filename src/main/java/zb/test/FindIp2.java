package zb.test;

import org.lionsoul.ip2region.DataBlock;
import org.lionsoul.ip2region.DbConfig;
import org.lionsoul.ip2region.DbSearcher;
import org.lionsoul.ip2region.Util;

import java.io.File;
import java.lang.reflect.Method;

class IPUtil {
    public static String getCityInfo(String ip) {
//        String dbPath= "D:\\5tian\\1BackendCode\\java_main\\src\\main\\java\\zb\\test\\ip2region.db";
        String dbPath = "src/main/java/zb/test/ip2region.db";
        File file = new File(dbPath);
        if (file.exists() == false) {
            System.out.println("Error: Invalid ip2region.db file");
        }

        //查询算法
        int algorithm = DbSearcher.BTREE_ALGORITHM; //B-tree
        //DbSearcher.BINARY_ALGORITHM //Binary
        //DbSearcher.MEMORY_ALGORITYM //Memory
        try {
            DbConfig config = new DbConfig();
            DbSearcher searcher = new DbSearcher(config, dbPath);

            //define the method
            Method method = null;
            switch (algorithm) {
                case DbSearcher.BTREE_ALGORITHM:
                    method = searcher.getClass().getMethod("btreeSearch", String.class);
                    break;
                case DbSearcher.BINARY_ALGORITHM:
                    method = searcher.getClass().getMethod("binarySearch", String.class);
                    break;
                case DbSearcher.MEMORY_ALGORITYM:
                    method = searcher.getClass().getMethod("memorySearch", String.class);
                    break;
            }

            DataBlock dataBlock = null;
            if (Util.isIpAddress(ip) == false) {
                System.out.println("Error: Invalid ip address");
                return "000000";
            }

            dataBlock = (DataBlock) method.invoke(searcher, ip);

            return dataBlock.getRegion();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
//115.121.211.15北京市   171.121.211.15运城市   171.119.211.15忻州市    183.129.200.98杭州   183.139.220.98温州   110.121.211.15苏州市（随州市）
        //111.121.211.15毕节市    119.121.211.15阳江市
        String ip = "111.121.211.15";

        IPUtil ipUtil = new IPUtil();
        System.out.println(getCityInfo(ip));
        String[] split = getCityInfo(ip).split("\\|");

    }

    public static int forEach255() {
        int i = -255;
        return i;
    }

}
