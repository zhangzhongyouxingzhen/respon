package com.example.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.entity.Client;
import com.example.mapper.ClientMapper;
import com.example.mapper.RuMapper;
import com.example.result.R;
import com.example.result.Result;
import com.example.service.ClientService;
import com.example.until.Ru;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "客户" )
@RestController
@RequestMapping("/admin/client")
public class ClientController {
    @Autowired
    private ClientService clientService;
    @Autowired
    private ClientMapper clientMapper;
//    @CrossOrigin
    @ApiOperation(value = "查询数据")
    @GetMapping("/cli")
    public Result findAll(){
        List<Client> list= clientMapper.getTypeName();
        System.out.println(list);
        return Result.ok(list);
    }
//    @CrossOrigin
//    @ApiOperation(value = "新增客户")
//    @GetMapping("saveCli")
//    @ResponseBody
//    public Result saveClient(@RequestParam("cname")String cname,@RequestParam("create_time")String create_time,@RequestParam("name")String name,@RequestParam("organ_num")int organ_num,@RequestParam("law_person")String law_person,@RequestParam("phone")String phone,@RequestParam("tid")int tid,@RequestParam("staff")int staff,@RequestParam("now_location")String now_location,@RequestParam("location")String location,@RequestParam("comment")String comment) {
//        int num = clientMapper.insert(cname, create_time, name, organ_num, law_person, phone, tid, staff, now_location, location, comment);
//        if (num > 0) {
//            return Result.ok();
//        } else
//            return Result.fail();
//    }
@ApiOperation(value = "新增书籍")
@PostMapping("saveCli")
public R saveClient(@RequestBody Client client) {
    boolean flag = clientService.save(client);
    if (flag)
        return R.OK();
    else
        return R.ERROR();
}
    @ApiOperation(value = "修改客户")
    @PutMapping("updateCli")
    public Result updateBook(@RequestBody Client client) {
        boolean flag = clientService.updateById(client);
        if (flag){
            return Result.ok();
        }
        else
            return Result.fail();
    }
    @ApiOperation(value = "根据 ID 删除客户信息")
    @DeleteMapping("del/{cliId}")
//    @ResponseBody()
//    @CrossOrigin
    public Result deleteClientById(@PathVariable("cliId") String cid ) {
        boolean flag = clientService.removeById(cid);
        if (flag)
            return Result.ok();
        else
            return Result.fail();
    }

    @ApiOperation(value = "根据条件进行分页查询 - 书籍")
    @PostMapping("{pageNo}/{pageSize}")
    public R findPageBook(
            @ApiParam(name = "pageNo", value = "页码", required = true)
            @PathVariable("pageNo") Long pageNo,
            @ApiParam(name = "pageSize", value = "每页最大条数", required = true)
            @PathVariable("pageSize") Long pageSize,
            @ApiParam(name = "bookQuery", value = "查询条件封装对象", required = false)
            @RequestBody(required = false) Ru ru) {
        Page<Client> clientPage = new Page<>(pageNo, pageSize);
        clientService.findPageBook(clientPage, ru);
        long total = clientPage.getTotal();
        List<Client> clientList = clientPage.getRecords();
        return R.OK().data("total", total).data("items", clientList);
    }
    @ApiOperation(value = "根据 ID 获取书籍")
    @GetMapping("getClientCid/{clientCid}")
    public R getClientById(@PathVariable("clientCid") String ClientCid) {
        Client client = clientService.getById(ClientCid);
        return R.OK().data("client", client);
    }
    @RestController
    @RequestMapping("/admin/user")
//    @CrossOrigin
    public class LoginController {

        @PostMapping("login")
        public R login() {
            return R.OK().data("token", "admin");
        }

        @GetMapping("info")
        public R info() {
            return R.OK().data("roles", "[admin]").data("name", "admin");
        }

    }
}