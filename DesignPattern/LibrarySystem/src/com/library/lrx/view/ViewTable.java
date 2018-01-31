package com.library.lrx.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.library.lrx.controller.DataControl;

public class ViewTable extends JFrame {
	// 默认表格模型
	private DefaultTableModel model = null;
	private JTable table = null;

	public ViewTable() {
		super("ViewTable");
		String[][] datas = {};
		String[] titles = { "图书编号", "书名", "作者", "类型" };
		model = new DefaultTableModel(datas, titles);
		table = new JTable(model);

		ArrayList<String> s = new ArrayList<String>();
		DataControl dc = new DataControl();
		try {
			dc.Operate();
			s = dc.View();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (String str : s) {
			String[] col = str.split(",");
			model.addRow(new String[] { col[0], col[1], col[2], col[3] });
		}

		add(new JScrollPane(table));
		setSize(600, 600);
		setLocationRelativeTo(null);
		setVisible(true);

	}
}
