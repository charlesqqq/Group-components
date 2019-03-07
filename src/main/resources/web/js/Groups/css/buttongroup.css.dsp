<%@ taglib uri="http://www.zkoss.org/dsp/web/core" prefix="c" %>

.z-buttongroup {
	display: inline-flex;
}

.z-buttongroup-vertical {
	flex-direction: column;
}

.z-buttongroup .z-button {
	border-radius: 0;
}

.z-buttongroup:not(.z-buttongroup-vertical) .z-button:first-Child {
	border-top-left-radius: 4px;
	border-bottom-left-radius: 4px;
}

.z-buttongroup:not(.z-buttongroup-vertical) .z-button:last-Child {
	border-top-right-radius: 4px;
	border-bottom-right-radius: 4px;
}

.z-buttongroup-vertical .z-button:first-Child {
	border-top-left-radius: 4px;
	border-top-right-radius: 4px;
}

.z-buttongroup-vertical .z-button:last-Child {
	border-bottom-left-radius: 4px;
	border-bottom-right-radius: 4px;
}