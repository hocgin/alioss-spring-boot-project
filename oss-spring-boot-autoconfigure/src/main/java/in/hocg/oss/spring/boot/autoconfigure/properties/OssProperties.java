package in.hocg.oss.spring.boot.autoconfigure.properties;


import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by hocgin on 2019/6/12.
 * email: hocgin@gmail.com
 *
 * @author hocgin
 */
@Data
@Accessors(chain = true)
@ToString
@ConfigurationProperties(prefix = OssProperties.PREFIX)
public class OssProperties {
    public static final String PREFIX = "oss";
    private String accessKey;
    private String secretKey;
    private String space;
    private String domain;
    private OssType type = OssType.AliYun;
}
