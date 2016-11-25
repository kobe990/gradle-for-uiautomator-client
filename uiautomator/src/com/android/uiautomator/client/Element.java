package com.android.uiautomator.client;

import android.support.test.uiautomator.Configurator;
// import com.android.uiautomator.core.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiObject;

/**
 * @author xdf
 *
 */
public class Element {
	/**
	 *
	 */
	public UiObject element;
	/**
	 *
	 */
	public String id;

	/**
	 * @param id
	 * @param element
	 */
	Element(String id, UiObject element) {
		this.element = element;
		this.id = id;
	}

	/**
	 * @return res
	 * @throws UiObjectNotFoundException
	 */
	public boolean click() throws UiObjectNotFoundException {
		return element.click();
	}

	/**
	 * @return res
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return res
	 * @throws UiObjectNotFoundException
	 */
	public String getText() throws UiObjectNotFoundException {
		return element.getText();
	}

	/**
	 * @param text
	 * @return res
	 * @throws UiObjectNotFoundException
	 */
	public boolean setText(String text) throws UiObjectNotFoundException {
		System.out.println("fuck baby");
		Configurator config = Configurator.getInstance();
		config.setKeyInjectionDelay(500);
		Boolean success = element.setText(text);
		config.setKeyInjectionDelay(0);
		return success;
	}

	/**
	 * @throws UiObjectNotFoundException
	 */
	public void clearText() throws UiObjectNotFoundException {
		element.clearTextField();
	}

	/**
	 * @return res
	 * @throws UiObjectNotFoundException
	 */
	public boolean isDisplayed() throws UiObjectNotFoundException {
		return element.waitForExists(500);
	}
}
