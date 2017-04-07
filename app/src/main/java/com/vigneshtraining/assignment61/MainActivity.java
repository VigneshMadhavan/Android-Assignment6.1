package com.vigneshtraining.assignment61;





import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText txt;
    private Button btn;

    private WelcomeFragment myFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt=(EditText) findViewById(R.id.txt);
        btn= (Button) findViewById(R.id.submitBtn);
        btn.setOnClickListener(this);


        FragmentManager frgMng=getSupportFragmentManager();
        FragmentTransaction frgTxn=frgMng.beginTransaction();

        myFragment=new WelcomeFragment();
        frgTxn.add(R.id.fragmentContainer,myFragment);
        frgTxn.addToBackStack(WelcomeFragment.NAME);
        frgTxn.commit();

    }

    @Override
    public void onClick(View v) {

        if(txt.getText().toString().isEmpty()){
            Toast.makeText(this,"Please enter some text in the text field.",Toast.LENGTH_LONG).show();
        }else{
            myFragment.setMessage(txt.getText().toString());
        }



    }
}
