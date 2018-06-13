package com.example.binod.newsapp.utilities;

import android.text.TextUtils;
import android.util.Log;
import android.widget.EditText;

public class FormValidation {

    public FormValidation() {

    }

    public boolean isEmpty(EditText etText, String msg){
        String text = etText.getText().toString();

        if(TextUtils.isEmpty(text)){
            etText.setError(msg);
            return true;
        }
        etText.setError(null);
        return false;
    }

    public boolean inRange(EditText etText,String msg,int minLength,int maxLength){
        String text = etText.getText().toString();

        if(text.length()>=minLength && text.length()<=maxLength){
            etText.setError(null);
            return true;
        }
        etText.setError(msg);
        return false;
    }


}
