package net.thelongtake.blogreader;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.net.URL;
import java.net.URLEncoder;


public class MainActivity extends ActionBarActivity {

    public final static String EXTRA_URL = "net.thelongtake.blogreader.URL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //Open the blog reader page when the user clicks the main button
    public void displayBlog(View view){
        Intent intent = new Intent(this,OpenBlogPost.class);

        //for now, use a static sample blog url
        //URL blogURL= new URL("http://thelongtake.net/2014/12/26/film-favorites-up/");
        //intent.putExtra(EXTRA_URL,blogURL);
        startActivity(intent);
    }
}
