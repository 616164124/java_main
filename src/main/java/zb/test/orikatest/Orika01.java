package zb.test.orikatest;

import com.dao.User;
import com.dao.UserVO;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Orika01 {
    private static final Logger logger = LoggerFactory.getLogger(Orika01.class);
    public static void main(String[] args) {

        /**
         * 简单用法
         * 将user对象，复制给uservo（浅拷贝）
         */
        User user = new User(12, "mu", 12);
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        UserVO map = mapperFactory.getMapperFacade().map(user, UserVO.class);
        System.out.println("user对象：" + user);
        System.out.println("orika复制对象:" + map);

    }
}
