package com.jsy_jiaobao.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ExpandableListView;

public class CusExpandableListView extends ExpandableListView{

	public CusExpandableListView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
		super.onMeasure(widthMeasureSpec, expandSpec);
	}

}
