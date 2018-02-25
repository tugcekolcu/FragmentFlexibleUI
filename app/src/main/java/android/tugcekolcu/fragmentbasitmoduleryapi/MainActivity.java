package android.tugcekolcu.fragmentbasitmoduleryapi;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends Activity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(int index) {

        FragmentManager fm = getFragmentManager();
        FragmentB f2 = (FragmentB) fm.findFragmentById(R.id.fragmentB);
        f2.editTextView(index);
    }
}
