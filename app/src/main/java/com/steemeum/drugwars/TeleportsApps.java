
package com.steemeum.drugwars;



import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class TeleportsApps extends AppCompatActivity {

    private WebView webview;



    //makes sure the website is refreshed (no cached version)
            @Override
            protected void onResume(){
                super.onResume();
                webview.reload();
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

            //DomStorage
            webview.getSettings().setDomStorageEnabled(true);

            webview.setOverScrollMode(WebView.OVER_SCROLL_NEVER);


            webview.getSettings().setLoadWithOverviewMode(true);
            webview.getSettings().setUseWideViewPort(true);

            //Teleports url
            webview.loadUrl("https://techtek.github.io/Teleports/index.html");





    }



}