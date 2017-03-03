package geidea.net.mpos.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import geidea.net.mpos.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.input_user_name)
    EditText user_name;

    @BindView(R.id.input_password)
    EditText password;

    @BindView(R.id.login)
    Button login;

    @BindView(R.id.chech_remember)
    CheckBox rember_me;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        login.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {
        startActivity(new Intent(LoginActivity.this,HomeActivity.class));
    }
}
