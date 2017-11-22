package my.wargames.skimcepatkaya.downlinerecruiter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RegistrationDone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_done);
        TextView registerDpne = (TextView) findViewById(R.id.registrationCompleted);
        registerDpne.setText(R.string.registerDone);
        String ua=new WebView(this).getSettings().getUserAgentString();
//        registerDpne.setText(ua);
    }
}
