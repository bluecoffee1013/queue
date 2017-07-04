package com.bluecoffee.queue.service;

import com.bluecoffee.queue.mapper.SysAdminMapper;
import com.bluecoffee.queue.domain.SysAdmin;
import com.bluecoffee.queue.dto.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by qianlong on 2017/7/3.
 */
@Service
public class SysAdminService {

    @Autowired
    private SysAdminMapper sysAdminMapper;

    public BaseResult adminLogin(String loginAccount,String pwd){
        SysAdmin queryCond = new SysAdmin();
        queryCond.setLoginAccount(loginAccount);
        queryCond.setLoginPwd(pwd);

        List<SysAdmin> adminList = sysAdminMapper.selectByCond(queryCond);
        if(adminList == null || adminList.size() == 0){
            return BaseResult.setErrorResult("000001","登陆帐号或密码错误");
        }
        return BaseResult.setSuccessResult("管理员登陆成功");
    }
}
