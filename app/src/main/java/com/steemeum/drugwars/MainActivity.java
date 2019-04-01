
package com.steemeum.drugwars;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private WebView webview;


    
// Back button refreshes website
    public void onBackPressed()
    {
        //do activity
        this.startActivity(new Intent(MainActivity.this,MainActivity.class));

        return;
    }


    public void onGlobalLayout ()
    {
        //do activity
        this.startActivity(new Intent(MainActivity.this,MainActivity.class));

        return;
    }













    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);




        //make fullscreen
       View decorView = getWindow().getDecorView();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            decorView.setSystemUiVisibility(
                   View.SYSTEM_UI_FLAG_IMMERSIVE
                            // Set the content to appear under the system bars so that the
                            // content doesn't resize when the system bars hide and show.
                           | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            // Hide the nav bar and status bar
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN);
            }



        //load Webview

            webview =(WebView)findViewById(R.id.webView);

            webview.setWebViewClient(new WebViewClient());

            //JavaScript
            webview.getSettings().setJavaScriptEnabled(true);

            //Domstorage
            webview.getSettings().setDomStorageEnabled(true);

            webview.setOverScrollMode(WebView.OVER_SCROLL_NEVER);


            webview.getSettings().setLoadWithOverviewMode(true);
            webview.getSettings().setUseWideViewPort(true);

            //URL to Teleport, with reference Teleports
            webview.loadUrl("https://drugwars.io?ref=teleports");



    }



}