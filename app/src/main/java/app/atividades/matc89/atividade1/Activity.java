package app.atividades.matc89.atividade1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.EditText;

public class Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        String site = "";
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            site = extras.getString("Site");
        }

        WebView myWebView = (WebView) findViewById(R.id.web_view);
        if (myWebView != null) {
            myWebView.loadUrl("http://" + site);
        }
    }
}
