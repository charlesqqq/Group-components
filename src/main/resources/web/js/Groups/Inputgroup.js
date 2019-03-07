/* Inputgroup.js

		Purpose:
                
		Description:
                
		History:
				Thu Mar 07 16:51:36 CST 2019, Created by charlesqiu

Copyright (C) 2019 Potix Corporation. All Rights Reserved.

*/
(function () {

Groups.Inputgroup = zk.$extends(zul.Widget, {
	_vertical: false,
	$define: {
		vertical: function(v) {
			if (this.desktop) {
				jq(this.$n()).toggleClass(this.$s('vertical'), v);
			}
		}
	}
});
})();