package com.developersguide.junit;

public class UserNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;
	private int errCode;

    public UserNotFoundException(int errCode, String message) {
        super(message);
        this.errCode = errCode;
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }
}
