package com.example.mypegasus.learnrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by MyPegasus on 2015/8/11.
 */
class MyAdapter extends RecyclerView.Adapter {

 	class ViewHolder extends RecyclerView.ViewHolder {

		private View root;
		private TextView tvTitle, tvContent;

		public ViewHolder(View root) {
			super(root);
			tvTitle = (TextView) root.findViewById(R.id.tv_title);
			tvContent = (TextView) root.findViewById(R.id.tv_content);
		}

		public TextView getTvTitle() {
			return tvTitle;
		}

		public TextView getTvContent() {
			return tvContent;
		}
	}

	@Override
	public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
//		return new ViewHolder(new TextView(viewGroup.getContext()));
		return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_cell, null));
	}

	@Override
	public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
		ViewHolder vh = (ViewHolder) viewHolder;
//				vh.getTv().setText("item " + i);
//		vh.getTv().setText(mainActivity.data[i]);
		CellData cd = data[i];
		vh.getTvTitle().setText(cd.getTitle());
		vh.getTvContent().setText(cd.getContent());
	}

	@Override
	public int getItemCount() {
		return data.length;
	}


	private CellData[] data = new CellData[]{new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育"), new CellData("新闻", "这条新闻真不错"), new CellData("极客学院", "IT职业教育")};
	//private String[] data = new String[]{"Hello", "jikexueyuan", "ime"};
}
