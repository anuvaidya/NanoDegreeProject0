package ex.myappportfolio;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mButton1, mButton2,mButton3, mButton4, mButton5, mButton6;
    private Toolbar mToolbar;
    private TextView mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setup();
        setupListener();


    }
    private void setup(){
        mToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(mToolbar);

        // This code changes the status bar in emulator. XML didn't change the status bar color
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary));
        }

        // Get access to the custom title view
        TextView mTitle = (TextView) mToolbar.findViewById(R.id.toolbar_title);
        mButton1 = (Button) findViewById(R.id.button1);
        mButton2 = (Button) findViewById(R.id.button2);
        mButton3 = (Button) findViewById(R.id.button3);
        mButton4 = (Button) findViewById(R.id.button4);
        mButton5 = (Button) findViewById(R.id.button5);
        mButton6 = (Button) findViewById(R.id.button6);
    }

    private void setupListener() {
        mButton1.setOnClickListener(mButton1Listener);
        mButton2.setOnClickListener(mButton2Listener);
        mButton3.setOnClickListener(mButton3Listener);
        mButton4.setOnClickListener(mButton4Listener);
        mButton5.setOnClickListener(mButton5Listener);
        mButton6.setOnClickListener(mButton6Listener);

    }
    private View.OnClickListener mButton1Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getBaseContext(),"This button will launch popular movies app",
                    Toast.LENGTH_SHORT).show();
        }
    };
    private View.OnClickListener mButton2Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getBaseContext(),"This button will launch stock hawk", Toast.LENGTH_SHORT).show();
        }
    };
    private View.OnClickListener mButton3Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getBaseContext(),"This button will launch build it bigger", Toast.LENGTH_SHORT).show();
        }
    };
    private View.OnClickListener mButton4Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getBaseContext(),"This button will launch make your own", Toast.LENGTH_SHORT).show();
        }
    };
    private View.OnClickListener mButton5Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getBaseContext(),"This button will launch ubiqutous app", Toast.LENGTH_SHORT).show();
        }
    };
    private View.OnClickListener mButton6Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getBaseContext(),"This button will launch capstone app", Toast.LENGTH_SHORT).show();
        }
    };
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
}
