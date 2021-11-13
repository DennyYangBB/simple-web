package tw.denny;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author: Denny Yang
 * @since: 2021/11/11
 */
@RestController
public class DemoRest {

    @Value("${git.commit.id:no commit_id}")
    private String gitCommitId;

    @RequestMapping("/hello")
    @ResponseBody
    public Map<String, Object> hello(String name) {
        System.out.println("hello " + name);
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("random", new Random().nextInt(1000));
        map.put("version", "2");
        map.put("greet", "Hello " + name);
        map.put("date", new Date());
        map.put("git.commit.id", gitCommitId);
        return map;
    }

}
