package ztml.dev.ngokhacbac.viewpagerandtaplayout;


import android.support.v4.app.FragmentManager;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ViewPager mViewPager;
    TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = findViewById(R.id.view_pager_main);
        mTabLayout = findViewById(R.id.taplayout_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        PagerAdapterABC pagerAdapter = new PagerAdapterABC(fragmentManager);
        mViewPager.setAdapter(pagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager); // không có thì ko thể forcus với adapter
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));// không dùng hàn này vẫn chạy ??
        mTabLayout.setTabsFromPagerAdapter(pagerAdapter); // không dùng hàn này vẫn chạy ??

    }
}
