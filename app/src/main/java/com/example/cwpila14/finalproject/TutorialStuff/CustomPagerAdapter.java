package com.example.cwpila14.finalproject.TutorialStuff;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cwpila14.finalproject.R;

/**
 * Created by cwpila14 on 11/5/2016.
 */

public class CustomPagerAdapter extends PagerAdapter {

    private Context mContext;

    public CustomPagerAdapter(Context context) {
        mContext = context;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        CustomPagerEnum customPagerEnum = CustomPagerEnum.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(customPagerEnum.getLayoutResId(), collection, false);
        collection.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return CustomPagerEnum.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        CustomPagerEnum customPagerEnum = CustomPagerEnum.values()[position];
        return mContext.getString(customPagerEnum.getTitleResId());
    }

    public enum CustomPagerEnum {

        //RED(R.string.red, R.layout.view_red),
        //BLUE(R.string.blue, R.layout.view_blue),
        //ORANGE(R.string.orange, R.layout.view_orange);

        MAP(R.string.Map, R.layout.view_instruction1),
        BUTTONS(R.string.Buttons, R.layout.view_buttons),
        ELITE(R.string.Elite ,R.layout.view_elite),
        POKECENTER(R.string.Pokecenter, R.layout.view_pokecenter),
        POKEDEX(R.string.Pokedex, R.layout.view_pokedex),
        BAG(R.string.Bag, R.layout.view_bag),
        MASTERBALL(R.string.masterball, R.layout.view_masterball),
        POTION(R.string.potion, R.layout.view_potion),
        SETTINGS(R.string.Settings, R.layout.view_settings),
        ELITEFOUR(R.string.EliteFour, R.layout.view_elite4);

        private int mTitleResId;
        private int mLayoutResId;

        CustomPagerEnum(int titleResId, int layoutResId) {
            mTitleResId = titleResId;
            mLayoutResId = layoutResId;
        }

        public int getTitleResId() {
            return mTitleResId;
        }

        public int getLayoutResId() {
            return mLayoutResId;
        }

    }


}
