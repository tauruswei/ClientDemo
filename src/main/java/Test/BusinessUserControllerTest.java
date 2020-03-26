package Test;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: WeiBingtao/13156050650@163.com
 * @Version: 1.0
 * @Description:
 * @Date: 2019/8/20 22:26
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest
public class BusinessUserControllerTest {

    @Test
    public void createBusinessUser() {
        String cacertPath = "C:\\Users\\weibingtao\\Desktop\\sansecca.crt";
        RestTemplate restTemplate = RestTemplateTools.restTemplate(cacertPath);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization","ZXlKaGJHY2lPaUpJVXpJMU5pSjkuZXlKMWFXUWlPaUkwSWl3aVozSnZkWEJmWm14aFp5STZJaUlzSW5WRFpYSjBJam9pSWl3aVkyNGlPaUlpTENKMWMyVnlUbUZ0WlNJNkluTmhibk5sWTE5dmJTSXNJbVY0Y0NJNk1UVTNNVE14TVRRd09Dd2lhV0YwSWpveE5UY3hNamt6TkRBNExDSjFaRzRpT2lJaWZRLk11LTBmSkFOU3VUUVMxcXc5Q2NkQW84UHlrdTcyWi0tdnZTeURtQmUxdDQ=");
        headers.setContentType(MediaType.APPLICATION_JSON);
        ObjectMapper mapper = new ObjectMapper();
        BusinessUserModel businessUserModel = new BusinessUserModel();
        businessUserModel.setGroupName("testBGroup");
        businessUserModel.setPwd("SWXA1234...");
        businessUserModel.setUserName("testUser1016");
        String string = null;
        try {
            string = mapper.writeValueAsString(businessUserModel);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        HttpEntity<String> entity = new HttpEntity<String>(string, headers);
        ResponseEntity<Result> resultResponseEntity = restTemplate.postForEntity("https://10.0.50.130:9444/SecKMS/1.0/business/user/createBusinessUser",entity, Result.class);
        System.out.println(JSON.toJSONString(resultResponseEntity.getBody()));
    }
}