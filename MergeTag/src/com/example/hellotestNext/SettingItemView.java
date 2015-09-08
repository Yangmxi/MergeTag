
package com.example.hellotestNext;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.hellotest2.R;

public class SettingItemView extends RelativeLayout {
    private CheckBox cb_update;
    private TextView tv_update_title;
    private TextView tv_update_content;

    public SettingItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initView(context);
    }

    private void initView(Context context) {
        // TODO Auto-generated method stub
        View.inflate(context, R.layout.setting_item_view, this);
        cb_update = (CheckBox) findViewById(R.id.cb_isupdate);
        tv_update_title = (TextView) findViewById(R.id.tv_update_title);
        tv_update_content = (TextView) findViewById(R.id.tv_update_content);

    }

    public SettingItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public SettingItemView(Context context) {
        super(context);
        initView(context);
    }

    /**
     * 检查是否选中
     * @return
     */
    public boolean isChecked() {
        return cb_update.isChecked();
    }

    /**
     * 设置组合控件的状态
     * @param isChecked
     */
    public void SetChecked(boolean isChecked) {
        cb_update.setChecked(isChecked);
    }

    /**
     * 设置描述信息
     * @param isChecked
     */
    public void SetDesc(String text) {
        tv_update_content.setText(text);
    }
}
