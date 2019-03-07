package test.ctrl;

import demo.Buttongroup;
import demo.Inputgroup;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;

public class TestComposer extends SelectorComposer {

	@Wire
	private Buttongroup bg;
	@Wire
	private Inputgroup ig;

	@Listen("onClick = #vertical")
	public void vertical() {
		bg.setVertical(!bg.isVertical());
		ig.setVertical(!ig.isVertical());
	}

	@Listen("onClick = #addBtn")
	public void addBtn() {
		bg.appendChild(new Button("NB"));
	}

}