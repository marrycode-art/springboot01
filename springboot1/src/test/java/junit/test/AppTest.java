package junit.test;

import com.hui.MainClass;
import com.hui.entity.User;
import com.hui.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {MainClass.class})
public class AppTest {

    @Resource
    private UserMapper userMapper;
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testRedisTemplate(){
        // 存放到Redis数据库
        //redisTemplate.opsForValue().set("marry","code");
        // 从Redis数据库取值
        String str = (String) redisTemplate.opsForValue().get("marry");
        System.err.println(str);

        // 存放对象到Redis数据库
        //User user = new User("root","toor","daihui");
        //redisTemplate.opsForValue().set("user",user);

        User u = (User) redisTemplate.opsForValue().get("user");
        System.err.println(u);
    }

    @Test
    public void getUser(){
        List<User> userList = userMapper.getUserList();
        for (User user : userList) {
            System.err.println(user);
        }
    }
}