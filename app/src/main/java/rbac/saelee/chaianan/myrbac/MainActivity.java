package rbac.saelee.chaianan.myrbac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import rbac.saelee.chaianan.myrbac.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add Fragment
        if (savedInstanceState == null) {
            MainFragment mainFragment = new MainFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.maicontainer,mainFragment)
                    .commit();
        }
    }   //Main Nethod
}       //Main class
