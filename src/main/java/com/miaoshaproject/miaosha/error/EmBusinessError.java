package com.miaoshaproject.miaosha.error;

public enum EmBusinessError implements  CommonError {
    //10000xx general error
    PARAM_INVALID(100001, "Params invalid"),
    UNKNOWN_ERROR(100002, "Unknown error"),

    //20000xx means user related error
    USER_NOT_EXIST(200001, "User does not exist"),
    USER_CREDENTIAL_INCORRECT(200002, "User credentials incorrect")
    ;

    private int errCode;
    private String errMsg;

    private EmBusinessError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    @Override
    public int getErrorCode() {
        return this.errCode;
    }

    @Override
    public String getErrorMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrorMsg(String errorMsg) {
        this.errMsg = errorMsg;
        return this;
    }
}
