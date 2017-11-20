package duy.cong.tg2.moneyfpts;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import duy.cong.tg2.moneyfpts.adapter.MyAdapter;

public class HomeActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    MyAdapter myAdapter;


    Toolbar toolbar;
    DrawerLayout drawerLayout;
    ActionBar actionBar;
    NavigationView navigationView;
    FragmentManager fragmentManager;
    FragmentTransaction transaction;


    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initNavigation();
        addEvents();
        img = findViewById(R.id.imgtb);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomeActivity.this, "aaaaaaaaaaaaaaaaa" , Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initNavigation() {
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        myAdapter = new MyAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myAdapter);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        actionBar = getSupportActionBar();

        actionBar.setDisplayHomeAsUpEnabled(true);
        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle
                (HomeActivity.this, drawerLayout, R.string.open, R.string.close);
        drawerToggle.syncState();

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        navigationView = (NavigationView) findViewById(R.id.navigationView);
        navigationView.setItemIconTintList(null);
    }
    private void setupTabIcons() {
        tabLayout.getTabAt(0);
        tabLayout.getTabAt(1);
        tabLayout.getTabAt(2);
        tabLayout.getTabAt(3);
        tabLayout.getTabAt(4);
        tabLayout.getTabAt(5);
        tabLayout.getTabAt(6);


    }
    private void addEvents() {
//


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                fragmentManager = getSupportFragmentManager();
                transaction = fragmentManager.beginTransaction();
                switch (item.getItemId()) {
                    case R.id.mnu1:
                        /*FragmentTrangChu fragmentTrangChu = new FragmentTrangChu();
                        transaction.replace(R.id.drawer, fragmentTrangChu);
                        Toast.makeText(MainActivity.this, "AHIHI", Toast.LENGTH_SHORT).show();
                        transaction.commit();
                        drawerLayout.closeDrawer(GravityCompat.START);*/
                        viewPager.setCurrentItem(0);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.mnu2:
//                        FragmentDanhSachCongViec fragmentDanhSachCongViec = new FragmentDanhSachCongViec();
//                        transaction.replace(R.id.drawer, fragmentDanhSachCongViec);
//                        transaction.commit();
//                        drawerLayout.closeDrawer(GravityCompat.START);
                        viewPager.setCurrentItem(1);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.mnu3:
//                        FragmentCongViecChuaHoanThanh fragmentCongViecChuaHoanThanh = new FragmentCongViecChuaHoanThanh();
//                        transaction.replace(R.id.drawer, fragmentCongViecChuaHoanThanh);
//                        transaction.commit();
//                        drawerLayout.closeDrawer(GravityCompat.START);
                        viewPager.setCurrentItem(2);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.mnu4:
                        viewPager.setCurrentItem(3);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.mnu5:
                        viewPager.setCurrentItem(4);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;



                }
                return true;
            }
        });
    }
}
