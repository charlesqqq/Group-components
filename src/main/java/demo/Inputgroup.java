/* Inputgroup.java

		Purpose:
                
		Description:
                
		History:
				Thu Mar 07 16:33:47 CST 2019, Created by charlesqiu

Copyright (C) 2019 Potix Corporation. All Rights Reserved.
*/
package demo;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.UiException;
import org.zkoss.zul.Label;
import org.zkoss.zul.impl.InputElement;
import org.zkoss.zul.impl.XulElement;

public class Inputgroup extends XulElement {
	private boolean _vertical;

	public boolean isVertical() {
		return _vertical;
	}

	public void setVertical(boolean vertical) {
		if (_vertical != vertical) {
			_vertical = vertical;
			smartUpdate("vertical", _vertical);
		}
	}

	@Override
	public void beforeChildAdded(Component child, Component insertBefore) {
		if (!(child instanceof Label) && !(child instanceof InputElement)) {
			throw new UiException("Unsupported child: " + child);
		}
		super.beforeChildAdded(child, insertBefore);
	}

	protected void renderProperties(org.zkoss.zk.ui.sys.ContentRenderer renderer)
			throws java.io.IOException {
		super.renderProperties(renderer);
		render(renderer, "vertical", _vertical);
	}
}
