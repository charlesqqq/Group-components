(function () {

Groups.Buttongroup = zk.$extends(zul.Widget, {
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