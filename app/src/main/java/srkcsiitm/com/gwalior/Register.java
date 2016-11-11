package srkcsiitm.com.gwalior;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText e_name, e_last, e_contact, e_password;
    String name, l_name, contact, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        e_name = (EditText) findViewById(R.id.first_name);
        e_last = (EditText) findViewById(R.id.last_name);
        e_contact = (EditText) findViewById(R.id.cntct);
        e_password = (EditText) findViewById(R.id.newpass);


    }

    public void reguser(View view) {

        Background background = new Background(this);
        name = e_name.getText().toString();
        l_name = e_last.getText().toString();
        contact = e_contact.getText().toString();
        password = e_password.getText().toString();
        String method = "register";
        background.execute(method, name, l_name, contact, password);
        Intent intent = new Intent(this, GwaliorDiary.class);
        startActivity(intent);
        finish();
    }

    public void GoBack(View view) {
        Intent intent = new Intent(this, GwaliorDiary.class);
        startActivity(intent);

    }
}