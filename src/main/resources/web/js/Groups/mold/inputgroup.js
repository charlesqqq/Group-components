/* inputgroup.js

		Purpose:
                
		Description:
                
		History:
				Thu Mar 07 16:51:03 CST 2019, Created by charlesqiu

Copyright (C) 2019 Potix Corporation. All Rights Reserved.

*/
function (out) {
	out.push('<div ', this.domAttrs_(), '>');
	for (var w = this.firstChild; w; w = w.nextSibling) {
		if (w.$instanceof(zul.wgt.Label)) {
			out.push('<div id="', this.uuid, '-label" class="', this.$s('label'), '">');
			w.redraw(out);
			out.push('</div>');
		} else
			w.redraw(out);
	}
	out.push('</div>');
}