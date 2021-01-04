package cn.linkpower.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.linkpower.json.Results;
import cn.linkpower.vo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "测试处理类1")
public class TestController {
	
	@GetMapping("/test1")
	@ApiOperation(value = "测试请求接口1",notes = "test1")
	@ApiImplicitParam(name = "id", value = "测试参数1", paramType = "query", required = true, dataType = "String")
	public Results test1(String id) {
		return Results.ok;
	}
	
	@GetMapping("/test2")
	@ApiOperation(value = "获取用户实例",notes = "test2")
	@ApiImplicitParam(name = "id", value = "用户编号", paramType = "query", required = true, dataType = "Integer")
	public User test2(Integer id) {
		return new User(id,"香蕉"+id,id);
	}
}
