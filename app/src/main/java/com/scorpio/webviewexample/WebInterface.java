package com.scorpio.webviewexample;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by Ayush Bansal on 18-02-2017.
 */

public class WebInterface {

    Context c;

    public WebInterface(Context context){
        c = context;
    }

    @JavascriptInterface
    public void showToast(String toast){
        Toast.makeText(c,toast,Toast.LENGTH_SHORT).show();
    }

}
