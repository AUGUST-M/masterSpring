package com.baobaotao.domain;

import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable
{
	private int logLogId;
	private int userId;
	private String ip;
	private Date loginDate;
	public int getLogLogId()
	{
		return logLogId;
	}
	public void setLogLogId(int logLogId)
	{
		this.logLogId = logLogId;
	}
	public int getUserId()
	{
		return userId;
	}
	public void setUserId(int userId)
	{
		this.userId = userId;
	}
	public String getIp()
	{
		return ip;
	}
	public void setIp(String ip)
	{
		this.ip = ip;
	}
	public Date getLoginDate()
	{
		return loginDate;
	}
	public void setLoginDate(Date loginDate)
	{
		this.loginDate = loginDate;
	}
	
	
}
