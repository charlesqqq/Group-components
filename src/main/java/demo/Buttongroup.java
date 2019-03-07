package demo;

import java.util.Collection;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.UiException;
import org.zkoss.zul.Button;
import org.zkoss.zul.impl.XulElement;

public class Buttongroup extends XulElement {
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

	public Collection<Button> getButtons() {
		return getChildren();
	}

	@Override
	public void beforeChildAdded(Component child, Component insertBefore) {
		if (!(child instanceof Button)) {
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

