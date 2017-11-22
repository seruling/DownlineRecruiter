package my.wargames.skimcepatkaya.downlinerecruiter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void checkCreds(View view) {
        EditText usernameText = (EditText) findViewById(R.id.username);
        String username = usernameText.getText().toString();
        EditText passwordText = (EditText) findViewById(R.id.password);
        String password = passwordText.getText().toString();
        TextView errmsgTextview = (TextView) findViewById(R.id.errmsg);
        String correct_username = "nasi";
        String correct_password = "air";
        String ifnotcorrect = "Please try again";
        String ifcorrect = "Signing in...";
        if ((username.equals(correct_username)) && (password.equals(correct_password))) {
            errmsgTextview.setText(ifcorrect);
            Intent intent = new Intent(this, AddDownline.class);
            startActivity(intent);
        }
        else {
            errmsgTextview.setText(ifnotcorrect);
        }
    }
}
