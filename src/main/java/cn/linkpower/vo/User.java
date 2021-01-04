package cn.linkpower.vo;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("用户实体类")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@ApiModelProperty("用户主键")
	private Integer id;
	@ApiModelProperty("用户名称")
	private String name;
	@ApiModelProperty("用户年龄")
	private Integer age;
}
