package android.tugcekolcu.fragmentbasitmoduleryapi;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by tugcekolcu on 25.02.2018.
 */

public class FragmentB extends Fragment {

    TextView tvAciklama;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_b,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        tvAciklama = (TextView) getActivity().findViewById(R.id.tvAciklama);

    }
    public void editTextView(int position){
        tvAciklama = (TextView) getActivity().findViewById(R.id.tvAciklama);
        Resources resources = getResources();
        String [] strAciklamalar = resources.getStringArray(R.array.Aciklamalar);
        tvAciklama.setText(strAciklamalar[position]);
    }
}
