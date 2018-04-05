package ztml.dev.ngokhacbac.viewpagerandtaplayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class PagerAdapterABC extends PagerAdapter {

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }

//    @Override
//    public Fragment getItem(int position) {
//        Fragment fag = null;
//        switch (position) {
//            case 0:
//                fag = new FragmentOne();
//                break;
//            case 1:
//                fag = new FragmentTwo();
//                break;
//            case 2:
//                fag = new FragmentThree();
//                break;
//            case 3:
//                fag = new Fragment_four();
//                break;
//        }
//        return fag;
//    }
//
//    @Override
//    public int getCount() {
//        return 4;
//    }
//
//    @Override
//    public CharSequence getPageTitle(int position) {
//        String title = "";
//        switch (position) {
//            case 0:
//                title = "One";
//                break;
//            case 1:
//                title = "Two";
//                break;
//            case 2:
//                title = "Three";
//                break;
//            case 3:
//                title = "Four";
//                break;
//
//        }
//
//        return title;
//    }
}
