package ngothuctridat.baikt1.baikt1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edtUN.getText().toString().trim();
                String password = edtPass.getText().toString().trim();
                String s ="maicuongtho";
                String a ="Cntt60ntu!";
                if(TextUtils.isEmpty(username)||TextUtils.isEmpty(password))
                {
                    Toast.makeText(MainActivity.this, "fill User and password", Toast.LENGTH_LONG).show();
                    return;
                }
                else if(username == s && password != a || username != s && password == a )
                {
                    Toast.makeText(MainActivity.this, "User and password is wrong", Toast.LENGTH_LONG).show();
                    return;
                }
                else
                {
                Toast.makeText(MainActivity.this, "User and password is correct", Toast.LENGTH_LONG).show();
                return;
                }
            }
        });
    }
}