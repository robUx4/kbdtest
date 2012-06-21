package com.levelup.kbdtest;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.widget.TextView;

public class KeyboardTestActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView av = (TextView) findViewById(R.id.AutoCompleted);
		av.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_AUTO_CORRECT);
        
		TextView avm = (TextView) findViewById(R.id.AutoCompletedMulti);
        avm.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_AUTO_CORRECT);
    }
}