package Test;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;

/**
 * @Author: WeiBingtao/13156050650@163.com
 * @Version: 1.0
 * @Description:
 * @Date: 2019/7/20 16:15
 */
@Data
@ApiModel(value = "LoginModel",description = "登录实体")
public class LoginModel {
    @NotBlank(message = "UserName cannot be blank")
    @ApiModelProperty(value = "操作员名称", dataType = "string", name = "userName", example = "oper", required = true, hidden = false)
    String userName;
    @ApiModelProperty(value = "登录凭证", dataType = "string", name = "credential", example = "ZDQ3Y2UxN2U5ODcz......", required = true, hidden = false)
    @NotBlank(message = "Credential cannot be blank")
    String credential;
    @ApiModelProperty(value = "认证方式", name = "type", example = "1", required = true, hidden = false)
    @Range(min = 1, max = 2, message = "Authentication type not valid: certificate is 1; password is 2")
    Integer type;
}
