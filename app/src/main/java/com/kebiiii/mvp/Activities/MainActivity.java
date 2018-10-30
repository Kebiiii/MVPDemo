package com.kebiiii.mvp.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.kebiiii.mvp.Model.PresentImplement;
import com.kebiiii.mvp.Presenter.Presenter;
import com.kebiiii.mvp.R;
import com.kebiiii.mvp.View.LoginView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,LoginView {

    TextView visit ;
    EditText username,password;

    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        visit = findViewById(R.id.test);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);


        visit.setOnClickListener(this);

        presenter = new PresentImplement(MainActivity.this);

    }

    @Override
    public void onClick(View view) {
        String name = username.getText().toString();
        String password = username.getText().toString();

        presenter.performLog(name,password);

    }


    @Override
    public void loginValidations() {
        Toast.makeText(this, "Please enter name and password", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(this, "success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginError() {
        Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
    }
}
