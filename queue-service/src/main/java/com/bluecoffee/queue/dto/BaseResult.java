package com.bluecoffee.queue.dto;

/**
 * Created by qianlong on 2017/7/3.
 */
public class BaseResult {

    private int isSuccess;//1-成功 2-失败

    private String resultMsg;

    private String resultCode;//000000代表成功

    public BaseResult(){

    }

    public BaseResult(int isSuccess,String resultCode,String errDesc){
        this.isSuccess = isSuccess;
        this.resultCode = resultCode;
        this.resultMsg = errDesc;
    }

    public static BaseResult setSuccessResult(String resultMsg){
        return new BaseResult(1,"000000",resultMsg);
    }

    public static BaseResult setErrorResult(String errCode,String errMsg){
        return new BaseResult(2,errCode,errMsg);
    }

    public int getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(int isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        if(isSuccess == 1){
            sb.append("isSuccess=true"+"\n");
        }else{
            sb.append("isSuccess=false"+"\n");
        }
        sb.append("resultCode="+this.resultCode+"\n");
        sb.append("resultMsg="+this.resultMsg);
        return sb.toString();
    }
}
