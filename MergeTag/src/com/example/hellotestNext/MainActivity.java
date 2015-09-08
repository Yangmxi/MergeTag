
package com.example.hellotestNext;

import com.example.hellotest2.R;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

    private SettingItemView siv_update;
    private SharedPreferences sp_update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        siv_update = (SettingItemView) findViewById(R.id.siv_update);
        sp_update = getSharedPreferences("config", MODE_PRIVATE);
        boolean update = sp_update.getBoolean("update", false);
        if (update) {
            siv_update.SetChecked(true);
            siv_update.SetDesc("有新版本则更新");
        }
        else
        {
            siv_update.SetChecked(false);
            siv_update.SetDesc("停止更新");
        }
        siv_update.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Editor editor = sp_update.edit();
                // TODO Auto-generated method stub
                if (siv_update.isChecked()) {
                    siv_update.SetChecked(false);
                    siv_update.SetDesc("停止更新");
                    editor.putBoolean("update", false);
                }
                else {
                    siv_update.SetChecked(true);
                    siv_update.SetDesc("有新版本则更新");
                    editor.putBoolean("update", true);
                }
            }
        });
    }

}
