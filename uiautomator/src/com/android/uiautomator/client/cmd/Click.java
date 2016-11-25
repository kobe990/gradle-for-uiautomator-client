package com.android.uiautomator.client.cmd;

import com.android.uiautomator.client.Status;
import org.json.JSONException;
import org.json.JSONObject;

import com.android.uiautomator.client.Elements;
import com.android.uiautomator.client.CommandBase;
import com.android.uiautomator.client.Element;
import android.support.test.uiautomator.UiObjectNotFoundException;

/**
 * @author xdf
 */
public class Click extends CommandBase {
    @Override
    public String execute(JSONObject args) throws JSONException {
        try {
            String elementId = (String) args.get("elementId");
            Element el = Elements.getGlobal().getElement(elementId);

            el.click();
            return success(true);
        } catch (final UiObjectNotFoundException e) {
            return failed(Status.NoSuchElement);
        } catch (final Exception e) {
            return failed(Status.UnknownError);
        }
    }
}