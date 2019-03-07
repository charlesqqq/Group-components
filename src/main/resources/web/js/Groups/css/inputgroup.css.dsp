<%@ taglib uri="http://www.zkoss.org/dsp/web/core" prefix="c" %>

.z-inputgroup {
	display: inline-flex;
}

.z-inputgroup-vertical {
	flex-direction: column;
}

.z-inputgroup-label {
	display: flex;
	background: #e9ecef;
	border: 1px solid #ced4da;
	padding: 6px 12px;
}

.z-inputgroup-label .z-label {
	display: flex;
	align-items: center;
}

.z-inputgroup * {
	border-radius: 0;
}

.z-inputgroup:not(.z-inputgroup-vertical) *:first-Child {
	border-top-left-radius: 4px;
	border-bottom-left-radius: 4px;
}

.z-inputgroup:not(.z-inputgroup-vertical) *:last-Child {
	border-top-right-radius: 4px;
	border-bottom-right-radius: 4px;
}

.z-inputgroup-vertical *:first-Child {
	border-top-left-radius: 4px;
	border-top-right-radius: 4px;
}

.z-inputgroup-vertical *:last-Child {
	border-bottom-left-radius: 4px;
	border-bottom-right-radius: 4px;
}