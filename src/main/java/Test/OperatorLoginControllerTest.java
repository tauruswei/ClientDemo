package Test;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: WeiBingtao/13156050650@163.com
 * @Version: 1.0
 * @Description:
 * @Date: 2019/8/4 14:19
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest
public class OperatorLoginControllerTest {
    @Test
    public void login() {
        String cacertPath = "C:\\Users\\weibingtao\\Desktop\\sansecca.crt";
        RestTemplate restTemplate = RestTemplateTools.restTemplate(cacertPath);
        LoginModel loginModel = new LoginModel();
        loginModel.setCredential("MIIDCDCCAfCgAwIBAgIIJeVIFRFA7PQwDQYJKoZIhvcNAQELBQAwITELMAkGA1UEBhMCQ04xEjAQ\n" + "BgNVBAMMCXNhbnNlY19vbTAeFw0xOTEwMTYwMjExMTJaFw0yNTA0MDgwMjExMDRaMCMxDTALBgNV\n" + "BAYTBG51bGwxEjAQBgNVBAMMCXNhbnNlY19vbTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoC\n" + "ggEBALlRu2NSHtItlOBPAhk1dXUnc8v3lwL+YuzuVmV7c4uN55nrrG2l1VYqq7t2jsuftqF4F58b\n" + "NTxmctcwykQydZW8B21BlpLPpFGVcpogzWCqmlLg0SbuST4trYbcrV7Mdo4U7V9V6Bh6u/WlP0qS\n" + "wPvt1YwLcMmK704xjHNfzqgwtDRq7JBQ0QLCoKpKqnIRZLKISh36kAJxXFNGa2ezl19uODwbzQtU\n" + "VzUC+DRCDNlZASsLWqwGsPo20KYv4g/m21OqJRpJcLmdeGrrWVYxJvSQjzqRPCF9Box0FuNAb29n\n" + "oOhiTxBPOWZxhLxzZQZZ9yX4d8bOL1ug2PbSbohJT1cCAwEAAaNCMEAwHQYDVR0OBBYEFI1kkQdh\n" + "7jx6BPSjkU6YeUmKSvpfMB8GA1UdIwQYMBaAFB60D2fGi9TwarClzYT706hhYUxyMA0GCSqGSIb3\n" + "DQEBCwUAA4IBAQAWRhNPGkuO1SBn3fOXsUJza2+YP6sHUqov2VwLLl5Y7OhMKncDnjhDQ/nRSdH0\n" + "HzgGAaqmUTVXKqDOVSvghRNOICXqzU0OM/TrwnkFrZhnzw8p8OW7E12GMWmVZtSgD3usj4fv8BPl\n" + "u/uuJKQxD6jAxkdOePg3qIKoeG0M80L4GNDZ0/OawKumMXINdj114Qgmz3BHbUjHETr60t8A6k3c\n" + "FmWb8zUBD4XT2qdAPmIeucDV+q/ld+LDIX7Cm/5/tjMKNoJUC0xg5PcStWrN2bIKUdP1jQBod6S2\n" + "dTiDHhNDo8YNCyjVA9MB75CooTLPFzT8uAlzfqLgWXLJ1r+nRwqt");
        loginModel.setType(1);
        loginModel.setUserName("sansec_om");
        ResponseEntity<Result> responseEntity = restTemplate.postForEntity("https://127.0.0.1:9444/SecKMS/1.0/operator/login", loginModel, Result.class);
        System.out.println(JSON.toJSONString(responseEntity.getBody()));
    }
}