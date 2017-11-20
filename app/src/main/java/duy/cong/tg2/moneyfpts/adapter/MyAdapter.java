package duy.cong.tg2.moneyfpts.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import duy.cong.tg2.moneyfpts.fragment.FragmentChuaDen;
import duy.cong.tg2.moneyfpts.fragment.FragmentCongViecChuaHoanThanh;
import duy.cong.tg2.moneyfpts.fragment.FragmentCongViecDaHoanThanh;
import duy.cong.tg2.moneyfpts.fragment.FragmentCongViecDaQua;
import duy.cong.tg2.moneyfpts.fragment.FragmentDanhSachCongViec;
import duy.cong.tg2.moneyfpts.fragment.FragmentGGMap;
import duy.cong.tg2.moneyfpts.fragment.FragmentTrangChu;


/**
 * Created by admin on 10/15/2017.
 */

public class MyAdapter extends FragmentStatePagerAdapter {
    FragmentTrangChu fragmentTrangChu;
    FragmentDanhSachCongViec fragmentDanhSachCongViec;
    FragmentCongViecChuaHoanThanh fragmentCongViecChuaHoanThanh;
    FragmentCongViecDaHoanThanh fragmentCongViecDaHoanThanh;
    FragmentChuaDen fragmentChuaDen;
    FragmentCongViecDaQua fragmentCongViecDaQua;
    FragmentGGMap fragmentGGMap;
    Context context;
    String[] listFragment = {"Trang chủ", "Toàn bộ công việc", "Công việc chưa hoàn thành", "Công việc đã hoàn thành", "Công việc chưa đến", "Công việc đã qua","Google Map"};

    public MyAdapter(FragmentManager fm) {
        super(fm);
//        fragmentTrangChu=new FragmentTrangChu();
//        fragmentDanhSachCongViec=new FragmentDanhSachCongViec();
//        fragmentCongViecChuaHoanThanh=new FragmentCongViecChuaHoanThanh();
//        fragmentCongViecDaHoanThanh = new FragmentCongViecDaHoanThanh();
//        fragmentChuaDen =new FragmentChuaDen();
//        fragmentCongViecDaQua=new FragmentCongViecDaQua();
    }


    @Override
    public Fragment getItem(int position) {
        fragmentTrangChu = new FragmentTrangChu();
        fragmentDanhSachCongViec = new FragmentDanhSachCongViec();
        fragmentCongViecChuaHoanThanh = new FragmentCongViecChuaHoanThanh();
        fragmentCongViecDaHoanThanh = new FragmentCongViecDaHoanThanh();
        fragmentChuaDen = new FragmentChuaDen();
        fragmentCongViecDaQua = new FragmentCongViecDaQua();


        if (position == 0)
        {
            fragmentTrangChu = new FragmentTrangChu();
            return fragmentTrangChu;
        }
        else if (position == 1) {
            fragmentDanhSachCongViec = new FragmentDanhSachCongViec();
            return fragmentDanhSachCongViec;
        }
        else if (position == 2) {
            fragmentCongViecChuaHoanThanh = new FragmentCongViecChuaHoanThanh();
            return fragmentCongViecChuaHoanThanh;
        }
        else if (position == 3) {
            fragmentCongViecDaHoanThanh = new FragmentCongViecDaHoanThanh();
            return fragmentCongViecDaHoanThanh;
        }
        else if (position == 4) {
            fragmentChuaDen = new FragmentChuaDen();
            return fragmentChuaDen;
        }
        else if (position == 5) {
            fragmentCongViecDaQua = new FragmentCongViecDaQua();
            return fragmentCongViecDaQua;
        }
        else if (position == 6) {
            fragmentGGMap = new FragmentGGMap();
            return fragmentGGMap;
        }
        return null;
    }




    @Override
    public int getCount() {
        return listFragment.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return listFragment[position];
    }

//    @Override
//    public void destroyItem(ViewGroup container, int position, Object object) {
//       container.removeView((View) object);
//    }
}
