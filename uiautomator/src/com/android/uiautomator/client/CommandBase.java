package com.android.uiautomator.client;

import javax.xml.parsers.ParserConfigurationException;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author xdf
 *
 */
public abstract class CommandBase {
	/**
	 * @param data
	 * @param string
	 * @return res
	 * @throws JSONException
	 */
	protected String success(Object data) throws JSONException {
		JSONObject res = new JSONObject();
		JSONObject resTmp = new JSONObject();
		resTmp.put("status", Status.Success.getStatusCode());
		resTmp.put("value", data);
		res.put("success", true);
		res.put("data", resTmp);
		return res.toString();
	}

	/**
	 * @param status
	 * @return res
	 * @throws JSONException
	 */
	protected String failed(Status status) throws JSONException {
		JSONObject res = new JSONObject();
		JSONObject resTmp = new JSONObject();
		resTmp.put("status", status.getStatusCode());
		resTmp.put("value", status.getStatusDes());
		res.put("success", true);
		res.put("data", resTmp);
		return res.toString();
	}

	/**
	 * @param args
	 * @return res
	 * @throws JSONException
	 * @throws ParserConfigurationException
	 */
	public String execute(JSONObject args) throws JSONException,
			ParserConfigurationException {
		return null;
	}
}
