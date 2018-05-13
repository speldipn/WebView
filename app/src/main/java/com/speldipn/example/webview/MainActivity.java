package com.speldipn.example.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

  WebView webView;
  EditText editUrl;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    editUrl = findViewById(R.id.editUrl);
    webView = findViewById(R.id.webView);

    webView.setWebViewClient(new WebViewClient());
    webView.setWebChromeClient(new WebChromeClient());

    webView.getSettings().setJavaScriptEnabled(true);
    webView.getSettings().setSupportZoom(true);
    webView.getSettings().setBuiltInZoomControls(true);

    webView.loadUrl("http://m.naver.com");
  }

  public void onBack(View v) {
    webView.goBack();
  }

  public void onGoUrl(View v) {
    String url = editUrl.getText().toString();
    if (!url.equals("")) {
      if(!url.startsWith("http://")) {
        url = "http://" + url;
      }
      webView.loadUrl(url);
    }
  }
}
