package apollo.demon.config;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

/**
 * Created by WJ on 2018/6/9.
 */

@EnableApolloConfig
public class TestConfig {

    @ApolloConfig
    private static Config config;

    public static void main(String[] args) {
        System.setProperty("env", "dev");
        //config=ConfigService.getAppConfig();
        config = ConfigService.getConfig("TEST1.demon-test-java-code");
        String name = config.getProperty("name", "default");
        System.out.println(name);
    }

}
