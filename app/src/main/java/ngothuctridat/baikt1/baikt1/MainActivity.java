package ngothuctridat.baikt1.baikt1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnLogin;
    private TextView toastlogin,tvattempt;
    private EditText edtPass,edtUN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUN = (EditText) findViewById(R.id.edtUN);
        edtPass = (EditText) findViewById(R.id.edtPass);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        tvattempt = (TextView) findViewById(R.id.tvattempt);
        toastlogin = (TextView) findViewById(R.id.toastlogin);

        btnLogin.setOnClickListener();
    }
}