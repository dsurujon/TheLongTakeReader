package net.thelongtake.blogreader;

import android.content.Intent;
import android.provider.DocumentsContract;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import org.w3c.dom.Document;

import java.net.URL;


public class OpenBlogPost extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        //String blogURL = intent.getStringExtra(MainActivity.EXTRA_URL);
        
        setContentView(R.layout.activity_open_blog_post);
        WebView webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://thelongtake.net/reviews/");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_open_blog_post, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            //Go back to main list of reviews
            case R.id.action_back_to_list:
                setContentView(R.layout.activity_open_blog_post);
                WebView webView = (WebView) findViewById(R.id.webview);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("http://thelongtake.net/reviews/");
                return true;
            case R.id.action_settings:
                return true;
            case R.id.action_search:
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
