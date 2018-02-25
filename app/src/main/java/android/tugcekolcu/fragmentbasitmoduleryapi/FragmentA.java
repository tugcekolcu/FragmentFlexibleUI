package android.tugcekolcu.fragmentbasitmoduleryapi;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.zip.Inflater;

/**
 * Created by tugcekolcu on 25.02.2018.
 */



public class FragmentA extends Fragment implements AdapterView.OnItemClickListener{

    ListView listView;
    Communicator com;
    int myposition;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_a,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        listView = (ListView) getActivity().findViewById(R.id.lvList);
        com = (Communicator)getActivity();
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),R.array.Basliklar,android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        //listeyi adapter a bagladik.

        //yan donduruldugunde deger kaybetmemesi icin
        if(savedInstanceState!=null){
            myposition=savedInstanceState.getInt("position");
            com.respond(myposition);
        }

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        this.myposition=position;
        com.respond(myposition);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("position", myposition);
    }
}
