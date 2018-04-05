package ztml.dev.ngokhacbac.viewpagerandtaplayout;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentThree extends Fragment {
    public FragmentThree() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_three, container, false);
        Log.i("TAG", "onCreateView - FragmentThree");
        return view;
    }

    @Override
    public void onAttach(Context context) {

        super.onAttach(context);
        Log.i("TAG", "onAttach - FragmentThree");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("TAG", "onDestroy - FragmentThree");
    }
}
